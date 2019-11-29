package hu.flowacademy.eta;

public class Point {
    private double x, y;

    public Point() {
        this.x = -1;
        this.y = -1;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point b) {
        double result = Math.sqrt(Math.pow(this.getX() - b.getX(), 2) + Math.pow(this.y - b.getY(), 2));
        return result;
    }
}
