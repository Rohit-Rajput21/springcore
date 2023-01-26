package org.autowirannot;

public class Address {
    private String street;
    private String city;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        System.out.println("Address class setter method");
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address(String street, String city) {
        super();
        this.street = street;
        this.city = city;
        System.out.println("Address class parameterized constructor");
    }

    public Address() {
        super();
        System.out.println("Address class default constructor ");
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
