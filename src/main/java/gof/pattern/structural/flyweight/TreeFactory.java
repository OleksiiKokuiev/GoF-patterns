package main.java.gof.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

class TreeFactory {
    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color) {
        String key = name + "_" + color;

        if (!treeTypes.containsKey(key)) {
            treeTypes.put(key, new TreeType(name, color));
        }

        return treeTypes.get(key);
    }
}
