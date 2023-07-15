package oop_project.homework.hw3;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(3, 4);
        System.out.println(point1.distance(5, 6));
        MyPoint point2 = new MyPoint(5, 6);
        System.out.println(point1.distance(point2));
        System.out.println(point1.distance());
        MyPoint[] mypoint = new MyPoint[2];
        mypoint[0] = point1;
        mypoint[1] = point2;
        for(MyPoint point:mypoint) {
            System.out.println(point);
        }
    }
}
