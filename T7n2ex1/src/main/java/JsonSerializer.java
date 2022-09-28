
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class JsonSerializer<Object>{
   public void serialize(Object obj) throws IllegalAccessException, IOException {

       if(!obj.getClass().isAnnotationPresent(JsonSerializable.class)){
           System.out.println("This object doesn't have @JsonSerializable annotation");
       }else{
           String json = obj.toString();
           json="{"+json.substring(0,json.length()-1)+"}";
           System.out.println(json);
           String path = obj.getClass().getName().toLowerCase()+".json";
           try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path)))
           {
               oos.writeObject(obj);
               System.out.println("File has been written");
           }
           catch(Exception ex){

               System.out.println(ex.getMessage());
           }

           /*File newFile = new File("src\\newDirectory");
           newFile.mkdirs();
           Files.move(Paths.get(path),Paths.get("src\\newDirectory"), StandardCopyOption.REPLACE_EXISTING );
           */

       }

    }

}
