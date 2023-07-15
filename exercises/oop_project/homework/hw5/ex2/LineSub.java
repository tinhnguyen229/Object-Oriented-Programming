package oop_project.homework.hw5.ex2;

public class LineSub extends Point {
    private Point end;
    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    public void setBegin(Point begin) {
        super.setXY(begin.getX(), begin.getY());
    }
        
    public Point getBegin() {
        return new Point(super.getX(), super.getY());
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public Point getEnd() {
        return this.end;
    }

    public void setBeginX(int beginX) {
        super.setX(beginX);
    }

    public void setBeginY(int beginY) {
        super.setY(beginY);
    }

    public void setEndX(int endX) {
        this.end.setX(endX);
    }

    public void setEndY(int endY) {
        this.end.setY(endY);
    }

    public void setBeginXY(int beginX, int beginY) {
        super.setXY(beginX, beginY);
    }

    public void setEndXY(int endX, int endY) {
        this.end.setXY(endX, endY);
    }

    public int getBeginX() {
        return super.getX();
    }

    public int getBeginY() {
        return super.getY();
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
        return String.format("Line[Begin = %s, End = %s]", super.toString(), this.end);
    }
}
