package main.java.gof.pattern.behavioral.strategy;

class PlusOperation implements MathOperation {
    @Override
    public int performOperation(int a, int b) {
        return a + b;
    }
}
