package main.java.gof.pattern.creational.prototype;

import java.util.Arrays;

public class ConcretePrototype2 implements Prototype {
    private final String name;
    private int[] possibleNumbers;

    public ConcretePrototype2(String name, int[] possibleNumbers) {
        this.name = name;
        this.possibleNumbers = possibleNumbers;
    }

    @Override
    public Prototype clone() {
        try {
            ConcretePrototype2 cloned = (ConcretePrototype2) super.clone();
            cloned.possibleNumbers = possibleNumbers.clone(); // Creating a new array and copying elements
            return cloned;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "ConcretePrototype2{" +
                "name='" + name + '\'' +
                ", possibleNumbers=" + Arrays.toString(possibleNumbers) +
                '}';
    }
}
