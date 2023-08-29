package main.java.gof.pattern.behavioral.state;

class ConcreteStateA implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Operation has been performed in state A");
        context.setState(new ConcreteStateB());
    }
}
