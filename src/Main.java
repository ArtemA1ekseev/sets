import homework1.Product;
import homework1.ProductList;

public class Main {

    public static void main(String[] args) {
        Product banana = new Product("банан", 50.0f, 2);
        Product fish = new Product("рыба", 134.0f, 1);
        ProductList productList = new ProductList();
        productList.addProduct(banana);
        productList.addProduct(fish);
        System.out.println(productList);
        Product banana2 = new Product("банан", 31.0f, 7);
        productList.addProduct(banana2);
    }
}