package homework1;

public class Program_1_9 {
    public static void main(String[] args) {
        int num = 6;
        int sum=1;
        for (int i = 0; i<num; i++) {
            for (int j=0; j<=i; j++){
                System.out.print(sum+" ");
                sum++;
            }
            System.out.println("");
        }
    }
}
