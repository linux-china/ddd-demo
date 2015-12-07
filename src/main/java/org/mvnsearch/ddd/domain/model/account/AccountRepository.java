package org.mvnsearch.ddd.domain.model.account;

import org.mvnsearch.ddd.domain.annotations.DomainRepository;

import java.util.Optional;

/**
 * account repository
 *
 * @author linux_china
 */
@DomainRepository
public interface AccountRepository {

    Optional<Account> findOne(Long id);

    Optional<Account> findByNick(String nick);
}
