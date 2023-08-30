package main.java.gof.pattern.behavioral.strategy;

class SubtractionOperation implements MathOperation {
    @Override
    public int performOperation(int a, int b) {
        return a - b;
    }
}
