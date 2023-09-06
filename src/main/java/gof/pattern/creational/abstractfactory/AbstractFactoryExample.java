package main.java.gof.pattern.creational.abstractfactory;

public class AbstractFactoryExample {

    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory();

        Button button = factory.createButton();

        button.paint();
    }

}
