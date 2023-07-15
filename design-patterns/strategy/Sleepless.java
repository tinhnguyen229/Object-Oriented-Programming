package strategy;

public class Sleepless implements SleepBehavior {
    @Override
    public void sleep() {
        System.out.println("I can't sleep until I finish my homework.");
    }
}
