package main.java.gof.pattern.behavioral.mediator;

public class Main {

    public static void main(String[] args) {

        // create Mediator: it could be class or interface implementation
        ChatMediator mediator = new ChatMediatorImpl();

        // create users
        User user1 = new ChatUser("User 1", mediator);
        User user2 = new ChatUser("User 2", mediator);
        User user3 = new ChatUser("User 3", mediator);

        // register users in chat (Mediator)
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        // messaging between users
        user1.sendMessage("Hi all!");
        user2.sendMessage("Hi User 1!");
    }
}
