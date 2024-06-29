package question2.lab2.src;

public interface StockInterface {
    void register(Subscriber subscriber);
    void unregister(Subscriber subscriber);
    void notifySubscribers(float stockPrice);
}
