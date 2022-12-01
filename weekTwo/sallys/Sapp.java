import java.util.List;

public class Sapp {
    
    private Integer id;
    private String username;
    private String password;
    private List<Product> boughtProducts;

    public Sapp() {}

    public Sapp(Integer idCounter, String username, String password) {
        this.username = username;
        this.password = password;
        this.id = idCounter;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    @Override
    public String toString() {
        return "Sapp [id=" + id + ", username=" + username + ", password=" + password + "]";
    }

    public List<Product> getBoughtProducts() {
        return boughtProducts;
    }

    public void setBoughtProducts(List<Product> boughtProducts) {
        this.boughtProducts = boughtProducts;
    }

    public void buyProduct(Product product) {
        this.boughtProducts.add(product);
    }

}
