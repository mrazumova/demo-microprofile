package com.example.demo.entity;

public class Destination {

    private String country;

    private String city;

    public static Destination destination(String country, String city) {
        Destination result = new Destination();
        result.setCountry(country);
        result.setCity(city);
        return result;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
