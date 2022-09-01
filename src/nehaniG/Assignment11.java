package nehaniG;

public class Assignment11 {
	void interest (double principle, double time, double rate) {
		 double Simple = (principle * time * rate) /100; 
		System.out.println("Simple Interest :" +Simple);
	}

	void celsius (double fahrenheit) {
		double Celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Celsius is :" +Celsius);
	}
	
	public static void main(String[] args) {
		Assignment11 assignment11 = new Assignment11();
		assignment11.interest(7500,5,7.77);
		assignment11.celsius(104);
	}
}


