public class PaymentService {
    private PaymentAdaptor paymentAdaptor;

    PaymentService(PaymentAdaptor paymentAdaptor) {
        this.paymentAdaptor = paymentAdaptor;
    }

    public void pay() {
        this.paymentAdaptor.payThroughCard();
    }
}
