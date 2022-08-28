package chaitanyaMankar;
class Calculator
{
	int n1 = 1;
	int n2 = 2;
	int n3 = 0;
 
	void add()
		{
		n3 = n1 + n2;
		System.out.println("Addition is" +n3);
		}
 
	void sub()
		{
		n3 = n1 - n2;
		System.out.println("Subtraction is" +n3);
		}
 
	void mult()
		{
		n3 = n1 * n2;
		System.out.println("Multiplication is" +n3);
		}
 
	void divi()
		{
		n3 = n1/n2;
		System.out.println("Division is" +n3);
		}
 
 public static void main(String[] args)
	{
	Calculator a = new Calculator();
	a.add();
	a.sub();
	a.mult();
	a.divi();
	}
}

