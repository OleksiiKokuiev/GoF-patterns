package main.java.gof.pattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class ConcretePrototype1 implements Prototype {
    private final int value;
    private List<String> colors;

    public ConcretePrototype1(int value, List<String> colors) {
        this.value = value;
        this.colors = colors;
    }

    @Override
    public Prototype clone() {
        try {
            ConcretePrototype1 cloned =  (ConcretePrototype1) super.clone();
            cloned.colors = new ArrayList<>(colors); // Deep copy of the list
            return cloned;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "ConcretePrototype1{" +
                "value=" + value +
                ", colors=" + colors +
                '}';
    }
}
