package org.perfectstorms.botstorms.entities;

import javax.persistence.*;

@Entity
@Table(name = "bots")
public class BotEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "accountID")
    private long accountId;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "avatarUrl")
    private String avatarUrl;

    @Column(name = "authorLogin")
    private String authorAccountLogin;

    @Column(name = "authorUrl")
    private String authorAccountUrl;

    @Column(name = "activeStatus")
    private boolean activeStatus;

    @Column(name = "creationDate")
    private String creationDate;

    public BotEntity() {
    }

    public BotEntity(long accountId, String name, String type, String avatarUrl,
                     String authorAccountLogin, String authorAccountUrl,
                     boolean activeStatus, String creationDate) {

        this.accountId = accountId;
        this.name = name;
        this.type = type;
        this.avatarUrl = avatarUrl;
        this.authorAccountLogin = authorAccountLogin;
        this.authorAccountUrl = authorAccountUrl;
        this.activeStatus = activeStatus;
        this.creationDate = creationDate;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getAuthorAccountLogin() {
        return authorAccountLogin;
    }

    public void setAuthorAccountLogin(String authorAccountLogin) {
        this.authorAccountLogin = authorAccountLogin;
    }

    public String getAuthorAccountUrl() {
        return authorAccountUrl;
    }

    public void setAuthorAccountUrl(String authorAccountUrl) {
        this.authorAccountUrl = authorAccountUrl;
    }

    public boolean isActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
