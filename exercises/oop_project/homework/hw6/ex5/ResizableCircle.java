package oop_project.homework.hw6.ex5;

public class ResizableCircle extends Circle implements IResizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        super.radius *= percent / 100.0;  
    }

    @Override
    public String toString() {
        return String.format("ResizableCircle[%s]", super.toString());
    }

}
