package titikshaG;

public class Primenumberwithreturntype 
	{
		int index=2;
		int sum=0;
		int count=0;
		
		int primeNo(int num)
		{
		boolean flag = true;
		while (count!=num)		
			{
			for(int i=2;i<index;i++)
				{
					if(index%i==0)
						{
						flag=false;
						break;
						}
				}
			if (flag==true)
				{
				System.out.println("prime numbers are "+ index);
				count++;
				sum=sum+index;
				}
				index++;
				flag=true;
			}
			return sum;
		}
		public static void main(String[] a)
			{
			Primenumberwithreturntype retuntype=new Primenumberwithreturntype();
			int pm=retuntype.primeNo(5);
			System.out.println("sum of prime number is: "+ pm);
			}
}


	 

