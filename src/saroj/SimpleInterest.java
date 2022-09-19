package saroj;

public class SimpleInterest {

	int simInterest;
	double celsius;
	
	void findSimpleInterest(int p, int t, int r) {
		simInterest = (p*t*r)/100;
	}
	
	void temperature(int farenhite) {
		celsius = (farenhite-32)*5/9;
	}
	
	void displayInfo() {
		System.out.println("Simple interest: "+simInterest);
		System.out.println("Temperature in Celisius is: "+celsius);
	}
	
	public static void main(String[] args) {
		SimpleInterest simpleInterest = new SimpleInterest();
		simpleInterest.findSimpleInterest(5000,2, 10);
		simpleInterest.temperature(25);
		simpleInterest.displayInfo();
	}
}
