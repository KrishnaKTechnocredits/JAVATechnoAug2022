package rahulSaswadkar;

public class SimpleIntAndTemp {
	public static void main(String[] args) {
		SimpleIntAndTemp simpleIntAndTemp = new SimpleIntAndTemp();
		simpleIntAndTemp.getSimpleInterest(10112.6, 2, 9.5);
		simpleIntAndTemp.getTempInCelcius(75.5);	
	}
	
	void getSimpleInterest(double principle, double time, double rate) {
		double result;
		result = (principle * time * rate) / 100;
		System.out.println("Simple Interest result is : Rs. " + result);
	}
	
	void getTempInCelcius(double temparature) {
		double result; 
		result = ((temparature - 32) * 5) / 9;
		System.out.println("Temparature in Celcius is : " + result +" Centigrade");
	}
	
	
}
