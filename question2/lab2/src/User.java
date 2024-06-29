package question2.lab2.src;

import question2.lab2.src.notification.Method;

public class User implements Subscriber {
    String username;
    Method method;

    public User(String username) {
        this.username = username;
    }

    @Override
    public void notification(String stockName, float stockPrice) {
        System.out.println("Notification for " + username + ":");
        method.notify(stockName, stockPrice);
    }
    
    public void setMethod(Method method) {
        this.method = method;
    }
}
