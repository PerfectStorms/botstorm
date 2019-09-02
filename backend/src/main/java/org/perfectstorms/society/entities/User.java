package org.perfectstorms.society.entities;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "accountId")
    private long user_accountId;

    @Column(name = "firstName")
    private String user_firstName;

    @Column(name = "lastName")
    private String user_lastName;

    @Column(name = "status")
    private String user_status;

    @Column(name = "avatarUrl")
    private String user_avatarUrl;

    @Column(name = "about")
    private String user_about;

    @Column(name = "country")
    private String user_country;

    @Column(name = "region")
    private String user_region;

    @Column(name = "city")
    private String user_city;

    @Column(name = "streetName")
    private String user_streetName;

    @Column(name = "streetNum")
    private String user_streetNumber;

    @Column(name = "apartmentNum")
    private String user_apartmentNumber;

    @Column(name = "mainLanguage")
    private String user_mainLanguage;

    @Column(name = "anotherLang")
    private String user_languages;

    @Column(name = "authorLogin")
    private String bot_authorAccountLogin;

    @Column(name = "authorUrl")
    private String bot_authorAccountUrl;

    @Column(name = "onlineStatus")
    private String user_onlineStatus;

    @Column(name = "registrationData")
    private String user_registrationData;

    public User() {
    }

    public User(long user_accountId, String user_firstName, String user_lastName, String user_status, String user_avatarUrl, String user_about, String user_country, String user_region, String user_city, String user_streetName, String user_streetNumber, String user_apartmentNumber, String user_mainLanguage, String user_languages, String bot_authorAccountLogin, String bot_authorAccountUrl, String user_onlineStatus, String user_registrationData) {
        this.user_accountId = user_accountId;
        this.user_firstName = user_firstName;
        this.user_lastName = user_lastName;
        this.user_status = user_status;
        this.user_avatarUrl = user_avatarUrl;
        this.user_about = user_about;
        this.user_country = user_country;
        this.user_region = user_region;
        this.user_city = user_city;
        this.user_streetName = user_streetName;
        this.user_streetNumber = user_streetNumber;
        this.user_apartmentNumber = user_apartmentNumber;
        this.user_mainLanguage = user_mainLanguage;
        this.user_languages = user_languages;
        this.bot_authorAccountLogin = bot_authorAccountLogin;
        this.bot_authorAccountUrl = bot_authorAccountUrl;
        this.user_onlineStatus = user_onlineStatus;
        this.user_registrationData = user_registrationData;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUser_accountId() {
        return user_accountId;
    }

    public void setUser_accountId(long user_accountId) {
        this.user_accountId = user_accountId;
    }

    public String getUser_firstName() {
        return user_firstName;
    }

    public void setUser_firstName(String user_firstName) {
        this.user_firstName = user_firstName;
    }

    public String getUser_lastName() {
        return user_lastName;
    }

    public void setUser_lastName(String user_lastName) {
        this.user_lastName = user_lastName;
    }

    public String getUser_status() {
        return user_status;
    }

    public void setUser_status(String user_status) {
        this.user_status = user_status;
    }

    public String getUser_avatarUrl() {
        return user_avatarUrl;
    }

    public void setUser_avatarUrl(String user_avatarUrl) {
        this.user_avatarUrl = user_avatarUrl;
    }

    public String getUser_about() {
        return user_about;
    }

    public void setUser_about(String user_about) {
        this.user_about = user_about;
    }

    public String getUser_country() {
        return user_country;
    }

    public void setUser_country(String user_country) {
        this.user_country = user_country;
    }

    public String getUser_region() {
        return user_region;
    }

    public void setUser_region(String user_region) {
        this.user_region = user_region;
    }

    public String getUser_city() {
        return user_city;
    }

    public void setUser_city(String user_city) {
        this.user_city = user_city;
    }

    public String getUser_streetName() {
        return user_streetName;
    }

    public void setUser_streetName(String user_streetName) {
        this.user_streetName = user_streetName;
    }

    public String getUser_streetNumber() {
        return user_streetNumber;
    }

    public void setUser_streetNumber(String user_streetNumber) {
        this.user_streetNumber = user_streetNumber;
    }

    public String getUser_apartmentNumber() {
        return user_apartmentNumber;
    }

    public void setUser_apartmentNumber(String user_apartmentNumber) {
        this.user_apartmentNumber = user_apartmentNumber;
    }

    public String getUser_mainLanguage() {
        return user_mainLanguage;
    }

    public void setUser_mainLanguage(String user_mainLanguage) {
        this.user_mainLanguage = user_mainLanguage;
    }

    public String getUser_languages() {
        return user_languages;
    }

    public void setUser_languages(String user_languages) {
        this.user_languages = user_languages;
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

    public String getUser_onlineStatus() {
        return user_onlineStatus;
    }

    public void setUser_onlineStatus(String user_onlineStatus) {
        this.user_onlineStatus = user_onlineStatus;
    }

    public String getUser_registrationData() {
        return user_registrationData;
    }

    public void setUser_registrationData(String user_registrationData) {
        this.user_registrationData = user_registrationData;
    }

}
