package state;

public class SadState implements State {
    @Override
    public void feeling(StateContext person) {
        System.out.println(person.getName() + ": sad.");
        person.setState(new AngryState());
    }
}
