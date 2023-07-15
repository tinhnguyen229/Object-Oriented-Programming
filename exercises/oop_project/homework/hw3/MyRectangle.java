package oop_project.homework.hw3;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle() {
        topLeft = new MyPoint(0, 0);
        bottomRight = new MyPoint(0, 0);
    }
    public MyRectangle(MyPoint topLeft, MyPoint botRight) {
        this.topLeft = topLeft;
        this.bottomRight = botRight;
    }

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, x2);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getTopLeft() {
        return this.topLeft;
    }

    public void setBottomRight(MyPoint botRight) {
        this.bottomRight = botRight;
    }

    public MyPoint getBottomRight() {
        return this.bottomRight;
    }

    public void setTopLeftX(int x) {
        this.topLeft.setX(x);
    }

    public int getTopLeftX() {
        return this.topLeft.getX();
    }

    public void setTopLeftY(int y) {
        this.topLeft.setY(y);
    }

    public int getTopLeftY() {
        return this.topLeft.getY();
    }

    public void setBottomRightX(int x) {
        this.bottomRight.setX(x);
    }

    public int getBottomRightX() {
        return this.bottomRight.getX();
    }

    public void setBottomRightY(int y) {
        this.bottomRight.setY(y);
    }

    public int getBottomRightY() {
        return this.bottomRight.getY();
    }

    public MyPoint getPointLeft() {
        MyPoint pointLeft = new MyPoint(this.getTopLeftX(), this.getBottomRightY());
        return pointLeft;
    }

    public MyPoint getPointRight() {
        MyPoint pointRight = new MyPoint(this.getBottomRightX(), this.getTopLeftY());
        return pointRight;
    }

    public double getLength() {
        return this.getTopLeft().distance(this.getPointRight());
    }

    public double getWidth() {
        return this.getTopLeft().distance(this.getPointLeft());
    }

    public double getArea() {
        if (this.getTopLeftX() == this.getBottomRightX() || this.getTopLeftY() == this.getBottomRightY()) {
            System.out.println("Can't create the rectangle.");
            return 0;
        } else {
            return this.getLength() * this.getWidth();
        }
    }

    public double getPerimeter() {
        if (this.getTopLeftX() == this.getBottomRightX() || this.getTopLeftY() == this.getBottomRightY()) {
            System.out.println("Can't create the rectangle.");
            return 0;
        } else {
            return (this.getLength() + this.getWidth()) * 2;
        }
    }
    public String toString() {
        if (this.getTopLeftX() == this.getBottomRightX() || this.getTopLeftY() == this.getBottomRightY()) {
            return "Can't create the rectangle.";
        } else {
            return String.format("MyRectangle [Top-left = %s, Bottom-right = %s]: Area = %.2f | Perimeter = %.2f"
                                , this.topLeft.toString(), this.bottomRight.toString()
                                , this.getArea(), this.getPerimeter());
        }
    }

    public void print(Object object) {
        System.out.println(object);
    }

    public void print() {
        System.out.println(toString());
    }
}
