package main.java.gof.pattern.behavioral.chainOfResponsibility;

class UsernamePasswordAuthHandler extends AuthHandler {
    @Override
    public void handleRequest(String username, String password) {
        if (username.equals("admin") && password.equals("admin")) {
            System.out.println("UsernamePasswordAuthHandler: Successfully authenticated.");
        } else if (successor != null) {
            successor.handleRequest(username, password);
        } else {
            System.out.println("UsernamePasswordAuthHandler: Authentication failed.");
        }
    }
}
