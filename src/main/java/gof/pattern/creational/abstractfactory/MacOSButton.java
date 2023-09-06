package main.java.gof.pattern.creational.abstractfactory;

class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Draw buttons in MacOS style");
    }
}
