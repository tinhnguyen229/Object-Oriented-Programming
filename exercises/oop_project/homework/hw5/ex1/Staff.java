package oop_project.homework.hw5.ex1;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return this.school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public double getPay() {
        return this.pay;
    }

    @Override
    public String toString() {
        return String.format("Staff [%s, school = %s, pay = %.2f]", super.toString(), this.school, this.pay);
    }
}
