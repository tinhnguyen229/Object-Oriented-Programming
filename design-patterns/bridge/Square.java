package bridge;

public class Square extends Shape {
    private double length;
    public Square(double length, Color color) {
        super(color);
        this.length = length;
        this.shapeType = "Square";
    }

    @Override
    public void computeArea() {
        this.area = this.length * this.length;
    }
}
