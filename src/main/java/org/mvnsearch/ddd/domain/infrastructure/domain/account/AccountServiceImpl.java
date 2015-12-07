package org.mvnsearch.ddd.domain.infrastructure.domain.account;

import org.mvnsearch.ddd.domain.event.LoginEvent;
import org.mvnsearch.ddd.domain.model.account.Account;
import org.mvnsearch.ddd.domain.model.account.AccountRepository;
import org.mvnsearch.ddd.domain.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * account service implementation
 *
 * @author linux_china
 */
@Service
public class AccountServiceImpl implements AccountService {
    /**
     * event dispatcher
     */
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;
    @Autowired
    private AccountRepository accountRepository;

    public Optional<Account> auth(String nick, String password) {
        Optional<Account> account = accountRepository.findByNick(nick);
        //登录成功
        if (account.filter(t -> t.getPassword().equals(password) && t.getStatus() == 1).isPresent()) {
            applicationEventPublisher.publishEvent(new LoginEvent(nick, account.get()));
        } else { //登录失败
            applicationEventPublisher.publishEvent(new LoginEvent(nick));
        }
        return account;
    }
}
