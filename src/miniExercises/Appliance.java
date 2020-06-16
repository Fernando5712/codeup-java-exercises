package miniExercises;

import javax.swing.*;

abstract class Appliance {
    private String brand;
    private String color;

    public Appliance(){};

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Appliance(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public abstract void makeSound();

    public abstract void doWork();


}
