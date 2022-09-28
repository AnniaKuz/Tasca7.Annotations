public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Product product1 = new Product("Samsung", 1000, "Smartphone");
        Employee emp = new Employee("Jordi Blasco",10000);
        new JsonSerializer<Product>().serialize(product1);
        new JsonSerializer<Employee>().serialize(emp);
    }
}
