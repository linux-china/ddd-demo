package org.mvnsearch.ddd.domain.event;

import org.mvnsearch.ddd.domain.annotations.DomainEvent;
import org.mvnsearch.ddd.domain.events.BaseDomainEvent;
import org.mvnsearch.ddd.domain.model.account.Account;

/**
 * login event
 *
 * @author linux_china
 */
@DomainEvent
public class LoginEvent extends BaseDomainEvent<Account> {
    private String nick;
    private Account account;
    private boolean success;

    public LoginEvent() {
    }

    public LoginEvent(String nick, Account account) {
        super(nick);
        this.nick = nick;
        this.payload = account;
        this.account = account;
        this.success = true;
    }

    public LoginEvent(String nick) {
        super(nick);
        this.nick = nick;
        this.success = false;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}
