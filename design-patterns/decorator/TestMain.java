package decorator;

public class TestMain {
    public static void main(String[] args) {
        EmployeeComponent employee = new EmployeeConcreteComponent("An Phung", false);

        System.out.println("NORMAL EMPLOYEE: ");
        employee.showBasicInformation();
        employee.doTask();

        System.out.println("\nTEAM MEMBER: ");
        EmployeeComponent teamMember = new TeamMember(employee);
        teamMember.showBasicInformation();
        teamMember.doTask();

        System.out.println("\nTEAM LEADER: ");
        EmployeeComponent teamLeader = new TeamLeader(employee);
        teamLeader.showBasicInformation();
        teamLeader.doTask();

        System.out.println("\nMANAGER: ");
        EmployeeComponent manager = new Manager(employee);
        manager.showBasicInformation();
        manager.doTask();

        System.out.println("\nTEAM LEADER AND MANAGER: ");
        EmployeeComponent teamLeaderAndManager = new Manager(teamLeader);
        teamLeaderAndManager.showBasicInformation();
        teamLeaderAndManager.doTask();
    }
}
