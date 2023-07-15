package oop_project.homework.hw5.ex1;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getProgram() {
        return this.program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getFee() {
        return this.fee;
    }

    @Override
    public String toString() {
        return String.format("Student [%s, program = %s, year = %d, fee = %.2f]"
                            , super.toString(), this.program, this.year, this.fee);
    }
}
