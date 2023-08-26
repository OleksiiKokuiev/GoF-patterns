package main.java.gof.pattern.structural.adapter;

class Client {

    public void performAction(TargetInterface target) {
        target.doNewAction();
    }
}
