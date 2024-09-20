public class Client {

    Client() {}

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(new RazorpayAdaptor());
        paymentService.pay();
    }
}
