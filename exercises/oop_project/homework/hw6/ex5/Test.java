package oop_project.homework.hw6.ex5;

public class Test {
    public static void main(String[] args) {
        IGeometricObject circle = new Circle(5.0);
        System.out.println(circle);
        System.out.println("Perimeter = " + circle.getPerimeter());
        System.out.println("Area = " + circle.getArea());

        ResizableCircle reCircle = new ResizableCircle(5.0);
        System.out.println(reCircle);
        System.out.println("Perimeter = " + ((Circle)reCircle).getPerimeter());
        System.out.println("Area = " + ((Circle)reCircle).getArea());
        reCircle.resize(20);
        System.out.println(reCircle);
        System.out.println("Perimeter = " + ((Circle)reCircle).getPerimeter());
        System.out.println("Area = " + ((Circle)reCircle).getArea());

        IGeometricObject geo2 = (IGeometricObject) reCircle;
        System.out.println(geo2);
        System.out.println("Perimeter = " + geo2.getPerimeter());
        System.out.println("Area = " + geo2.getArea());
        ((ResizableCircle)geo2).resize(80);
        System.out.println(geo2);
        System.out.println(reCircle);
    }
}
