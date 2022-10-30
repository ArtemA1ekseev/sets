import homework1.Product;
import homework1.ProductList;
import homework2.Recipe;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Product banana = new Product("банан", 50.0f, 2);
        Product fish = new Product("рыба", 134.0f, 1);
        ProductList productList = new ProductList();
        productList.addProduct(banana);
        productList.addProduct(fish);
        System.out.println(productList);

        //Product banana2 = new Product("банан", 31.0f, 7);
        //productList.addProduct(banana2);

        System.out.println();

        Recipe recipe = new Recipe();
    }

    private static void numbersSetRemoveEven() {
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}