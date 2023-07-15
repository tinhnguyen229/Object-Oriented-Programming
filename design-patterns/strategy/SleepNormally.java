package strategy;

public class SleepNormally implements SleepBehavior {
    @Override
    public void sleep() {
        System.out.println("I sleep 8 hours per day.");
    }
}
