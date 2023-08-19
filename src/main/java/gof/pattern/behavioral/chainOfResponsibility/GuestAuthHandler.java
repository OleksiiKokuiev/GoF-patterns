package main.java.gof.pattern.behavioral.chainOfResponsibility;

class GuestAuthHandler extends AuthHandler {
    @Override
    public void handleRequest(String username, String password) {
        System.out.println("GuestAuthHandler: Successfully authenticated as a guest.");
    }
}
