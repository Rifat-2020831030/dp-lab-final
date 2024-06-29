package question2.lab2.src.notification;

public interface Notifation {
    void setMethod(Notifation method);
    void notification(String stockName, float stockPrice);
}
