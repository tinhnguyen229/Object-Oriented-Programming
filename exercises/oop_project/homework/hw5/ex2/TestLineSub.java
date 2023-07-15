package oop_project.homework.hw5.ex2;

public class TestLineSub {
    public static void main(String[] args) {
        Point point = new Point(10, 20);
        Point point1 = new Point(20, 40);
        point.setXY(100, 10);
        System.out.println(point);
        
        LineSub ls = new LineSub(0, 0, 3, 4);
        System.out.println(ls);
        LineSub ls1 = new LineSub(point, point1);
        System.out.println(ls1);
        System.out.println(ls1.getBegin());
        System.out.println(ls1.getEnd());
    }
}
