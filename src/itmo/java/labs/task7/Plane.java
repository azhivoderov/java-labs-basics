package itmo.java.labs.task7;

public class Plane {

    static class InnerWing {
        public Integer wingWeight;

        public InnerWing(Integer wingWeight) {
            this.wingWeight = wingWeight;
        }

        public Integer getWingWeight() {
            return wingWeight;
        }

        public void setWingWeight(Integer wingWeight) {
            this.wingWeight = wingWeight;
        }

        public void printWeight(){
            System.out.println(this.wingWeight.toString());
        }
    }


}
