package factorymethod;

public class TestFactoryMethod {
    public static void main(String[] args) {
        TransportFactory tranFactory = new TransportFactory();
        MeanOfTransport transportor = tranFactory.createTransportor("Ship");
        transportor.createTransportor();
        System.out.println(transportor.toString());

        transportor = tranFactory.createTransportor("Truck");
        transportor.createTransportor();
        System.out.println(transportor.toString());


    }
}
