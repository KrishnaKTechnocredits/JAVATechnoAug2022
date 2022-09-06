package aditiIngle;
class Assign_11_ParameterisedMethod{
	void simpleInterest(int p, int t, double r){
		double simpleInterest=0;
		simpleInterest=(p*t*r)/100;
		System.out.println("Calculated Simple Interest is : " + simpleInterest);
	}
	void temperatureConvert(double fahrenheit){
		double celsius =0;
		celsius = (fahrenheit - 32)* 5 / 9;
		System.out.println("Converted Fahrenheit to Celsius value is : " + celsius);
	}
	
	public static void main(String[] args){
		Assign_11_ParameterisedMethod parameterisedMethod = new Assign_11_ParameterisedMethod();
		parameterisedMethod.simpleInterest(2000,3,2.5);
		parameterisedMethod.temperatureConvert(100.20);
	}
}