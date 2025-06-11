package itmo.java.labs.task3;

import itmo.java.labs.task2.Color;

public class Car {
    private Color color;
    private String name;
    private Double weight;

    public Car() {
    }

    public Car(Color color) {
        this.color = color;
    }

    public Car(Color color, Double weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
