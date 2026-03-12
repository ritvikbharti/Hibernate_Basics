package org.example;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Laptop {
    @Id
    private int lid;
    private String name;
    private String model;
    private int  ram;
//    @ManyToOne
//    private Alien alien;
//    @ManyToMany(mappedBy = "laptops")
//    private List<Alien> aliens;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

//    public List<Alien> getAliens() {
//        return aliens;
//    }
//
//    public void setAliens(List<Alien> aliens) {
//        this.aliens = aliens;
//    }



    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                '}';
    }
}
