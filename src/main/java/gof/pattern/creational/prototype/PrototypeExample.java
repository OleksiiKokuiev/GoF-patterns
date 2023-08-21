package main.java.gof.pattern.creational.prototype;

import java.util.List;

public class PrototypeExample {
    public static void main(String[] args) {

        PrototypeRegistry registry = new PrototypeRegistry();

        Prototype prototype1 = new ConcretePrototype1(10, List.of("red", "green", "blue"));
        Prototype clone1 = prototype1.clone();
        registry.addPrototype("clone1", clone1);
        System.out.println(registry.getPrototype("clone1"));

        Prototype prototype2 = new ConcretePrototype2("Prototype", new int [] {1, 2, 3});
        Prototype clone2 = prototype2.clone();
        registry.addPrototype("clone2", clone2);
        System.out.println(registry.getPrototype("clone2"));
    }
}
