package titikshaG;

public class Totalcount 
{
	void processData(int num)
	{
		int count=0,sum=0,index=1;
		while(num>sum)
		{
			sum=index+sum;
			count++;
			index++;
		}
	System.out.println("Total count is:"+" "+count);
	System.out.println("Loop ran till:"+" "+ sum);
	System.out.println("Index value is:" + " " +index);
	}
	public static void main(String[] a) 
	{
		Totalcount totalcount=new Totalcount();
		totalcount.processData(50);
	}
}
