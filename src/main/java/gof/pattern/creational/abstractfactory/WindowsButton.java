package main.java.gof.pattern.creational.abstractfactory;

class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Draw button in Windows style");
    }
}
