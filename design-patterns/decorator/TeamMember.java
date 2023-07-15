package decorator;

public class TeamMember extends EmployeeDecorator {

    protected TeamMember(EmployeeComponent employee) {
        super(employee);
    }

    public void reportTask() {
        System.out.println(this.employee.getName()
                + " is reporting" + getPossAdj() + "assigned tasks.");
    }

    public void coordinateWithOthers() {
        System.out.println(this.employee.getName()
                + " is coordinating with other members of"
                + getPossAdj() + "team.");
    }

    @Override
    public void doTask() {
        employee.doTask();
        reportTask();
        coordinateWithOthers();
    }
}