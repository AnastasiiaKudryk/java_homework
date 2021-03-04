package homework_9;
import java.util.Scanner;

public class Main_9_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n=4;
        String[] words = new String[n];
        int maxLength;
        int minLength;

        for(int i=0; i<n; i++) {
            System.out.println("Enter a word: ");
            words[i] = scanner.next();
        }

        maxLength=words[0].length();
        minLength=words[0].length();

        for(int i=0; i<n; i++){
            if(words[i].length()>maxLength){
                maxLength=words[i].length();
            }
            if(words[i].length()<minLength){
                minLength=words[i].length();
            }
        }

        for(int i=0; i<n; i++){
            if(words[i].length()==maxLength){
                System.out.println("Word №"+(i+1)+" has maximum length");
            }
            if(words[i].length()==minLength){
                System.out.println("Word №"+(i+1)+" has minimum length");
            }
        }
    }
}
