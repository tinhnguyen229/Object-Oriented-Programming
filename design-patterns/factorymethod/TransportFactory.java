package factorymethod;

public class TransportFactory {
    MeanOfTransport createTransportor(String type) {
        switch (type) {
            case "truck":
            case "Truck":
                return new Truck();
            case "ship":
            case "Ship":
                return new Ship();
            default:
                return null;
        }
    }
}
