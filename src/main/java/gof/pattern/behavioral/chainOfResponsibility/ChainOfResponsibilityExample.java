package main.java.gof.pattern.behavioral.chainOfResponsibility;

public class ChainOfResponsibilityExample {

    public static void main(String[] args) {

        AuthHandler authChain = new UsernamePasswordAuthHandler();
        authChain.setSuccessor(new TwoFactorAuthHandler());
        authChain.successor.setSuccessor(new GuestAuthHandler());

        authChain.handleRequest("admin", "admin");
        authChain.handleRequest("user", "123");
        authChain.handleRequest("guest", "guest");
    }

}
