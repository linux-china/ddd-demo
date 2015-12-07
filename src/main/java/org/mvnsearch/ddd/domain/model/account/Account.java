package org.mvnsearch.ddd.domain.model.account;

import org.mvnsearch.ddd.domain.annotations.DomainEntity;

import java.util.Date;

/**
 * account entity
 *
 * @author linux_china
 */
@DomainEntity
public class Account {
    private Long id;
    private String nick;
    private String password;
    private Integer status;
    private Date createdAt;

    public Account() {

    }

    public Account(Long id, String nick, String password) {
        this.id = id;
        this.nick = nick;
        this.password = password;
        this.status = 1;
        this.createdAt = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
