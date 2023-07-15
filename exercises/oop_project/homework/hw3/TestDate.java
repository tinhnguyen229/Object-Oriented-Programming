package oop_project.homework.hw3;

public class TestDate {
    public static void main(String[] args) {
        Date date = new Date(1, 2, 2014);
        System.out.println(date);
        date.setDay(22);
        date.setMonth(9);
        date.setYear(2001);
        System.out.println(date);
        System.out.println("Day: " + date.getDay());
        System.out.println("Month: " + date.getMonth());
        System.out.println("Year: " + date.getYear());

        date.setDate(3, 4, 2016);
        System.out.println(date);
    }
}
