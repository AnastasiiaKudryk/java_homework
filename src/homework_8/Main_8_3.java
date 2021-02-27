package homework_8;

import java.util.Scanner;

public class Main_8_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        int a = scanner.nextInt();
        System.out.println("b: ");
        int b = scanner.nextInt();

        Methods method1=new Methods(12, 87);
        Methods method2=new Methods(0, 12);
        Methods method3=new Methods(53,0);
        Methods method4=new Methods(0,0);
        Methods[] methods={method1, method2, method3, method4};

        try{
            if(a>0&&b>0){
                throw  new MyException();
            }
            if (a<0&&b<0){
                throw  new IllegalArgumentException();
            }
            if((a==0&&b!=0)||(a!=0&&b==0)){
                throw new ArithmeticException();
            }
            if (a==0&&b==0){
                throw  new IllegalAccessException();
            }

            for(Methods method: methods){
                System.out.println(method.add());
                System.out.println(method.subtract());
                System.out.println(method.multiply());
                System.out.println(method.devide());
            }
        }

        catch (MyException e) {
            System.out.println(e.toString());
        }
        catch (IllegalArgumentException e){
            System.out.println(e.toString());
        }
        catch (ArithmeticException e){
            System.out.println(e.toString());
        }
        catch (IllegalAccessException e) {
            System.out.println(e.toString());
        }
    }
}
