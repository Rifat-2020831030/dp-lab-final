package question2.lab2.src;

import java.util.ArrayList;
import java.util.List;

public class Stock implements StockInterface{
    private List<Subscriber> subscribers;
    String stockName;
    private float stockPrice;

    public Stock(String stockName, float stockPrice) {
        this.stockName = stockName;
        subscribers = new ArrayList<>();
        this.stockPrice = stockPrice;
    }

    @Override
    public void register(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unregister(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(float stockPrice) {
        for (Subscriber subscriber : subscribers) {
            subscriber.notification(stockName, stockPrice);
        }

    }

    public void setStockPrice(float newPrice){
        this.stockPrice = newPrice;
        notifySubscribers(stockPrice);
    }

    public float getStockPrice(){
        return stockPrice;
    }
    
}
