package main.java.gof.pattern.creational.factorymethod.creator;

import main.java.gof.pattern.creational.factorymethod.product.ConcreteProductA;
import main.java.gof.pattern.creational.factorymethod.product.Product;

public class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
