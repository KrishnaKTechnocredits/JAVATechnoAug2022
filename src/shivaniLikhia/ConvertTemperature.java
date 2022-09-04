package shivaniLikhia;

public class ConvertTemperature {
	
	void convertTemp(double F){
		double celcius = (F - 32) * 5 / 9;
		System.out.println("The Celcius Temperature is : " +celcius);
	}
	
	public static void main(String[] args){
		new ConvertTemperature().convertTemp(85);
	}

}
