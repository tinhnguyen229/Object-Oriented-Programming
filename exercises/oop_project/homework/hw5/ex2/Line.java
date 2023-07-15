package oop_project.homework.hw5.ex2;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end= end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        this.begin = new Point(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getBegin() {
        return this.begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public Point getEnd() {
        return this.end;
    }

    public void setBeginX(int beginX) {
        this.begin.setX(beginX);
    }

    public void setBeginY(int beginY) {
        this.begin.setY(beginY);
    }

    public void setEndX(int endX) {
        this.end.setX(endX);
    }

    public void setEndY(int endY) {
        this.end.setY(endY);
    }

    public void setBeginXY(int beginX, int beginY) {
        this.begin.setXY(beginX, beginY);
    }

    public void setEndXY(int endX, int endY) {
        this.end.setXY(endX, endY);
    }

    public int getBeginX() {
        return this.begin.getX();
    }

    public int getBeginY() {
        return this.begin.getY();
    }

    public int getEndX() {
        return this.end.getX();
    }

    public int getEndY() {
        return this.end.getY();
    }

    public double getLength() {
        int xDiff = getBeginX() - getEndX();
        int yDiff = getBeginY() - getEndY();
        return Math.round(Math.sqrt(xDiff*xDiff + yDiff*yDiff) * 100.0) / 100.0;
    }

    public double getGradient() {
        int xDiff = getBeginX() - getEndX();
        int yDiff = getBeginY() - getEndY();
        return Math.atan2(yDiff, xDiff);
    }
    public String toString() {
        return String.format("Line[Begin = %s, End = %s]", this.begin, this.end);
    }
}
