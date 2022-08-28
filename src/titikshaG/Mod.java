package titikshaG;
public class Mod
{
	int count=0;
	void rangeBtw3To7(int first ,int second)
	{
		for(;first<second;first++)
		{
			if(first%3==0 && first%7==0)
			{
			System.out.println("Mod of 3 to 7 is "+ " "+ first);
			count++;
		    }
		if(count>=3)
			break;
	    }
     }
	public static void main(String[] args)
		{
		Mod mod=new Mod();
		mod.rangeBtw3To7(20,100);
		}
}