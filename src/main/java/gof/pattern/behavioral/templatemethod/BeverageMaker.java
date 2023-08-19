package main.java.gof.pattern.behavioral.templatemethod;

// Abstract base class which define template method
abstract class BeverageMaker {

    // Template method which define preparing beverage process
    // It defines particular sequence of steps to get ready beverage
    // ideally should be finalized
    public final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected void boilWater() {
        System.out.println("Boiling water");
    }

    protected abstract void brew();

    protected void pourInCup() {
        System.out.println("Pouring in cup");
    }

    protected abstract void addCondiments();
}
