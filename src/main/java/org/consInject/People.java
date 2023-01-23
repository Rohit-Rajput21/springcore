package org.consInject;

import java.util.List;

public class People {
    private String name;
    private int personId;
    private Certi certi;
    private List<String > list;
    public People(String name, int personId, Certi certi, List<String> list) {
        this.name = name;
        this.personId = personId;
        this.certi = certi;
        this.list = list;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                ", certi=" + certi.name +
                ", list=" + list +
                '}';
    }
}
