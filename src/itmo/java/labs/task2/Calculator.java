package itmo.java.labs.task2;

public class Calculator {

    //Method sum
    public Integer overLoadedSum(Integer a, Integer b){
        return a + b;
    }

    public Double overLoadedSum(Double a, Double b){
        return a + b;
    }

    public Long overLoadedSum(Long a, Long b){
        return a + b;
    }

    //Method division
    public Double overLoadedDiv(Integer a, Integer b){
        if (b == 0) {
            return null;
        }
        return (double)a / b;
    }

    public Double overLoadedDiv(Double a, Double b){
        if (b == 0) {
            return null;
        }
        return a / b;
    }

    public Double overLoadedDiv(Long a, Long b){
        if (b == 0) {
            return null;
        }
        return (double)a/ b;
    }

    //Method Multiplication
    public Integer overLoadedMultiplication(Integer a, Integer b){
        return a * b;
    }

    public Double overLoadedMultiplication(Double a, Double b){
        return a * b;
    }

    public Long overLoadedMultiplication(Long a, Long b){
        return a * b;
    }

    //Method Subtraction
    public Integer overLoadedSubtraction(Integer a, Integer b){
        return a - b;
    }

    public Double overLoadedSubtraction(Double a, Double b){
        return a - b;
    }

    public Long overLoadedSubtraction(Long a, Long b){
        return a - b;
    }
}
