package question2.lab2.src;

import question2.lab2.src.notification.*;

public class Client {
    public static void main(String[] args) throws Exception {

        Stock apple = new Stock("apple", 100);
        Stock google = new Stock("google", 200);

        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");
        User user4 = new User("user4");

        Method sms = new SMS();
        Method email = new Email();
        user1.setMethod(sms);
        user2.setMethod(email);

        apple.register(user1);
        apple.register(user2);

        apple.setStockPrice(150);

        // System.out.println("\n\nNew Stock price set for google");

        // google.register(user3);
        // google.register(user4);

        // google.setStockPrice(250);

        // System.out.println("\n\nNew Stock price set for apple");
        // apple.unregister(user1);
        // apple.setStockPrice(200);
    }
}
