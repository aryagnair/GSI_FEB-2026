package assignment;
 
abstract class Payment
{
	int amount;
	abstract void makePayment();
	void paymentDetails()
	{
		System.out.println("Payment Amount: "+amount);
	}
}

class CreditCardPayment extends Payment
{
      void makePayment()
      {
    	 paymentDetails();
    	System.out.println("Paid " + amount + " using Credit Card ending with 1234");  
      }
}
class UPIPayment  extends Payment
{
    void makePayment()
    {
     paymentDetails();
    	System.out.println("Paid " + amount + " using UPI ID: user@upi"); 
    }

	
}
public class EcommercePaymentSystem {

	public static void main(String[] args) {
	Payment pay=new CreditCardPayment();
	
		pay.amount=5000;
		pay.makePayment();
		Payment upay=new UPIPayment();
		
		upay.amount=1500;
		upay.makePayment();
	}
}

