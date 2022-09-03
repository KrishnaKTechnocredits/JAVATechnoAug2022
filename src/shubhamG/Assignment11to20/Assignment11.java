package shubhamG;

public class Assignment11 {
	
	void simpleInterest(int principle, int time, double rate) {
		double interest=0;
		interest=((principle*time*rate)/100);
		System.out.println("Simple interest is : "+interest);
	}
	
	void Temperature(double fahrenheit) {
		double celsius=0;
		celsius =((fahrenheit-32)*5)/9;
		System.out.println("Temperature in celcius is : "+celsius);
	}
	
	public static void main(String[] args) {
		Assignment11 assignment11=new Assignment11();
		assignment11.simpleInterest(51450,4,6.75);
		assignment11.Temperature(99.8);
	}
	

}
