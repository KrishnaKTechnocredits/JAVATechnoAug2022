package abhijeet;

class Calculator{
	int Number1=20;
	int Number2=10;
	int ans;
	
	void Display(){
		System.out.println("Number1 = " + Number1);
		System.out.println("Number2 = " + Number2);
	}	
	
	void Addition(){
		ans = Number1 + Number2;
		System.out.println("Addition = "+ ans);
	}
	
	void Substarction(){
		ans = Number1 - Number2;
		System.out.println("Substraction = "+ ans);
	}
	
	void Multiplication(){
		ans = Number1 * Number2;
		System.out.println("Multiplication = "+ ans);
	}	
	
	void Division(){
		ans = Number1 / Number2;
		System.out.println("Division = "+ ans);
	}	
	
	public static void main(String[] args){
		Calculator cal = new Calculator();
		cal.Display();
		cal.Addition();
		cal.Substarction();
		cal.Multiplication();
		cal.Division();
	}
}