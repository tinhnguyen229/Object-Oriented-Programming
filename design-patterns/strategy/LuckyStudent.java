package strategy;

public class LuckyStudent extends Student {

    public LuckyStudent() {
        sleepBehavior = new SleepAllDay();
        studyBehavior = new StudyNormally();
    }

    @Override
    void display() {
        System.out.println("I didn't study much, but I still got good grades.");
    }

}
