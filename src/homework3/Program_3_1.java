package homework3;

public class Program_3_1 {

    public static void main(String[] args) {
        int height=2;
        int length=3;
        Rectangle rectangle1 = new Rectangle(height, length);
        Rectangle rectangle2 = new Rectangle();
        System.out.println("Площа першого прямокутника = "+ rectangle1.area());
        System.out.println("Периметр першого прямокутника = "+rectangle1.perimeter());
        System.out.println("Площа другого прямокутника = "+ rectangle2.area());
        System.out.println("Периметр другого прямокутника = "+rectangle2.perimeter());
    }
}
