package main.java.gof.pattern.creational.factorymethod.creator;

import main.java.gof.pattern.creational.factorymethod.product.ConcreteProductB;
import main.java.gof.pattern.creational.factorymethod.product.Product;

public class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
