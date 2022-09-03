package vinod.TestPrograme;

public class Simpleinterest {
	
	double si;
	double cs;
	
	void simplei(int principle, int rate, int time) {
		si = (principle * rate * time)/100;
		System.out.println("Principle amount is "+principle);
		System.out.println("Rate of interest "+rate);
		System.out.println("Time "+ time + "years");
		System.out.println("Simple interest "+ si);
		
	}
	void temp(int farenheit) {
		cs = (farenheit -32) *5/9;
		System.out.println("Temprature is "+ cs);
	}
	public static void main(String[] args) {
		Simpleinterest simpleinterest = new Simpleinterest();
		simpleinterest.simplei(100, 15, 5);
		System.out.println("   ");
		simpleinterest.temp(100);
	}

}
