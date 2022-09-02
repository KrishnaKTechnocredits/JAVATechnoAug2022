package hemanshi;

public class Assignment11 {
	
	void  CalSimpleInterest(double p,double t,double r) {
		double simpleInterest = (p * t * r) / 100;
		System.out.println("Simple interest is : " + simpleInterest);
		}
	
	
	void ConvertTemperature(double fahrenheit) {
		double celsius = ((fahrenheit - 32)* 5 ) /9;
		System.out.println("Temperature in Celsius is :" + celsius);
		
	}
	
	public static void main(String args[]) {
		Assignment11 assignment11 = new Assignment11();
		assignment11.CalSimpleInterest(400, 5.4, 2.8);
		assignment11.ConvertTemperature(40.0);
		
		
	}

}
