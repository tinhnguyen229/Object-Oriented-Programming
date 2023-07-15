package strategy;

public class LazyStudent extends Student {

    public LazyStudent() {
        sleepBehavior = new SleepAllDay();
        studyBehavior = new NoStudy();
    }

    @Override
    void display() {
        System.out.println("I am a lazy student.");
    }
}
