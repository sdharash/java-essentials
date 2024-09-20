public class RazorpayAdaptor implements PaymentAdaptor{
    ThirdPartyRazorpayImpl thirdPartyRazorpay = new ThirdPartyRazorpayImpl();

    RazorpayAdaptor() {

    }

    @Override
    public void payThroughCard() {
        System.out.println("This will be connecting with thord party Razorpay adaptor");
        System.out.println("Paying through card using Razorpay adaptor");
        thirdPartyRazorpay.payThroughCard();
    }
}
