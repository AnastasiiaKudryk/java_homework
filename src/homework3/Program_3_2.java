package homework3;

public class Program_3_2 {
    public static void main(String[] args) {
        double radius=2;
        double diameter=2*radius;
        Circle circle = new Circle(radius,diameter);
        System.out.println("Площа кола = "+circle.area());
        System.out.println("Довжина кола = "+circle.length());
    }
}
