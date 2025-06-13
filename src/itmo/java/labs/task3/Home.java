package itmo.java.labs.task3;

import java.time.Year;

public class Home {
    private Integer floorsCount;
    private Integer yearOfConstruction;
    private String name;

    public Home() {
    }

    public Home(Integer floorsCount, Integer yearOfConstruction, String name) {
        this.floorsCount = floorsCount;
        this.yearOfConstruction = yearOfConstruction;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Home{" +
                "floorsCount=" + floorsCount +
                ", yearOfConstruction=" + yearOfConstruction +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getFloorsCount() {
        return floorsCount;
    }

    public void setFloorsCount(Integer floorsCount) {
        this.floorsCount = floorsCount;
    }

    public Integer getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(Integer yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer numberYears(){
        return Year.now().getValue() - this.yearOfConstruction;
    }
}
