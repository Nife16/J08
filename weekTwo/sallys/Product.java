public class Product {

    private Integer id;
    private Double price;
    private String name;
    private String description;



    
    public Product() {
    }
    public Product(Integer id, Double price, String name, String description) {
        this.id = id;
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
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Product [id=" + id + ", price=" + price + ", name=" + name + ", description=" + description + "]";
    }

    
    
}
