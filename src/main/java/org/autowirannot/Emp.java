package org.autowirannot;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
   //@Autowired   --  autowiring using property
    private Address address;
    @Autowired  //-- using constructor
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

   // @Autowired   -- autowiring for setter method
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
