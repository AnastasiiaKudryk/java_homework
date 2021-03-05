package homework_10;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main_10_3 {
    public static void main(String[] args) {

        String str1="I love Java more than my friend. Java is so beautiful!";
        Pattern pattern1 = Pattern.compile("Java");
        Matcher matcher1 = pattern1.matcher(str1);

        System.out.println(matcher1.find());

        str1=matcher1.replaceFirst("C#");
        System.out.println(str1);

        str1=matcher1.replaceAll("C#");
        System.out.println(str1);

        String str2="I love Java more than my friend. " +
                "Java is so beautiful. " +
                "I'm using jdk   1.8, " +
                "because jdk11 and jdk15 make some troubles on my laptop.";
        Pattern pattern2 = Pattern.compile("jdk[ ]*[0-9_.]+");
        Matcher matcher2 = pattern2.matcher(str2);

        str2=matcher2.replaceAll("[removed]");
        System.out.println(str2);
    }
}