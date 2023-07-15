package composite;

public class Client {
    public static void main(String[] args) {
        BoxLeaf      product1 = new BoxLeaf("Phone", 5);
        BoxComponent product2 = new BoxLeaf("Earphone", 3);
        BoxComponent product3 = new BoxLeaf("Charger", 3);
        BoxComponent product4 = new BoxLeaf("Radio", 2);
        BoxComponent product5 = new BoxLeaf("TV", 9);
        

        BoxComponent smallBox1 = new BoxComposite();
        smallBox1.addProduct(product1);
        smallBox1.addProduct(product2);

        
        BoxComponent smallBox2 = new BoxComposite();
        smallBox2.addProduct(product3);
        smallBox2.addProduct(product4);

        BoxComponent bigBox = new BoxComposite();
        bigBox.addProduct(product5);
        bigBox.addProduct(smallBox1);
        bigBox.addProduct(smallBox2);

        bigBox.showProducts();
        System.out.println("Price of all products: " + bigBox.totalPrice());
    }
}
