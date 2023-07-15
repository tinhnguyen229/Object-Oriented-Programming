package strategy;

public abstract class Student {
    StudyBehavior studyBehavior;
    SleepBehavior sleepBehavior;

    public Student() {
    }

    public void setStudyBehavior(StudyBehavior studyBehavior) {
        this.studyBehavior = studyBehavior;
    }

    public void setSleepBehavior(SleepBehavior sleepBehavior) {
        this.sleepBehavior = sleepBehavior;
    }

    abstract void display();

    public void studying() {
        // delegate to study behavior
        studyBehavior.study();
    }

    public void sleeping() {
        // delegate to sleep behavior
        sleepBehavior.sleep();
    }
}
