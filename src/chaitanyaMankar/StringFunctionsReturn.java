package chaitanyaMankar;


public class StringFunctionsReturn 
{
	String reverseName(String Name)
	{
		String rName = "";
		for(int i = rName.length()-1;i>0;i--)
		{
			rName = rName + rName.charAt(i);
			System.out.println("Char");
		}
		return rName;
	}

	public static void main(String[] args) 
	{
		StringFunctionsReturn sope = new StringFunctionsReturn();
		String C = sope.reverseName("Chaitanya");
		System.out.println(C);
	}

}
