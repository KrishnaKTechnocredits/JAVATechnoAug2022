package chaitanyaMankar;

public class Return
{
	static boolean m1(int num)
	{
		if(num%2==0)
		{
			return true;
		}
		else if (num%3 ==0)
		{
			return false;
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		boolean b1 = m1(20);
		System.out.println(b1);
		boolean b2 = m1(35);
		System.out.println(b2);
	}
}
