package composite;

public interface BoxComponent {
    void addProduct(BoxComponent item);
    void removeProduct(BoxComponent item);
    void showProducts();
    double totalPrice();
}
