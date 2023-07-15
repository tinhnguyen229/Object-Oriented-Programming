package command;

public class LogOut implements Command {
    private Account account;

    public LogOut(Account account) {
        this.account = account;
    }

    @Override
    public void execute() {
        account.logOut();
    }

    @Override
    public void undo() {
        account.logIn();
    }

    @Override
    public void redo() {
        account.logOut();
    }
}
