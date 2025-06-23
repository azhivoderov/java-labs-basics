package itmo.java.labs.task6;

public class Truck extends Car {
    private Integer numberWheels;
    private Integer maximumWeight;

    public Integer getNumberWheels() {
        return numberWheels;
    }

    public void newWheels(Integer numberWheels) {
        this.numberWheels = numberWheels;
        System.out.println(this.numberWheels);
    }

    public Integer getMaximumWeight() {
        return maximumWeight;
    }

    public void setMaximumWeight(Integer maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public Truck(int w, String m, char c, float s, Integer numberWheels, Integer maximumWeight) {
        super(w, m, c, s);
        this.numberWheels = numberWheels;
        this.maximumWeight = maximumWeight;
    }

}
