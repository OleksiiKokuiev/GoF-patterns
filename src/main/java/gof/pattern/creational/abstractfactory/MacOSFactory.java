package main.java.gof.pattern.creational.abstractfactory;

class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }
}
