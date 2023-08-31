package main.java.gof.pattern.structural.flyweight;

public class FlyweightExample {

    public static void main(String[] args) {
        TreeType greenTree = TreeFactory.getTreeType("Oak", "Green");
        TreeType redTree = TreeFactory.getTreeType("Maple", "Red");

        greenTree.display(10, 20);
        redTree.display(30, 40);
    }

}
