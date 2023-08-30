package main.java.gof.pattern.behavioral.strategy;

public class StrategyExample {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Choose and set up concrete strategy
        calculator.setOperation(new PlusOperation());
        System.out.println("Addition: " + calculator.executeOperation(5, 3));

        calculator.setOperation(new SubtractionOperation());
        System.out.println("Subtraction: " + calculator.executeOperation(10, 4));

        calculator.setOperation(new MultiplicationOperation());
        System.out.println("Multiplication: " + calculator.executeOperation(6, 8));
    }

}
