package rohini;
//Assignment 11
public class SimpleInterest {
	void simpleInt(double principle, double time, double rate)
	{
		double s;
		s=(principle*time*rate)/100;
		System.out.println("Principle: "+principle+" Time: "+time+" Rate: "+rate);
		System.out.println("Simple Interest is: "+s);	
		System.out.println("***********************************************************");
	}
	void fahrenheit(double fahrenheit)
	{
		double celsius;
		celsius=(fahrenheit-32)*5/9;
		System.out.println("Fahrenheit is: "+fahrenheit);
		System.out.println("Temperature from Fahrenheit to Celsius degree is:"+celsius);
	}
	public static void main(String[] args)
	{
		SimpleInterest simpleInterest=new SimpleInterest();
		simpleInterest.simpleInt(1500, 3.5, 5.6);
		simpleInterest.fahrenheit(35.4);
	}
}
