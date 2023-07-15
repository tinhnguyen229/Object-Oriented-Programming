package composite;

import java.util.*;

public class BoxComposite implements BoxComponent {
    private List<BoxComponent> box;

    public BoxComposite() {
        this.box = new ArrayList<BoxComponent>();
    }

    @Override
    public void addProduct(BoxComponent item) {
        this.box.add(item);
    }

    @Override
    public void removeProduct(BoxComponent item) {
        this.box.remove(item);
    }

    @Override
    public void showProducts() {
        for (BoxComponent product : box) {
            product.showProducts();
        }
    }

    @Override
    public double totalPrice() {
        double total = 0;
        for (BoxComponent product : box) {
            total += product.totalPrice();
        }
        return total;
    }
}
