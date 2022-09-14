package harshalRane.basic;

class SimpleInterest{
	
	void computeSimpleInterest(int principle, double time, double rate){
		double simpleInterest;
		simpleInterest = (principle * time * rate)/100;
		System.out.println("\nPrinciple Amount: "+principle+" | Years: "+time+" | Interest Rate "+rate+"");
		System.out.println("--------------------------------------------------------");
		System.out.println("Simple Interest calculated is: ---> " +simpleInterest);
		System.out.println("--------------------------------------------------------");
	}
	
	void convertTemperatureToFahrenheit(double fahrenheit){
		double celsius = ((fahrenheit - 32)*5)/9;
		System.out.println("Temperature converted from Fahrenheit "+fahrenheit+" to Celsius is --> "+celsius+"");
		System.out.println("--------------------------------------------------------");
	}
	
	public static void main(String[] args){
		SimpleInterest simpleInterest = new SimpleInterest();
		simpleInterest.computeSimpleInterest(3500, 2.5,8.6);
		simpleInterest.convertTemperatureToFahrenheit(95.4);
	}
}