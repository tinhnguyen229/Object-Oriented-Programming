package bridge;

public abstract class Shape {
    protected double area;
    protected String shapeType;
    protected Color color;
    
    public Shape(Color color) {
        this.color = color;
    }

    public double getArea() {
        return this.area;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void computeArea();

    public void printShape() {
        System.out.println(this.shapeType + " " + color.fillColor());
    }
}
