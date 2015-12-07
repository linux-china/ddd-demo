package org.mvnsearch.ddd.domain.infrastructure.domain.account;

import org.jetbrains.annotations.Nullable;
import org.mvnsearch.ddd.domain.model.account.Account;
import org.mvnsearch.ddd.domain.model.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * account repository implementation
 *
 * @author linux_china
 */
@Repository
public class AccountRepositoryImpl implements AccountRepository {
    private List<Account> accounts = new ArrayList<>();

    public AccountRepositoryImpl() {
        accounts.add(new Account(1L, "Jacky", "123456"));
        accounts.add(new Account(2L, "Tom", "123456"));
        accounts.add(new Account(3L, "Jenni", "123456"));
    }

    @Nullable
    public Optional<Account> findOne(Long id) {
        return accounts.stream().filter(account -> Objects.equals(account.getId(), id)).findFirst();
    }

    @Nullable
    public Optional<Account> findByNick(String nick) {
        return accounts.stream().filter(account -> account.getNick().equals(nick)).findFirst();
    }
}
