package strategy;

public class NoStudy implements StudyBehavior {
    @Override
    public void study() {
        System.out.println("I have no time for studying.");
    }
}
