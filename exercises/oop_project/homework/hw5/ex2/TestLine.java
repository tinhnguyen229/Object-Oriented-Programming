package oop_project.homework.hw5.ex2;

public class TestLine {
    public static void main(String[] args) {
        Point point = new Point(10, 20);
        Point point1 = new Point(20, 40);
        point.setXY(100, 10);
        System.out.println(point);
        
        Line line = new Line(0, 0, 3, 4);
        System.out.println(line);
        line.setBegin(point);
        System.out.println(line);
        Line line1 = new Line(point, point1);
        System.out.println(line1);
        System.out.println(line1.getLength());
        System.out.println(line1.getGradient());
    }
}
