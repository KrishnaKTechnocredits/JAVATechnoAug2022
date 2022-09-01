package narendraD;

public class CalulateSimpleInterestAndTemperatureUnitConverter {
	
	void getSimpleInterest(double principalAmount, double tenure, double rateofInterest) {
		
		if (principalAmount>0 && tenure>0 && rateofInterest>0 )
		{
		   double simpleInterest = (principalAmount * tenure * rateofInterest)/100;
		   System.out.printf("Total interest for this tenure is: " +"%.2f",simpleInterest);
		}
		else
		{
			System.out.println("Invalid Values Entered");
		}
		
	}
	
	void convertTemperatureType(double inputfahrenheit  ) {
		
		double  getcelsius = ((inputfahrenheit - 32) * 5 / 9); 
		System.out.printf("\n"+ "\n" + inputfahrenheit + "°F is: " + "%.2f",getcelsius);
		System.out.println("°C");
		
	}

	public static void main(String[] args) {
		
		new CalulateSimpleInterestAndTemperatureUnitConverter().getSimpleInterest(347000, 5.5, 11.3);
		new CalulateSimpleInterestAndTemperatureUnitConverter().convertTemperatureType(100.33);
		

	}

}
