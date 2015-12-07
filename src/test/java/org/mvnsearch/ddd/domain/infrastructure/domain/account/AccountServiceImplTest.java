package org.mvnsearch.ddd.domain.infrastructure.domain.account;

import org.junit.Test;
import org.mvnsearch.ddd.DddDemoApplicationTests;
import org.mvnsearch.ddd.domain.model.account.Account;
import org.mvnsearch.ddd.domain.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

/**
 * account service implementation
 *
 * @author linux_china
 */
public class AccountServiceImplTest extends DddDemoApplicationTests {
    @Autowired
    private AccountService accountService;

    @Test
    public void testLogin() {
        Optional<Account> account = accountService.auth("Jacky", "123456");
        account.ifPresent(account1 -> System.out.println(account1.getNick()));
    }
}
