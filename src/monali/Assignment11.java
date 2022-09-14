package monali;

public class Assignment11 {
	void SimpleIntrest(double P,int Y,double R)
	{
		double SI=(P*Y*R)/100;
		System.out.println("The simple Intrest is "+SI);
		
	}
	void TempfromFartoCel(double Far)
	{
		double Celcius= (Far-32)*5/9;
		System.out.println("The tem from far to celcious is  "+Celcius);
	}

	public static void main(String[] args) {
		Assignment11 assignment11= new Assignment11();
		assignment11.SimpleIntrest(10, 02, 13.5);
		assignment11.TempfromFartoCel(12);
		// TODO Auto-generated method stub

	}

}
