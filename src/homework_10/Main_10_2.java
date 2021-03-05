package homework_10;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main_10_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> email= new ArrayList<String>();

        Pattern pattern = Pattern.compile("^[a-z0-9.]+@gmail.com$");

        int n=2;

        System.out.println("enter email address: ");
        for(int i=0; i<n; i++){
            String word = scanner.next();
            Matcher matcher = pattern.matcher(word);
            if(matcher.find()){
                email.add(word);
            }
        }

        System.out.println("Email addresses: ");
        for(String str: email){
            System.out.println(str);
        }
    }
}