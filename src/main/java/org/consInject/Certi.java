package org.consInject;

public class Certi {
    public String name;

    public Certi(String name) {
        super();
        this.name=name;
    }
    @Override
    public String toString(){
        return "{"+this.name+"}";
    }
}
