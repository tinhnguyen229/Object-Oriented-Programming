package abstractfactory;

public class TraditionalFurnitureFactory implements AbstractFurnitureFactory {
    public Chair createChair() {
        return new TraditionalChair();
    }

    public Table createTable() {
        return new TraditionalTable();
    }

}
