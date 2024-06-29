package question2.lab2.src.notification;

public class Method implements Notifation{

    private Notifation method;

    public void setMethod(Notifation method) {
        this.method = method;
    }

    @Override
    public void notification(String stockName, float stockPrice) {
        //System.out.println("Stock Name: " + stockName + ", Stock Price: " + stockPrice);
    }
    
}
