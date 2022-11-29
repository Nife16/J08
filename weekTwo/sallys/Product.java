import java.util.ArrayList;
import java.util.List;

public class Product {

    private Double price = .99;
    private String name;
    private String description;
    private List<Integer> numList = new ArrayList<Integer>();
    
    public Product(Double price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public Product() {
        super();
    }

    public List<Integer> getNumList() {
        return numList;
    }

    public void setNumList(List<Integer> numList) {
        this.numList = numList;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product [price=" + price + ", name=" + name + ", description=" + description + "]";
    }

    
    
}
