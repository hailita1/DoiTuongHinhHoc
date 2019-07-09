package hailit;

public class Cirlce extends Shape {
    double radius = 1.0;

    public Cirlce() {

    }

    public Cirlce(double radius) {
        this.radius = radius;
    }

    public Cirlce(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return " A Cirlce with radius= " + getRadius() +
                ", which is a subclass of" + super.toString();
    }
}





