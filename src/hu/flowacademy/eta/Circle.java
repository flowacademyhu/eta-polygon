package hu.flowacademy.eta;

public class Circle extends Polygon {
    private Point center;
    private double radius;

    public Circle (Point o, double r) {
        this.center = o;
        this.radius = r;
    }

    public double Area() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public double Perimeter() {
        return this.radius * 2 * Math.PI;
    }
}
