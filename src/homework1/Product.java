package homework1;

import java.util.Objects;

public class Product {

    private final String nameProduct;

    private final float price;

    private final int quantity;

    private boolean checked;

    public Product(String nameProduct, float price, int quantity) {
        if (nameProduct == null || nameProduct.isBlank() || price < 0 || quantity < 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью!");
        }
        this.nameProduct = nameProduct;
        this.price = price;
        this.quantity = quantity;
        this.checked = false;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked() {
        this.checked = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(nameProduct, product.nameProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProduct);
    }

    @Override
    public String toString() {
        String checkedString = this.isChecked() ? "Да" : "Нет";
        return String.format("%s, Цена: %s, Количество: %s, Куплен: %s.", this.nameProduct, this.price, this.quantity, checkedString);
    }
}
