import java.util.ArrayList;
public class Cart {
    private ArrayList<Product> products;
    public Cart(){
        this.products = new ArrayList<>();
    }
    public ArrayList<Product> getProducts(){
        return products;
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public void removeProduct(Product product){
        products.remove(product);
    }
}
