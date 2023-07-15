package oop_project.homework.lab6;

import java.util.*;

public class PolyLine {
    private List<Point> points;

    public PolyLine() { 
        this.points = new ArrayList<Point>();
    }  

    public PolyLine(List<Point> points) {
        this.points = points;
    }

    public void appendPoint(Point point) {
        points.add(point);
    }

    public void appendPoint(int x, int y) {
        points.add(new Point(x, y));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (Point aPoint : points) {
            sb.append(aPoint.toString());
        }
        sb.append("}");
        return sb.toString();
    }

    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.size(); i++) {
            for (int j = i + 1; j < points.size(); j++) {
                length += points.get(i).distance(points.get(j));
            }
        }
        return length;
    }
}
