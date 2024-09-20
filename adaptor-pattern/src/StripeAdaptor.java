public class StripeAdaptor implements PaymentAdaptor{
    ThirdPartyStripeImpl thirdPartyStripe = new ThirdPartyStripeImpl();

    StripeAdaptor() {}

    @Override
    public void payThroughCard() {
        System.out.println("Paying through card using Stripe adaptor");
        thirdPartyStripe.payUsingCardDetails();
    }
}
