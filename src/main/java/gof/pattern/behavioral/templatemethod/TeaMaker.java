package main.java.gof.pattern.behavioral.templatemethod;

public class TeaMaker extends BeverageMaker {
    @Override
    protected void brew() {
        System.out.println("Brewing a tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding a lemon");
    }
}
