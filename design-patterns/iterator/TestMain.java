package iterator;

public class TestMain {
    public static void main(String[] args) {
        ConcreteCollection<Circle> collection = new ConcreteCollection<>();
        for (int i = 0; i < 12; i++) {
            Circle insert = new Circle(i + 1);
            collection.addItem(insert);
        }

        Iterator<Circle> iterator = collection.getIterator();
        while (iterator.hasNext()) {
            Circle item = iterator.getNext();
            System.out.println(item);
        }
    }
}
