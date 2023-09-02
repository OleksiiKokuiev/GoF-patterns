package main.java.gof.pattern.structural.bridge;

public class OnOffFunctionality implements Functionality {
    @Override
    public void performFunction() {
        System.out.println("Device is turned on/off.");
    }
}
