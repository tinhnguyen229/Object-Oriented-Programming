package oop_project.homework.hw4;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime time1 = new MyTime();
        System.out.println(time1);
        time1.nextHour().nextHour();
        System.out.println(time1);
        time1.nextMinute();
        System.out.println(time1);
        System.out.println(time1.previousSecond().nextHour());
        time1.setTime(20, 59, 59);
        System.out.println(time1);
    }
}
