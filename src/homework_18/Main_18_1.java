package homework_18;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;

public class Main_18_1 {

    public static void main(String[] args) throws NoSuchFieldException{
        Field[] fields = Person.class.getDeclaredFields();

        String filePath = "/src/homework_18/Fields.txt";
        String currentDir = System.getProperty("user.dir");

        try(Writer writer = new FileWriter(currentDir+filePath)){
            for(Field field : fields){
                if(field.isAnnotationPresent(MyAnnotation.class)==true){
                    writer.write(field.getName()+" ");
                }
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
