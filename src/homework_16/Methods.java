package homework_16;

import java.io.*;

public class Methods {

    private Employee employee;

    public Methods(Employee employee) {
        this.employee = employee;
    }

    public void serealize(){
        String currentDir = System.getProperty("user.dir");

        try(FileOutputStream fileOutputStream = new FileOutputStream(currentDir+"/src/homework_16/Output.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream))
        {
            objectOutputStream.writeObject(employee);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void deserealize(){
        String currentDir = System.getProperty("user.dir");
        Employee newEmployee;

        try(FileInputStream fileInputStream = new FileInputStream(currentDir+"/src/homework_16/Output.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream))
        {
            newEmployee = (Employee) objectInputStream.readObject();
            System.out.println(newEmployee.toString());
        }
        catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
