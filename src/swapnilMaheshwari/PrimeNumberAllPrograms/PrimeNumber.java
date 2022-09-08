package swapnilMaheshwari;
class PrimeNumber
{ 
  void isPrimeNum ( int num)
  {  
	boolean status=true;
	
	if ( num > 0)
	{
		for ( int i=2; i<num ; i++)
		{
			if (num%i==0 )
			{
				System.out.println(num + " is not a prime number\n");
				status=false;
				break;
			}	
		}
		if ( status==true)
		{
			System.out.println(num + " is prime number\n");
		}
	} 
	else 
		System.out.println (num + " is Invalid number\n");
  }
   
   void isPrimeNumOptimized ( int num)
   {  
	boolean status=true;
	
	if ( num > 0)
	{
		for ( int i=2; i<=num/2 ; i++)
		{
			if (num%i==0 )
			{
				System.out.println(num + " is not a prime number\n");
				status=false;
				break;
			}	
		}
		if ( status==true)
		{
			System.out.println(num + " is prime number\n");
		}
	} 
	else 
		System.out.println (num + " is Invalid number\n");
  }
  void isPrimeNumUsingFunction( int num)
  {  
	boolean status=true;
	
	if ( num > 0)
	{
		for ( int i=2; i<Math.sqrt(num); i++)
		{
			if (num%i==0 )
			{
				System.out.println(num + " is not a prime number\n");
				status=false;
				break;
			}	
		}
		if ( status==true)
		{
			System.out.println(num + " is prime number\n");
		}
	} 
	else 
		System.out.println (num + " is Invalid number\n");
  }
   
  public static void main ( String[] args)
  {
	PrimeNumber primeNumber = new PrimeNumber();
	primeNumber.isPrimeNum(17);
	primeNumber.isPrimeNum(-8);
	primeNumber.isPrimeNum(100);
	primeNumber.isPrimeNumOptimized(23);
	primeNumber.isPrimeNumOptimized(46);
	primeNumber.isPrimeNumOptimized(-50);
	primeNumber.isPrimeNumUsingFunction(121);
	primeNumber.isPrimeNumUsingFunction(-899);
	primeNumber.isPrimeNumUsingFunction(1000);
  }

}