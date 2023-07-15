package state;

public class HappyState implements State {
    @Override
    public void feeling(StateContext person) {
        System.out.println(person.getName() + ": happy.");
    }
}
