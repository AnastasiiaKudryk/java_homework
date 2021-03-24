package homework_15;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main_15 {
    public static void main(String[] args) {

        Map<String, Integer> allUsers = new LinkedHashMap<>();
        MyEntry <String,Integer> user = new MyEntry<>();

        user.addUser(allUsers, new MyEntry("Tom", 88));
        user.addUser(allUsers, new MyEntry("John", 12));
        user.addUser(allUsers, new MyEntry("Sam", 3));

        user.removeByKey(allUsers, "Tom");
        user.removeByValue(allUsers,3);

        user.setOfKeys(allUsers);
        user.ListOfValues(allUsers);
        user.printAll(allUsers);
    }
}
