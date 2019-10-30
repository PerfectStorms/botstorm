package org.perfectstorms.botstorms.entities;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "accountId")
    private long accountId;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "status")
    private String status;

    @Column(name = "avatarUrl")
    private String avatarUrl;

    @Column(name = "about")
    private String about;

    @Column(name = "country")
    private String country;

    @Column(name = "region")
    private String region;

    @Column(name = "city")
    private String city;

    @Column(name = "streetName")
    private String streetName;

    @Column(name = "streetNum")
    private String streetNumber;

    @Column(name = "apartmentNum")
    private String apartmentNumber;

    @Column(name = "mainLanguage")
    private String mainLanguage;

    @Column(name = "anotherLang")
    private String languages;

    @Column(name = "authorLogin")
    private String authorAccountLogin;

    @Column(name = "authorUrl")
    private String authorAccountUrl;

    @Column(name = "onlineStatus")
    private String onlineStatus;

    @Column(name = "registrationData")
    private String registrationData;

    public UserEntity() {
    }

    public UserEntity(long accountId, String firstName, String lastName, String status,
                      String avatarUrl, String about, String country, String region,
                      String city, String streetName, String streetNumber, String apartmentNumber,
                      String mainLanguage, String languages, String authorAccountLogin,
                      String authorAccountUrl, String onlineStatus, String registrationData) {

        this.accountId = accountId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
        this.avatarUrl = avatarUrl;
        this.about = about;
        this.country = country;
        this.region = region;
        this.city = city;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.apartmentNumber = apartmentNumber;
        this.mainLanguage = mainLanguage;
        this.languages = languages;
        this.authorAccountLogin = authorAccountLogin;
        this.authorAccountUrl = authorAccountUrl;
        this.onlineStatus = onlineStatus;
        this.registrationData = registrationData;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public void setMainLanguage(String mainLanguage) {
        this.mainLanguage = mainLanguage;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
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

    public String getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(String onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public String getRegistrationData() {
        return registrationData;
    }

    public void setRegistrationData(String registrationData) {
        this.registrationData = registrationData;
    }
}
