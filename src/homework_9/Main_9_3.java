package homework_9;
import java.util.Scanner;

public class Main_9_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 5;
        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter a word: ");
            words[i]=scanner.next();
        }

        System.out.println("Words which start with 'a' and have even number of symbols:");
        for(int i=0; i<n; i++){
            if(words[i].startsWith("a")&&words[i].length()%2==0){
                System.out.println(words[i]);
            }
        }
    }
}
