package monikaDwivedi;

class FirstNPrimeNumbers {	
	void nPrimeNumbers(int n) {
	      int status = 1;
	      int num = 3;	
	      System.out.println("Entered value of n is :" + n);
	      if (n >= 1)
	      {
	         System.out.println("First "+n+" prime numbers are:");
	         //2 is a known prime number
	         System.out.println(2);
	      }
	      if (n <= 0)
	      {
	         System.out.println("Invalid input");
	      }	
	      for ( int i = 2 ; i <=n ;  )
	      {	
	         for (int j=2;j<=num/2;j++)
	         {
	            if ( num%j == 0 )
	            {
	               status = 0;
	               break;
	            }
	         }
	         if ( status != 0 )
	         {
	            System.out.println(num);
	            i++;
	         }
	         status = 1;
	         num++;
	      }       
	   }
	public static void main(String[] args) {
		FirstNPrimeNumbers firstNPrimeNumbers = new FirstNPrimeNumbers();
		firstNPrimeNumbers.nPrimeNumbers(10);
		firstNPrimeNumbers.nPrimeNumbers(5);
		firstNPrimeNumbers.nPrimeNumbers(0);
		firstNPrimeNumbers.nPrimeNumbers(-8);
	}
}
