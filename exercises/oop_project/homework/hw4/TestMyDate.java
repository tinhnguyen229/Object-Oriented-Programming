package oop_project.homework.hw4;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate date = new MyDate(2000, 1, 1);
        date.setDate(2001, 9, 22);
        System.out.println(date);
        System.out.println(date.nextDay().nextMonth().nextYear().nextYear());
        System.out.println(date.previousYear());
        System.out.println(date.previousMonth());
        System.out.println(date.previousDay());
    }
}
