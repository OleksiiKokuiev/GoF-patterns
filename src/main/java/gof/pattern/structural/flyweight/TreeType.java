package main.java.gof.pattern.structural.flyweight;

class TreeType implements Tree {
    private final String name;
    private final String color;

    public TreeType(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Drawing a " + color + " " + name + " tree at coordinates (" + x + "," + y + ")");
    }
}
