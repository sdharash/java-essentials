public class Client {
    Client() {}

    public static void main(String[] args) {

        OrderService orderService = OrderService.getInstance();
        SendEmailSubscriber emailSubscriber = new SendEmailSubscriber();
        GenerateInvoiceSubscriber generateInvoiceSubscriber = new GenerateInvoiceSubscriber();
        orderService.onOrderPlaced();
    }
}
