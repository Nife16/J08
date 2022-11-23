public class Product {
    
    private Double price;
    private String name;
    private String description;

    public Product() {
        super();
    }

    public Product(Double price, String name, String description) {
        super();
        this.price = price;
        this.name = name;
        this.description = description;
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
