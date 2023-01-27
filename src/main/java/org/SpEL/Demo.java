package org.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("demo")
public class Demo {
    @Value("#{2+3}")
    private int x;
    @Value("#{1+2+3*5}")
    private int y;
    @Value("#{T(java.lang.Math).sqrt(144)}")   // static method
    private double z;

    @Value("#{T(java.lang.Math).PI}")    // static variable
    private double pi;
    @Value("#{new java.lang.String('Rohit')}")
    private String name;
    @Value("#{7<4}")
    private boolean isActive;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", pi=" + pi +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
