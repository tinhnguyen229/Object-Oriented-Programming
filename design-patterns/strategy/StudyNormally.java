package strategy;

public class StudyNormally implements StudyBehavior {
    @Override
    public void study() {
        System.out.println("I will study until I am sleepy.");
    }
}
