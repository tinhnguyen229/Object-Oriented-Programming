package command;

public class TestMain {
    public static void main(String[] args) {
        // Create Receiver.
        Account an = new Account("An Thu Phung");
        // Create Command, and associate it with receiver.
        Command logOut = new LogOut(an);
        // Create invoker, and associate it with specific command.
        AccountController facebook = new AccountController(logOut);

        facebook.logOutAccount();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        facebook.undo();
        facebook.redo();

        facebook.setCommand(new LogIn(an));
        facebook.logInAccount();
    }
}
