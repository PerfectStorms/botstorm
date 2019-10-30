package org.perfectstorms.botstorms.entities;

import javax.persistence.*;

@Entity
@Table(name = "accounts")
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long accountId;

    @Column(name = "email")
    private String accountEmail;

    @Column(name = "phone")
    private String accountPhone;

    @Column(name = "login")
    private String accountLogin;

    @Column(name = "password")
    private String accountPassword;

    public AccountEntity() {
    }

    public AccountEntity(String accountEmail, String accountPhone, String accountLogin, String accountPassword) {
        this.accountEmail = accountEmail;
        this.accountPhone = accountPhone;
        this.accountLogin = accountLogin;
        this.accountPassword = accountPassword;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getAccountEmail() {
        return accountEmail;
    }

    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
    }

    public String getAccountPhone() {
        return accountPhone;
    }

    public void setAccountPhone(String accountPhone) {
        this.accountPhone = accountPhone;
    }

    public String getAccountLogin() {
        return accountLogin;
    }

    public void setAccountLogin(String accountLogin) {
        this.accountLogin = accountLogin;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }
}
