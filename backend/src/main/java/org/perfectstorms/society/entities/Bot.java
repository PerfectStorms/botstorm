package org.perfectstorms.society.entities;

import javax.persistence.*;

@Entity
@Table(name = "bots")
public class Bot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "accountID")
    private long bot_accountId;

    @Column(name = "name")
    private String bot_name;

    @Column(name = "type")
    private String bot_type;

    @Column(name = "avatarUrl")
    private String bot_avatarUrl;

    @Column(name = "authorLogin")
    private String bot_authorAccountLogin;

    @Column(name = "authorUrl")
    private String bot_authorAccountUrl;

    @Column(name = "activeStatus")
    private boolean bot_activeStatus;

    @Column(name = "creationDate")
    private String bot_creationDate;

    public Bot() {
    }

    public Bot(long bot_accountId, String bot_name, String bot_type, String bot_avatarUrl, String bot_authorAccountLogin, String bot_authorAccountUrl, boolean bot_activeStatus, String bot_creationDate) {
        this.bot_accountId = bot_accountId;
        this.bot_name = bot_name;
        this.bot_type = bot_type;
        this.bot_avatarUrl = bot_avatarUrl;
        this.bot_authorAccountLogin = bot_authorAccountLogin;
        this.bot_authorAccountUrl = bot_authorAccountUrl;
        this.bot_activeStatus = bot_activeStatus;
        this.bot_creationDate = bot_creationDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBot_accountId() {
        return bot_accountId;
    }

    public void setBot_accountId(long bot_accountId) {
        this.bot_accountId = bot_accountId;
    }

    public String getBot_name() {
        return bot_name;
    }

    public void setBot_name(String bot_name) {
        this.bot_name = bot_name;
    }

    public String getBot_type() {
        return bot_type;
    }

    public void setBot_type(String bot_type) {
        this.bot_type = bot_type;
    }

    public String getBot_avatarUrl() {
        return bot_avatarUrl;
    }

    public void setBot_avatarUrl(String bot_avatarUrl) {
        this.bot_avatarUrl = bot_avatarUrl;
    }

    public String getBot_authorAccountLogin() {
        return bot_authorAccountLogin;
    }

    public void setBot_authorAccountLogin(String bot_authorAccountLogin) {
        this.bot_authorAccountLogin = bot_authorAccountLogin;
    }

    public String getBot_authorAccountUrl() {
        return bot_authorAccountUrl;
    }

    public void setBot_authorAccountUrl(String bot_authorAccountUrl) {
        this.bot_authorAccountUrl = bot_authorAccountUrl;
    }

    public boolean isBot_activeStatus() {
        return bot_activeStatus;
    }

    public void setBot_activeStatus(boolean bot_activeStatus) {
        this.bot_activeStatus = bot_activeStatus;
    }

    public String getBot_creationDate() {
        return bot_creationDate;
    }

    public void setBot_creationDate(String bot_creationDate) {
        this.bot_creationDate = bot_creationDate;
    }

}
