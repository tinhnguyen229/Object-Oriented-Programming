package bridge;

public class Client {
    public static void main(String[] args) {
        Color red = new RedColor();
        Color blue = new BlueColor();

        Shape redCircle = new Circle(2, new RedColor());
        redCircle.printShape();
        System.out.println("-----------------------------------");

        Shape redSquare = new Square(3, red);
        redSquare.printShape();
        System.out.println("-----------------------------------");

        Shape blueCircle = new Circle(5, blue);
        blueCircle.printShape();
        System.out.println("-----------------------------------");

        Shape blueSquare = new Square(4, blue);
        blueSquare.printShape();
        blueSquare.setColor(red);
        blueSquare.printShape();
    }
}
