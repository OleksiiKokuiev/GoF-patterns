package main.java.gof.pattern.behavioral.state;

public class StateExample {

    public static void main(String[] args) {
        Context context = new Context();

        context.doAction(); // Operation has been performed in state A
        context.doAction(); // Operation has been performed in state B
        context.doAction(); // Operation has been performed in state A
    }

}
