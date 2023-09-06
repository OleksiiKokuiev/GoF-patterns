package main.java.gof.pattern.creational.abstractfactory;

class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
