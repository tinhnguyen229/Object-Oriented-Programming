package oop_project.homework.hw3;

public class MyTriangle {
    private  MyPoint v1;
    private  MyPoint v2;
    private  MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString() {
        return String.format("MyTriangle [v1 = %s, v2 = %s, v3 = %s]"
                            , this.v1.toString()
                            , this.v2.toString()
                            , this.v3.toString());
    }

    public double getPerimeter() {
        return this.v1.distance(this.v2) + this.v1.distance(v3) + this.v2.distance(v3);
    }

    public String getType() {
        double a = this.v1.distance(this.v2);
        double b = this.v2.distance(v3);
        double c =  this.v1.distance(v3);
        if (a == b && b == c) {
            return "Equilateral.";
        } else if (a == b || b == c || c == a) {
            return "Isosceles.";
        } else {
            return "Scalene.";
        }
    }


}
