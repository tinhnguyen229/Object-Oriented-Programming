package decorator;

import java.util.Date;

public abstract class EmployeeDecorator implements EmployeeComponent {

    protected EmployeeComponent employee;

    protected EmployeeDecorator(EmployeeComponent employee) {
        this.employee = employee;
    }

    @Override
    public String getName() {
        return employee.getName();
    }

    @Override
    public boolean getGender() {
        return employee.getGender();
    }

    @Override
    public void join(Date joinDate) {
        employee.join(joinDate);
    }

    @Override
    public void terminate(Date terminateDate) {
        employee.terminate(terminateDate);
    }

    public String getPossAdj() {
        if (employee.getGender()) {
            return " his ";
        }
        return " her ";
    }
}