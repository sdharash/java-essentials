import java.util.ArrayList;

public class OrderService {

    private static OrderService instance = null;
    private ArrayList<OnOrderPlacedSubscriber> subscribers = new ArrayList<>();

    private OrderService() {}

    public static OrderService getInstance() {
        if (instance == null) {
            instance = new OrderService();
        }
        return instance;
    }

    public void registerSubscriber(OnOrderPlacedSubscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void deRegisterSubscriber(OnOrderPlacedSubscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    public void onOrderPlaced() {
        for (OnOrderPlacedSubscriber subscriber: this.subscribers) {
            subscriber.onOrderPlaced();
        }
    }
}
