package itmo.java.labs.task2;

public class Point {
    private Double x;
    private Double y;
    private Color color;

    public Point() {
        this.x = 0.0;
        this.y = 0.0;
        this.color = Color.GREEN;
    }

    public Point(Double x, Double y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Point(Double x, Double y) {
        this.x = x;
        this.y = y;
        this.color = Color.BLACK;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", color=" + color +
                '}';
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}

