import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;

public class JsonSerializer<T>{
    public void serialize(T obj) throws IllegalAccessException {
        Class classObj = obj.getClass();
        if (!classObj.isAnnotationPresent(JsonSerializable.class)) {
            System.out.println("This object doesn't have @JsonSerializable annotation");
        } else {
            String json = "";
            Field[] fields = classObj.getDeclaredFields();
            for (Field field : fields) {
                String fieldName = field.getName();
                field.setAccessible(true);
                String value = field.get(obj).toString();
                json += fieldName + ":" + value + ",";
                field.setAccessible(false);
            }
            json = "{" + json.substring(0, json.length() - 1) + "}";
            System.out.println(json);
            String path = classObj.getName().toLowerCase() + ".json";
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
                oos.writeObject(obj);
                System.out.println("File has been written");
            } catch (Exception ex) {

                System.out.println(ex.getMessage());
            }
        }
    }
}
