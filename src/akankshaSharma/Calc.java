package akankshaSharma;
class Calc{
	
	void add(int n1, int n2)
		{
		System.out.println("Addition is " + (n1+n2));
		}
	
	void sub(int n1, int n2)
		{
		System.out.println("Subtraction is " +(n1-n2));
		}
	
	void mul(int n1 ,int n2)
		{
		System.out.println("Multiplication is "+(n1*n2));
		}
	
	void div(int n1,int n2)
		{
		System.out.println("Division is " + (n1/n2));
		}
	
	public static void main(String[] args)
		{
			Calc cal = new Calc(); 
			cal.add(1000,2000);
			cal.sub(400,300);
			cal.mul(10,10);
			cal.div(200,2);
		}
}