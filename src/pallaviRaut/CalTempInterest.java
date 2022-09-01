package pallaviRaut;

class CalTempInterest {
	private static CalTempInterest caltempinterest;

	void covertTemperature(float fahrenheit)
	{
		float celsius=(fahrenheit-32)*5/9;
		System.out.println(fahrenheit+" fahrenheit is =>" +celsius+" Celcius");
		System.out.println("-----------------------------------------------");
	}
	
	void calInterest(double amt,int year,double rate)
	{
		System.out.println("Amount is "+amt);
		System.out.println("For Year "+year);
		System.out.println("Rate  "+rate);
		double interest= (amt*year*rate)/100;
		System.out.println("Simple Interest is as: "+interest);
		System.out.println("-----------------------------------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalTempInterest.caltempinterest =new CalTempInterest();
		caltempinterest.calInterest(55055.6,5,5.5);
		caltempinterest.covertTemperature(39);
	}
}

