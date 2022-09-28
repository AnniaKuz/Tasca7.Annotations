import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@JsonSerializable(directory="Json")
public class Product implements Serializable {
   // @JsonElement
    private String name;
    //@JsonElement
    private int price;
    private transient String description;

    public Product(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
