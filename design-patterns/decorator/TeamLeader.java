package decorator;

public class TeamLeader extends EmployeeDecorator {

    protected TeamLeader(EmployeeComponent employee) {
        super(employee);
    }

    public void planing() {
        System.out.println(this.employee.getName() + " is planing.");
    }

    public void motivate() {
        System.out.println(this.employee.getName()
                + " is motivating" + getPossAdj() + "members.");
    }

    public void monitor() {
        System.out.println(this.employee.getName()
                + " is monitoring" + getPossAdj() + "members.");
    }

    @Override
    public void doTask() {
        employee.doTask();
        planing();
        motivate();
        monitor();
    }
}