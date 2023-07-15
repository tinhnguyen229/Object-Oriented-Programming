package abstractfactory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        Client client = new Client();
        client.clientMethod(new ModernFurnitureFactory());
        client.clientMethod(new TraditionalFurnitureFactory());
    }

}
