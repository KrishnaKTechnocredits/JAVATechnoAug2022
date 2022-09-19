package niveditaGavade;

public class InterestAndTemp {
	double inte=0;
	double celsius=0;
	void simpleInterest(int p, int t, double r){
		inte=(p*t*r)/100;
			System.out.println ("Simple interest is:"+inte);
	}
	void temperature(double fahrenheit){
		celsius = ((fahrenheit - 32) * 5 / 9);
			System.out.println("Temperature in celcius is:"+celsius);
	}
	public static void main(String[] args){
		InterestAndTemp interestAndTemp=new InterestAndTemp();
		interestAndTemp.simpleInterest(2000,2,9);
		interestAndTemp.simpleInterest(3000,1,(6.6));
		interestAndTemp.temperature(120);
		interestAndTemp.temperature(360);
	}

}
