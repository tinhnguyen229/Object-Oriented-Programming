package oop_project.homework.hw4;

public class Test {
    public static void main(String[] args) {
        /*
        MyComplex comp1 = new MyComplex(10, -5);
        MyComplex comp2 = new MyComplex(1, 1);
        MyComplex comp3 = new MyComplex();
        System.out.println(comp1);
        System.out.println(comp2);
        System.out.println(comp1.isReal());
        System.out.println(comp1.addNew(comp2).addNew(comp3));
        System.out.println(comp1);
        System.out.println(comp1.multiply(comp2).multiply(comp3));
        System.out.println(comp1);
        */
        
        /*
        MyPolynomial pol = new MyPolynomial(1, 1);
        MyPolynomial pol2 = new MyPolynomial(2, 1);
        System.out.println(pol);
        System.out.println(pol2);
        System.out.println(pol.multiply(pol2));
        System.out.println(pol);
        */

        /*
        MyTime time1 = new MyTime();
        System.out.println(time1);
        time1.nextHour().nextHour();
        System.out.println(time1);
        time1.nextMinute();
        System.out.println(time1);
        System.out.println(time1.previousSecond().nextHour());
        time1.setTime(20, 59, 59);
        System.out.println(time1);
        */
       
        /* 
        MyDate date = new MyDate(2000, 1, 1);
        date.setDate(2001, 9, 22);
        System.out.println(date);
        System.out.println(date.nextDay().nextMonth().nextYear().nextYear());
        System.out.println(date.previousYear());
        System.out.println(date.previousMonth());
        System.out.println(date.previousDay());
        */

        /*
        Ball ball = new Ball(50, 50, 5, 10, 30);
        Container box = new Container(0, 0, 100, 100);
        System.out.println(ball);
        for (int step = 0; step < 20; step++) {
            ball.move();
            System.out.println(box.collides(ball));
            System.out.println(ball);
        }
        System.out.println(box.collides(ball));
        */
        
        /*
        BallPlaying ball = new BallPlaying(5, 5, 5);
        System.out.println(ball);
        Player player = new Player(1, 5, 5);
        System.out.println(player.near(ball));
        player.jump(5);
        player.kick(ball);
        System.out.println(ball);
        */

        // MyDate date = new MyDate(2000, 1, 1);
        // date.setDate(2000, 2, 29);
        // System.out.println(date);
        // System.out.println(date.nextYear());
        // System.out.println(date.nextDay().nextMonth().nextYear().nextYear());
        // System.out.println(date.previousYear());
        // System.out.println(date.previousMonth());
        // System.out.println(date.previousDay());

        MyPolynomial pol = new MyPolynomial(1, 1);
        MyPolynomial pol2 = new MyPolynomial(2, 1, 3);
        System.out.println(pol);
        System.out.println(pol.evaluate(2));
        System.out.println(pol2);
        System.out.println(pol.multiply(pol2));
        System.out.println(pol);
        System.out.println(pol.evaluate(2));
    }
}
