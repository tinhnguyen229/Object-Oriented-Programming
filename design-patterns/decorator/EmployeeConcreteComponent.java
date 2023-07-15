package decorator;

import java.util.Date;

public class EmployeeConcreteComponent implements EmployeeComponent {

    private String name;
    private boolean gender; // true means male, false means female.

    public EmployeeConcreteComponent(String name, boolean gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean getGender() {
        return gender;
    }

    @Override
    public void join(Date joinDate) {
        System.out.println(this.getName()
                + " joined on " + formatDate(joinDate));
    }

    @Override
    public void terminate(Date terminateDate) {
        System.out.println(this.getName()
                + " terminated on " + formatDate(terminateDate));
    }

    @Override
    public void doTask() {
        // Unassigned task
    }

}
