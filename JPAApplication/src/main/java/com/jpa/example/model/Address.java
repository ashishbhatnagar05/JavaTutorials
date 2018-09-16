package com.jpa.example.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private String flat_no;
    private String apartment;
    private String city;

    public Address() {
    }

    public Address(String flat_no, String apartment, String city) {
        this.flat_no = flat_no;
        this.apartment = apartment;
        this.city = city;
    }

    public String getFlat_no() {
        return flat_no;
    }

    public String getApartment() {
        return apartment;
    }

    public String getCity() {
        return city;
    }
}
