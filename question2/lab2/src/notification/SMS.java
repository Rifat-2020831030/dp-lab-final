package question2.lab2.src.notification;

public class SMS extends Method{
    @Override
    public void notify(String stockName, float stockPrice){
        System.out.println("Notification through SMS");
        System.out.println("Stock Name : " + stockName + " Stock Price : " + stockPrice);
    }
}
