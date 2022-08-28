package titikshaG;
class Cal
{
		int n1=1;
		int n2=5;
	void add()
	{
		int sum=n1+n2;
		System.out.println("Sum is"+sum);
	}
	void sub()
{
		int sub=n1-n2;
		System.out.println("sub is"+sub);
	
}
	void mult()
{
		int mult=n1*n2;
		System.out.println("mult is"+mult);
}
	void div()
{
		int div=n1/n2;
		System.out.println("div is"+div);
}

	public static void main(String[] a)
{
		Cal s1=new Cal();
		s1.add();
		s1.sub();
		s1.mult();
		s1.div();
}	
	}
	
