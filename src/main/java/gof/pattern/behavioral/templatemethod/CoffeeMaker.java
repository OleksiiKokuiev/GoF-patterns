package main.java.gof.pattern.behavioral.templatemethod;

public class CoffeeMaker extends BeverageMaker {
    @Override
    protected void brew() {
        System.out.println("Brewing a coffee");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding a milk and sugar");
    }
}
