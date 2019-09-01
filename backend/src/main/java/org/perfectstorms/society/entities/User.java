package org.perfectstorms.society.entities;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "accountId")
    private String user_accountId;

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
    private String user_street_name;

    @Column(name = "streetNum")
    private String user_street_number;

    @Column(name = "apartmentNum")
    private String user_apartment_number;

    @Column(name = "mainLanguage")
    private String user_main_language;

    @Column(name = "anotherLang")
    private String user_languages;

    @Column(name = "onlineStatus")
    private String user_onlineStatus;

    @Column(name = "registrationData")
    private String user_registrationData;

    public User() {
    }

    public User(String user_accountId, String user_firstName, String user_lastName, String user_status, String user_avatarUrl, String user_about, String user_country, String user_region, String user_city, String user_street_name, String user_street_number, String user_apartment_number, String user_main_language, String user_languages, String user_onlineStatus, String user_registrationData) {
        this.user_accountId = user_accountId;
        this.user_firstName = user_firstName;
        this.user_lastName = user_lastName;
        this.user_status = user_status;
        this.user_avatarUrl = user_avatarUrl;
        this.user_about = user_about;
        this.user_country = user_country;
        this.user_region = user_region;
        this.user_city = user_city;
        this.user_street_name = user_street_name;
        this.user_street_number = user_street_number;
        this.user_apartment_number = user_apartment_number;
        this.user_main_language = user_main_language;
        this.user_languages = user_languages;
        this.user_onlineStatus = user_onlineStatus;
        this.user_registrationData = user_registrationData;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser_accountId() {
        return user_accountId;
    }

    public void setUser_accountId(String user_accountId) {
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

    public String getUser_street_name() {
        return user_street_name;
    }

    public void setUser_street_name(String user_street_name) {
        this.user_street_name = user_street_name;
    }

    public String getUser_street_number() {
        return user_street_number;
    }

    public void setUser_street_number(String user_street_number) {
        this.user_street_number = user_street_number;
    }

    public String getUser_apartment_number() {
        return user_apartment_number;
    }

    public void setUser_apartment_number(String user_apartment_number) {
        this.user_apartment_number = user_apartment_number;
    }

    public String getUser_main_language() {
        return user_main_language;
    }

    public void setUser_main_language(String user_main_language) {
        this.user_main_language = user_main_language;
    }

    public String getUser_languages() {
        return user_languages;
    }

    public void setUser_languages(String user_languages) {
        this.user_languages = user_languages;
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
