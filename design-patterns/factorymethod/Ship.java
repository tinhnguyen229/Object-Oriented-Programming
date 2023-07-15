package factorymethod;

public class Ship implements MeanOfTransport{
    public void createTransportor() {
        System.out.println("Created Ship"); 
    }
    public String toString() {
        return "Ship!";
    }
}
