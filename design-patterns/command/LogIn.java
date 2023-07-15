package command;

public class LogIn implements Command {
    private Account account;

    public LogIn(Account account) {
        this.account = account;
    }

    @Override
    public void execute() {
        account.logIn();
    }

    @Override
    public void undo() {
        account.logOut();
    }

    @Override
    public void redo() {
        account.logIn();
    }
}
