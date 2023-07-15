package bridge;

public class Circle extends Shape{
    private double radius;
    public Circle(double r, Color color) {
        super(color);
        this.radius = r;
        this.shapeType = "Circle";
    }

    @Override
    public void computeArea() {
        this.area = Math.PI * this.radius * this.radius;
    }
}
