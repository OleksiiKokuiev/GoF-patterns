package main.java.gof.pattern.behavioral.state;

class ConcreteStateB implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Operation has been performed in state B");
        context.setState(new ConcreteStateA());
    }
}
