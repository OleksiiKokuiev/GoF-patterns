package main.java.gof.pattern.behavioral.state;

class Context {
    private State state;

    public Context() {
        state = new ConcreteStateA(); // initial state
    }

    public void setState(State state) {
        this.state = state;
    }

    public void doAction() {
        state.doAction(this);
    }
}
