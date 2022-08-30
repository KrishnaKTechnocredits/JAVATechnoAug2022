package narendraD;


public class ToDisplayDivisibleByNumbersInReverseOrder {
	static int enterdivisiblebyfirstnumber;
	static int enterdivisiblebysecondnumber;
	static int inputcountlimit;
	
	void enterNumbersForDivisible (int startindex, int endindex ) {
		int count=0;

		System.out.println("Number divisible by "+ enterdivisiblebyfirstnumber + " & " + enterdivisiblebysecondnumber +" in reverse order are:");
		
		for(int index = startindex; index>=endindex; index--)
		{
			if (enterdivisiblebyfirstnumber>0 && enterdivisiblebysecondnumber>0)
			{
			   if(index%enterdivisiblebyfirstnumber==0 && index%enterdivisiblebysecondnumber==0)
			   {
				 
			      System.out.println(index);
				  count++;
				  //System.out.println("count is: "+count);
			   }
			   if(count==inputcountlimit)
				  break;
			}
			else
			{
				  System.out.println("Divisible By Zero Error");
				break;
			}
			  
		}
		if (count ==0 && enterdivisiblebyfirstnumber>0 && enterdivisiblebysecondnumber>0)
		{
			  System.out.println("No common divisble numbers are present");
		}
		
	}
	
     public static void main(String[] args) {
    	 //DivisibleByNumbersnew divisibleByNumbersnew = new DivisibleByNumbersnew();
    	 enterdivisiblebyfirstnumber =3;
    	 enterdivisiblebysecondnumber=7;
    	 inputcountlimit=3;
    	 new ToDisplayDivisibleByNumbersInReverseOrder().enterNumbersForDivisible(200, 20);
    	
	}

}
