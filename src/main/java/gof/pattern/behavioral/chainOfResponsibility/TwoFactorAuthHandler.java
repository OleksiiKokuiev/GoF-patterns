package main.java.gof.pattern.behavioral.chainOfResponsibility;

class TwoFactorAuthHandler extends AuthHandler {
    @Override
    public void handleRequest(String username, String password) {
        if (username.equals("user") && password.equals("123")) {
            System.out.println("TwoFactorAuthHandler: Successfully authenticated with two-factor.");
        } else if (successor != null) {
            successor.handleRequest(username, password);
        } else {
            System.out.println("TwoFactorAuthHandler: Authentication failed.");
        }
    }
}
