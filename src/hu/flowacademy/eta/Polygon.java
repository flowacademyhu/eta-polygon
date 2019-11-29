package hu.flowacademy.eta;

public class Polygon {
    private int sides;
    private double sideLength;

    public Polygon() { }

    public Polygon(int sides, double sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double Area() {
        return this.sides / 4 * Math.pow(this.sideLength, 2) * 1.0 / Math.tan(Math.PI / this.sides);
    }

    public double Perimeter() {
        return this.sides * this.sideLength;
    }
}
