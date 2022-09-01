package jagruti;

public class Assignment11_JagrutiM
{
	//a method to compute simple interest   
	void CalculateSimpleInterest(int P,int T,int R)
	{		
		double SI;//Simple Interest;
		SI = (P * T * R) / 100;
		System.out.println("Simple Interest : "+SI);		
	}
	//method to convert temperature from Fahrenheit to Celsius degree.
	void ConvertTemp(double fahrenheit)
	{
		double Celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temperature in Celsius : "+Celsius);	
	}
	public static void main(String[] args)
	{
		Assignment11_JagrutiM assignment11_JagrutiM = new Assignment11_JagrutiM();
		assignment11_JagrutiM.CalculateSimpleInterest(5000,2,10);
		assignment11_JagrutiM.ConvertTemp(54);		
	}

}
