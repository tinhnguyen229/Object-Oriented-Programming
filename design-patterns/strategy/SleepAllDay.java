package strategy;

public class SleepAllDay implements SleepBehavior {
    @Override
    public void sleep() {
        System.out.println("I sleep 15 hours per day.");
    }
}
