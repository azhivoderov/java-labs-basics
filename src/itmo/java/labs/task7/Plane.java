package itmo.java.labs.task7;

public class Plane {
    private  Integer wingWeight;

    public void setWingWeight(Integer wingWeight) {
        this.wingWeight = wingWeight;
    }

    public void printInfo(){
        System.out.println(wingWeight);
    }

    class InnerWing {

        public InnerWing(Integer wingWeight) {
            setWingWeight(wingWeight);
        }

        public void printWingWeight() {
            System.out.println(wingWeight);
        }

        public void setWingWeightPlane(Integer wingWeight) {
            setWingWeight(wingWeight);
        }
    }


}
