public class GenerateInvoiceSubscriber implements OnOrderPlacedSubscriber {
    GenerateInvoiceSubscriber() {
        OrderService orderService = OrderService.getInstance();
        orderService.registerSubscriber(this);
    }

    @Override
    public void onOrderPlaced() {
        System.out.println("Generating invoice as order is placed");
    }
}
