package com.bptn.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"Address\"")
//hello
public class Address {
    @Column(name = "\"address\"")
    private String address;
    @Column(name = "\"city\"")
    private String city;

    @Column(name = "\"state\"")
    private String state;

    @Column(name = "\"country\"")
    private String country;

    @Column(name = "\"pincode\"")
    private String pincode;
    @Id
    @Column(name = "\"usernameKey\"")
    private String usernameKey;


    //   constructors
    public Address() {
        super();
    }

    //    parameterized constructors
    public Address(String address, String city, String state, String country, String pincode, String usernameKey) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
        this.usernameKey = usernameKey;
    }


    //    getter for address
    public String getAddress() {
        return this.address;
    }

    //    setter for address
    public void setAddress(String address) {
        this.address = address;
    }

    //    getter for city
    public String getCity() {
        return this.city;
    }

    //    setter for city
    public void setCity(String city) {
        this.city = city;
    }

    //    getter for state
    public String getState() {
        return this.state;
    }

    //    setter for state
    public void setState(String state) {
        this.state = state;
    }

    //    getter for country
    public String getCountry() {
        return this.country;
    }

    //    setter for country
    public void setCountry(String country) {
        this.country = country;
    }

    //    getter for pincode
    public String getPincode() {
        return this.pincode;
    }

    //    setter for pincode
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    //    getter for usernameKey
    public String getUsernameKey() {
        return usernameKey;
    }

    //    setter for usernameKey
    public void setUsernameKey(String usernameKey) {
        this.usernameKey = usernameKey;
    }

}