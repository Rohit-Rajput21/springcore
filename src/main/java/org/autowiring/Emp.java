package org.autowiring;

public class Emp {
    private Address address;

    public Emp(Address address) {
        System.out.println("Emp class parameterized constructor");
        this.address = address;
    }

    public Emp() {
        super();
        System.out.println("Emp class default constructor");
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("Employee class setter method");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
