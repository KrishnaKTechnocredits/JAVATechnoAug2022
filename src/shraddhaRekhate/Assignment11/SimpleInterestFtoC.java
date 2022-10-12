package shraddhaRekhate.Assignment11;

public class SimpleInterestFtoC {
	void simpleInterest(double principle,double rate,double time) {
		double SI=0;
		SI=(principle*rate*time)/100;
		System.out.println(SI);
	}
	
	void fahrenheitToCelsius(double f) {
		double c= (f-32)/1.8000;
		System.out.println(c);
	}

	public static void main(String[] args) {
		SimpleInterestFtoC simpleInterestFtoC=new SimpleInterestFtoC();
		simpleInterestFtoC.simpleInterest(1000, 20, 3);
		simpleInterestFtoC.fahrenheitToCelsius(50);

	}

}
