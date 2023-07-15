package composite;

public class BoxLeaf implements BoxComponent {
    private String name;
    private double price;

    public BoxLeaf(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showProducts() {
        String s = String.format("BoxLeaf[name = %s, price = %.2f]"
                                , this.name, this.price);
        System.out.println(s);
    }

    @Override
    public double totalPrice() {
        return this.price;
    }

    @Override
    public void addProduct(BoxComponent item) {
        System.out.println("BoxLeaf can't contain item");
    }

    @Override
    public void removeProduct(BoxComponent item) {
        System.out.println("BoxLeaf can't contain item");
    }
}
