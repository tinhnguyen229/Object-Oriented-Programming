package strategy;

public class HardworkingStudent extends Student {

    public HardworkingStudent() {
        sleepBehavior = new Sleepless();
        studyBehavior = new StudyHard();
    }

    @Override
    void display() {
        System.out.println("I want to get a scholarship.");
    }
}
