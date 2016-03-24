package com.pjbarbatsis.core;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.security.Principal;

/**
 * Created by Peeta on 3/24/2016.
 */
public class Customer implements Principal {

    @JsonProperty
    private int id;

    @JsonProperty
    private String name;

    @JsonProperty
    private String email;

    @JsonProperty
    private String telephone;

    @JsonProperty
    private String street;

    @JsonProperty
    private String city;

    @JsonProperty
    private String state;

    @JsonProperty
    private String zip;

    public String getName() {
        return this.name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
