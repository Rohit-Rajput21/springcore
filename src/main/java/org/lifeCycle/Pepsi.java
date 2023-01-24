package org.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting price of Pepsi");
        this.price = price;
    }

    public Pepsi() {
        super();
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside pepsi : destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside pepsi : init");
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }
}
