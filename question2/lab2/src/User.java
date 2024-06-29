package question2.lab2.src;

public class User implements Subscriber {
    String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public void notification(String stockName, float stockPrice) {
        System.out.println("Notification for " + username + ":");
        System.out.println("Stock Name: " + stockName + ", Stock Price: " + stockPrice);
    }
    
}
