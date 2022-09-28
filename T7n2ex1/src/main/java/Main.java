import java.io.File;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IllegalAccessException, IOException {
        Product product1 = new Product("Samsung", 1000, "Smartphone");
        Employee emp = new Employee("Vasya",10000);
        File file = new File("NewDirectory");
        new JsonSerializer<Product>().serialize(product1);
        new JsonSerializer<Employee>().serialize(emp);

    }
}
