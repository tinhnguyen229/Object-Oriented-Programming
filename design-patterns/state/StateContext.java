package state;

public class StateContext {
    private String name;
    private State state;

    public StateContext(String name) {
        this.name = name;
    }

    public StateContext(String name, State state) {
        this.name = name;
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("---------------");
        state.feeling(this);
    }
}
