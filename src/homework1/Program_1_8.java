package homework1;

import java.util.Scanner;

public class Program_1_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int p=0;
        int n=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("введіть число: ");
            arr[i] = scanner.nextInt();
            if(arr[i]>0){
                p++;
            }else if(arr[i]<0){
                n++;
            }
        }
        int []positive=new int[p];
        int []negative=new int[n];
        int j1=0;
        int j2=0;
        for(int i=0; i< arr.length;i++){
            if(arr[i]>0){
                positive[j1]=arr[i];
                j1++;
            }
            else if(arr[i]<0){
                negative[j2]=arr[i];
                j2++;
            }
        }
        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        for(int i=0; i< positive.length;i++){
            System.out.print(positive[i]+" ");
        }
        System.out.println("");
        for(int i=0; i< negative.length;i++){
            System.out.print(negative[i]+" ");
        }
    }
}
