package org.javaconfig;



public class Student {
    private Samosa samosa;
    public void study(){
        System.out.println("Student are reading book");
    }

    public Samosa getSamosa() {
        return samosa;
    }

    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }

    public Student(Samosa samosa) {
        this.samosa = samosa;
    }
}
