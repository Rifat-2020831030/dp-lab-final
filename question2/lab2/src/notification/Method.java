package question2.lab2.src.notification;

public class Method implements Notification{

    @Override
    public void notify(String stockName, float stockPrice) {
        System.out.println("Generic Notification");
        System.out.println("Stock Name : " + stockName + " Stock Price : " + stockPrice);
    }
    
}
