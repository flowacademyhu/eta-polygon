package hu.flowacademy.eta;

public class Main {

    public static void main(String[] args) {
        Polygon negyzet = new Polygon(4, 2);
        System.out.println("Negyzet terulet: " + negyzet.Area() + " kerulet: " + negyzet.Perimeter());

        Polygon hszog = new Triangle(new Point(0,0), new Point(1,Math.sqrt(8)), new Point(2,0));
        System.out.println("Haromszog terulet: " + hszog.Area() + " kerulet: " + hszog.Perimeter());

        Polygon kor = new Circle(new Point(1,1), Math.sqrt(2 / Math.PI));
        System.out.println("Kor terulet: " + kor.Area() + " kerulet: " + kor.Perimeter());

        Polygon nyolcszog = new Polygon(8, 1);
        System.out.println("Nyolcszog terulet: " + nyolcszog.Area() + " kerulet: " + nyolcszog.Perimeter());
    }
}
