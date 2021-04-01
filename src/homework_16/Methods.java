package homework_16;

import java.io.*;

public class Methods<E> {

    public static <E> void serealize(E employee, String filePath){
        String currentDir = System.getProperty("user.dir");

        try(FileOutputStream fileOutputStream = new FileOutputStream(currentDir+filePath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream))
        {
            objectOutputStream.writeObject(employee);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static <E> void deserealize(String filePath){
        String currentDir = System.getProperty("user.dir");
        E newEmployee;

        try(FileInputStream fileInputStream = new FileInputStream(currentDir+filePath);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream))
        {
            newEmployee = (E) objectInputStream.readObject();
            System.out.println(newEmployee.toString());
        }
        catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
