/*Assignment No. 12 :
 Create a class to satisfy below requirements. 
     -Print all the prime numbers between range 100->120. (parameterized method) ---> Done
     -Print total count of prime numbers within same range. ----> Done
     -Print sum of all prime numbers within same range. ----> Done
     -Print average of prime numbers within same range ---> Done */

package narendraD;

public class TogetPrimeNumbersCount {
	
	void primeNumbers(int firstNumber, int secNumber) {
		System.out.println("Prime numbers are: ");
		int count=0;
		int sum =0;
		
		for(int num =firstNumber; num<=secNumber; num++)
		{
			boolean flag = true;
		    for(int i=2; i<=Math.sqrt(num); i++) 
		    {
			
			   if(num%i==0)
			   {
				   flag = false;
				   break;
				
			   }
			
		    }

		    if(flag==true)
		    {
		    	System.out.println(num);
		    	count++;
		    	sum = sum+num;
		    	
		    }
		    
		    
		}
		 System.out.println("\n" + "Total count of prime numbers are: " + count);
		 System.out.println("\n" + "Total sum of prime numbers are: " + sum);
		 System.out.println("\n" + "Average of prime numbers are: " + (sum/count));
		
		
	}

	public static void main(String[] args) {
		new TogetPrimeNumbersCount().primeNumbers(100, 120);

	}

}
