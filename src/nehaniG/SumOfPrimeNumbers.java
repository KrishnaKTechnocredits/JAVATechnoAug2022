package nehaniG;

public class SumOfPrimeNumbers {
	static int count = 0;
	static int isPrimeNumber(int number)
	{
		 boolean flag = true;
		 
		 for(int index=2;index<=number/2;index++)
		 {
			 if(number%index == 0)
			 {
				 flag = false;
				 break;
			 }
		 }
        if (flag==true)
        {
        	count++;
			System.out.print(number + " ");
			return number;
        }
        return 0;
	}

	public static void main(String[] args)
	{			
		int number = 2;
		int sum = 0;
		int iteration = 5;
		System.out.print("Addition of first " + iteration + " prime numbers ( ");
		while(number >= 2 && count!=iteration)
		{
			sum = sum + isPrimeNumber(number);
			++number;
		}
		System.out.print(") = " + sum);
	}

}
