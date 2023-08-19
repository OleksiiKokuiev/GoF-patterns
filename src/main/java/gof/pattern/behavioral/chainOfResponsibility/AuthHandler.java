package main.java.gof.pattern.behavioral.chainOfResponsibility;

abstract class AuthHandler {

    protected AuthHandler successor;

    public void setSuccessor(AuthHandler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(String username, String password);

}
