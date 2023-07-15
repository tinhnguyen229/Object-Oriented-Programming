package strategy;

public class StudentSimulator {
    public static void main(String[] args) {
        Student[] students = new Student[6];
        students[0] = new LazyStudent();
        students[1] = new HardworkingStudent();
        students[2] = new NormalStudent();
        students[3] = new LazyStudent();
        students[4] = new LuckyStudent();
        students[5] = new NormalStudent();

        processStudent(students);
    }

    private static void processStudent(Student[] students) {
        for (Student student : students) {
            System.out.println("----------------------------------");
            student.display();
            student.sleeping();
            student.studying();
        }
    }
}
