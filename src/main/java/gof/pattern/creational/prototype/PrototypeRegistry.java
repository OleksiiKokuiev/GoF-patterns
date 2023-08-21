package main.java.gof.pattern.creational.prototype;

import java.util.HashMap;
import java.util.Map;

// it could be realized like a cache
public class PrototypeRegistry {
    private Map<String, Prototype> prototypes = new HashMap<>();

    public void addPrototype(String key, Prototype prototype) {
        prototypes.put(key, prototype);
    }

    public Prototype getPrototype(String key) {
        return prototypes.get(key).clone();
    }
}
