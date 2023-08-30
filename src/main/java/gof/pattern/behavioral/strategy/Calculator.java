package main.java.gof.pattern.behavioral.strategy;

class Calculator {
    private MathOperation operation;

    public void setOperation(MathOperation operation) {
        this.operation = operation;
    }

    public int executeOperation(int a, int b) {
        if (operation != null) {
            return operation.performOperation(a, b);
        }
        throw new UnsupportedOperationException("No operation set");
    }
}
