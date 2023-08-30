package main.java.gof.pattern.behavioral.strategy;

class MultiplicationOperation implements MathOperation {
    @Override
    public int performOperation(int a, int b) {
        return a * b;
    }
}
