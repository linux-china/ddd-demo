package org.mvnsearch.ddd.controller;

import org.mvnsearch.ddd.domain.model.account.Account;
import org.mvnsearch.ddd.domain.model.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * account controller
 *
 * @author linux_china
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountRepository accountRepository;

    @RequestMapping("/{id}")
    public Account show(@PathVariable Long id) {
        Account account = accountRepository.findOne(id).get();
        if (account != null) {
            account.setPassword(null);
        }
        return account;
    }
}
