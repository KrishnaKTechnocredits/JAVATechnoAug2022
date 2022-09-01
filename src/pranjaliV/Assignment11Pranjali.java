package pranjaliV;

public class Assignment11Pranjali {

	void simpleInterest(int principleAmt,int year,int rate) {
		double simpleInt = (principleAmt * year * rate)/100;
		System.out.println("Simple Interest for Principle amount " + principleAmt + " for " +year+" years with rate of interest as " + rate + " is: " + simpleInt);
	}
	
	void TempConversion(int fahrenheit) {
		double celsius = ((fahrenheit - 32)* 5)/9 ;
		System.out.println(fahrenheit + " Fahrenheit = " + celsius + " Celsius");
	}
	
	public static void main(String[] args) {
		Assignment11Pranjali assignment11 = new Assignment11Pranjali();
		assignment11.simpleInterest(1000,5,8);
		assignment11.TempConversion(98);
	}

}
