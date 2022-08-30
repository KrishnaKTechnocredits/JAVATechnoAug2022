package kiran;

public class Ex11 {
	
	void simpleInterest(int p,int t, double r)
	{
		double SI = (p * t * r)/100 ;
		System.out.println("Simple interest "+SI);
	}

	void toCelsius(int f)
	{
		float Celsius = (f - 32) * 5 / 9;
		System.out.println("converted to celsius "+Celsius);
	}
	public static void main(String[] args) {
		Ex11 obj1=new Ex11();
		obj1.simpleInterest(15000,2,0.5);
		obj1.toCelsius(150);	

	}

}
