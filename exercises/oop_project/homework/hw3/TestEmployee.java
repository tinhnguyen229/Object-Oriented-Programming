package oop_project.homework.hw3;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(8, "Peter", "Tan", 999);
        System.out.println(employee);
        System.out.println("ID: " + employee.getId());
        System.out.println("First name: " + employee.getFirstName());
        System.out.println("Last name: " + employee.getLastName());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Name: " + employee.getName());
        System.out.println("Annual salary: " + employee.getAnnualSalary());
        System.out.println("Raise salary: " + employee.raiseSalary(10));
    }
}
