package main.java.gof.pattern.behavioral.memento;

public class MementoExample {

    public static void main(String[] args) {
        Originator originator =  new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State 1");
        caretaker.addMemento(originator.saveStateToMemento());

        originator.setState("State 2");
        caretaker.addMemento(originator.saveStateToMemento());

        originator.setState("State 3");
        caretaker.addMemento(originator.saveStateToMemento());

        // State recovering
        originator.restoreStateFromMemento(caretaker.getMemento(1));
        System.out.println("Current State: " + originator.getState());
    }

}
