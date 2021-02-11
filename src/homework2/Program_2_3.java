package homework2;
import java.lang.Math;

public class Program_2_3 {
    public static void main(String[] args) {
        double[][] array = new double[5][7];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                array[i][j] = -2 + Math.random() * 77;
                System.out.print(array[i][j]+"  ");
            }
            System.out.println("");
        }
    }
}
