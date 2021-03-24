package homework_15;
import java.util.Map;

public class MyEntry <K,T>{
    private K username;
    private T age;

    public MyEntry(K username, T age) {
        this.username = username;
        this.age = age;
    }

    public MyEntry() {
    }

    public K getUsername() {
        return username;
    }

    public void setUsername(K username) {
        this.username = username;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyEntry{" +
                "username=" + username +
                ", age=" + age +
                '}';
    }

    public void addUser(Map<K,T> allUsers, MyEntry newUser){
        allUsers.put((K) newUser.username, (T) newUser.age);
    }

    public void removeByKey(Map<K,T> allUsers, K userKey){
        allUsers.remove(userKey);
    }

    public void removeByValue(Map<K,T> allUsers, T userValue){
        K userKey = null;
        for(Map.Entry<K, T> user : allUsers.entrySet()) {
            if(userValue==user.getValue()){
                userKey = user.getKey();
            }
        }
        allUsers.remove(userKey);
    }

    public void setOfKeys(Map<K,T> allUsers){
        System.out.print("Names: ");
        for(K user: allUsers.keySet()){
            System.out.print(user+" ");
        }
        System.out.println();
    }

    public void ListOfValues(Map<K,T> allUsers){
        System.out.print("Age: ");
        for(T user: allUsers.values()){
            System.out.print(user+" ");
        }
        System.out.println();
    }

    public void printAll(Map<K,T> allUsers){
        for(Map.Entry<K, T> someUser : allUsers.entrySet()){
            System.out.println("Username: " + someUser.getKey().toString() +
                    "; Age: " + someUser.getValue().toString());
        }
    }
}
