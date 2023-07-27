package main.java.gof.pattern.creational.factorymethod;

import main.java.gof.pattern.creational.factorymethod.creator.ConcreteCreatorA;
import main.java.gof.pattern.creational.factorymethod.creator.ConcreteCreatorB;
import main.java.gof.pattern.creational.factorymethod.creator.Creator;
import main.java.gof.pattern.creational.factorymethod.product.Product;

public class FactoryMethodExample {

    public static void main(String[] args) {

        // Objects creating using factory methods
        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.factoryMethod();
        productA.display();

        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.factoryMethod();
        productB.display();
    }

}

