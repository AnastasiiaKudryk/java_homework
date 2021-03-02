package homework_9;
import java.util.Scanner;

public class Main_9_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n=4;
        String[] words = new String[n];
        int [] length = new int[n];
        int maxLength;
        int minLength;

        for(int i=0; i<n; i++) {
            System.out.println("Enter a word: ");
            words[i] = scanner.next();
            length[i] = words[i].length();
        }

        maxLength=length[0];
        minLength=length[0];

        for(int i=0; i<n; i++){
            if(length[i]>maxLength){
                maxLength=length[i];
            }
            if(length[i]<minLength){
                minLength=length[i];
            }
        }

        for(int i=0; i<n; i++){
            if(words[i].length()==maxLength){
                System.out.println("Word №"+i+" has maximum length");
            }
            if(words[i].length()==minLength){
                System.out.println("Word №"+i+" has minimum length");
            }
        }
    }
}
