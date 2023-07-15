package strategy;

public class NormalStudent extends Student {

    public NormalStudent() {
        sleepBehavior = new SleepNormally();
        studyBehavior = new StudyNormally();
    }

    @Override
    void display() {
        System.out.println("I am a normal student.");
    }
}
