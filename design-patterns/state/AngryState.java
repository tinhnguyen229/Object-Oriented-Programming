package state;

public class AngryState implements State {
    @Override
    public void feeling(StateContext person) {
        System.out.println(person.getName() + ": angry.");
    }
}
