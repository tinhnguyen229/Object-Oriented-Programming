package oop_project.homework.hw5.ex1;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("Tinh", "TB");
        System.out.println(person);
        
        Student student = new Student("Nguyen Ngoc Tinh", "Thai Binh", "IT", 3, 6.5);
        System.out.println(student);

        Staff staff= new Staff("Nguyen Van A", "Ha Noi", "HUS", 10.6);
        System.out.println(staff);
    }
}
