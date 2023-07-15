package abstractfactory;

public class Client {
    public void clientMethod(AbstractFurnitureFactory factory) {
        Chair chair = factory.createChair();
        Table table = factory.createTable();
        System.out.println(chair.getModel());
        System.out.println(table.getModel());
    }
}
