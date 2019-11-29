package hu.flowacademy.eta;

public class Triangle extends Polygon {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double Area() {
        double s = this.Perimeter() / 2;
        return Math.sqrt(s *
                (s - this.a.distance(this.b)) *
                (s - this.b.distance(this.c)) *
                (s - this.c.distance(this.b)));
    }

    public double Perimeter() {
        return this.a.distance(this.b) + this.b.distance(this.c) + this.c.distance(this.a);
    }
}
