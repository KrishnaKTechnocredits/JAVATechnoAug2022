package pallaviRaut;


public class DivisibleBy3and7 {
   void NumDivisibleBy3and7(int startNum, int endNum)
	{
		int count=0;
	   System.out.println("Numbers divisible by 3 and 7 between "+startNum+ " and " +endNum+ " : ");
		for ( int index=startNum; index<=endNum; index++)
		{
			if(index%3==0 && index%7==0)
			{
				if (count<=2)
				{
					System.out.println(+index);
					count++;
				}
				
			}	
		}
		System.out.println("--------------------------------");
	}		
	   
   
   
   public static void main( String[] args)
   {
	   DivisibleBy3and7 divisibleBy3And7= new DivisibleBy3and7();
	   divisibleBy3And7.NumDivisibleBy3and7(20,100);
   }
}
