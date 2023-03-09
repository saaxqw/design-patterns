package behavioral.State;

public class StartState implements State {
    @Override
    public void doAction(StateContext context) {
        System.out.println("Player in start state...");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "StartState{}";
    }
}
