package swapnilMaheshwari;

public class PrimeNumberInRange {
	  void primeNoRange (int num)
	  {
		boolean status=true;
		int count=1;
		int sum=0;
		int avg;
	   if ( num > 0)
	   {
		    for ( int i=2; i<=num/2 ; i++)
			{
				for ( int j=2; j<i; j++)
				{
					if (i%j==0)
					{
						//System.out.println(i+ " Number is not a prime");
						status=false;
						break;
					}
				}
				if ( status==true)
				{
					System.out.println(i+ " Number is Prime" );
					count++;
					sum= sum+i;
				}
			status=true;	
			}		
			System.out.println("Total count of prime number is"+count);
			avg=sum/count;
			System.out.println("Average of total count"+avg);
	   }
	   else 
		   System.out.println("Invalid number");
	  }
	  
	  public static void main (String[] args)
	  {
		PrimeNumberInRange primeNumInRange = new PrimeNumberInRange();
		primeNumInRange.primeNoRange(121);
	  }
}
