package org.mvnsearch.ddd.domain.service;

import org.mvnsearch.ddd.domain.annotations.DomainService;
import org.mvnsearch.ddd.domain.model.account.Account;

import java.util.Optional;

/**
 * account service
 *
 * @author linux_china
 */
@DomainService
public interface AccountService {

    Optional<Account> auth(String nick, String password);
}
