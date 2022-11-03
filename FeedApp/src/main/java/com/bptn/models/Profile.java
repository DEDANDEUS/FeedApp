package com.bptn.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"Profile\"")

public class Profile {

    @Column(name = "\"position\"")
    private String position;

    @Column(name = "\"company\"")
    private String company;

    @Column(name = "\"companyAddresss\"")
    private String companyAddresss;

    @Column(name = "\"interests\"")
    private String interests;

    @Column(name = "\"experience\"")
    private String experience;

    @Column(name = "\"education\"")
    private String education;

    @Column(name = "\"certification\"")
    private String certification;

    @Column(name = "\"skills\"")
    private String skills;

    @Column(name = "\"languages\"")
    private String languages;
    @Id
    @Column(name = "\"usernameKey\"")
    private String usernameKey;


    //    constructors
    public Profile() {
        super();
    }

    //  parameterized constructors
    public Profile(String position, String company, String companyAddresss, String interests, String experience, String education, String certification, String skills, String languages, String usernameKey) {
        this.position = position;
        this.company = company;
        this.companyAddresss = companyAddresss;
        this.interests = interests;
        this.experience = experience;
        this.education = education;
        this.certification = certification;
        this.skills = skills;
        this.languages = languages;
        this.usernameKey = usernameKey;
    }

    //    getters
    public String getPosition() {
        return position;
    }

    public String getCompany() {
        return company;
    }

    public String getCompanyAddresss() {
        return companyAddresss;
    }

    public String getInterests() {
        return interests;
    }

    public String getExperience() {
        return experience;
    }

    public String getEducation() {
        return education;
    }

    public String getCertification() {
        return certification;
    }

    public String getSkills() {
        return skills;
    }

    public String getLanguages() {
        return languages;
    }

    public String getUsernameKey() {
        return usernameKey;
    }

//    setters

    public void setPosition(String position) {
        this.position = position;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setCompanyAddresss(String companyAddresss) {
        this.companyAddresss = companyAddresss;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public void setUsernameKey(String usernameKey) {
        this.usernameKey = usernameKey;
    }
}