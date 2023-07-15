package factorymethod;

public class Truck implements MeanOfTransport{
    public void createTransportor() {
        System.out.println("Created Truck"); 
    }
    public String toString() {
        return "Truck!";
    }
}
