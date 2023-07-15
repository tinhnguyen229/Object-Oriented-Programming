package command;

public class AccountController {
    private Command account;

    public AccountController(Command account) {
        this.account = account;
    }

    public void setCommand(Command command) {
        account = command;
    }

    public void logInAccount() {
        System.out.println("---------------------");
        System.out.println("User want to login.");
        account.execute();
    }

    public void logOutAccount() {
        System.out.println("---------------------");
        System.out.println("User want to log out.");
        account.execute();
    }

    public void undo() {
        System.out.println("---------------------");
        System.out.println("User want to undo.");
        account.undo();
    }

    public void redo() {
        System.out.println("---------------------");
        System.out.println("User want to redo.");
        account.redo();
    }

}
