package nikeshM;

public class SimpleInterest {
	void interest (int principalAmount, int time, int rate ) {
		double interest;
		interest = principalAmount*time*rate;
		System.out.println("Total interest is " +interest );
	}
	public static void main(String [] args) {
		SimpleInterest finalAmount = new SimpleInterest ();
		finalAmount.interest(1000, 1 , 5);
		
	}
}
