package state;

public class TestMain {
    public static void main(String[] args) {
        StateContext lana = new StateContext("Lana");
        lana.setState(new HappyState());
        lana.display();
        lana.setState(new AngryState());
        lana.display();

        State sad = new SadState();
        StateContext alan = new StateContext("Alan", sad);
        alan.display();
        alan.display();

    }
}
