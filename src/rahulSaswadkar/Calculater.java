package rahulSaswadkar;

class Calculater{
	public static void main(String[] args){
		Calculater c1 = new Calculater();
		c1.addition();
		c1.subtraction();
		c1.multiplication();
		c1.division();	
	}	
	
	int a = 10;
	int b = 5;
	int ans;//Default value of 0 assigned to Integer type variable 'ans' 
	
	void addition(){
		ans = a + b;
        System.out.println("Addition result is : " + ans);		
	}
	
	void subtraction(){
		ans = a - b;
        System.out.println("Subtraction result is : " + ans);		
	}
	
	void multiplication(){
		ans = a * b;
        System.out.println("Multiplication result is : " + ans);		
	}
	
	void division(){
		ans = a / b;
        System.out.println("Division result is : " + ans);		
	}
}