package abstractfactory;

public class ModernFurnitureFactory implements AbstractFurnitureFactory {
    public Chair createChair() {
        return new ModernChair();
    }

    public Table createTable() {
        return new ModernTable();
    }

}
