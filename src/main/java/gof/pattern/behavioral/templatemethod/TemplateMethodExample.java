package main.java.gof.pattern.behavioral.templatemethod;

public class TemplateMethodExample {

    public static void main(String[] args) {

        System.out.println("Tea preparing:");
        BeverageMaker teaMaker = new TeaMaker();
        teaMaker.prepareBeverage();

        System.out.println("\nCoffee preparing:");
        BeverageMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.prepareBeverage();
    }
}
