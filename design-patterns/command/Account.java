package command;

import java.util.Date;

public class Account {
    private String name;

    public Account(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void logIn() {
        System.out.println(name + " logged in at " + new Date());
    }

    public void logOut() {
        System.out.println(name + " logged out at " + new Date());
    }
}
