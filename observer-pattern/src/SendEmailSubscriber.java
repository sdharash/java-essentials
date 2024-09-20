public class SendEmailSubscriber implements OnOrderPlacedSubscriber{

    SendEmailSubscriber() {
        OrderService orderService = OrderService.getInstance();
        orderService.registerSubscriber(this);
    }

    @Override
    public void onOrderPlaced() {
        System.out.println("Sent Email as order is placed");
    }

}
