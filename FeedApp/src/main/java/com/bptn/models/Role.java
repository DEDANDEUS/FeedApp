package com.bptn.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"Role\"")

public class Role {

    @Column(name = "\"role\"")
    private String role;

    @Column(name = "\"company\"")
    private String company;

    @Column(name = "\"skills\"")
    private String skills;

    @Id
    @Column(name = "\"usernameKey\"")
    private String usernameKey;

    //  constructors
    public Role() {
        super();
    }

    //  parameterized constructors
    public Role(String role, String company, String skills, String usernameKey) {
        this.role = role;
        this.company = company;
        this.skills = skills;
        this.usernameKey = usernameKey;
    }


    //    getters
    public String getRole() {
        return role;
    }

    public String getCompany() {
        return company;
    }

    public String getSkills() {
        return skills;
    }

    public String getUsernameKey() {
        return usernameKey;
    }

    //    setters
    public void setRole(String role) {
        this.role = role;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public void setUsernameKey(String usernameKey) {
        this.usernameKey = usernameKey;
    }
}