package narendraD;

public class DivisibleByNumbers {
	
	void getNumbersDivisible (int startindex, int endindex ) {
		int count=0;
		int enterdivisiblebyfirstnumber =3 ;
		int enterdivisiblebysecondnumber = 7;
		int inputcountlimit=3;
		
		System.out.println("Number divisible by "+ enterdivisiblebyfirstnumber + " & " + enterdivisiblebysecondnumber +" are:");
		
		for(int index = startindex; index<=endindex; index++)
		{	
			 if(index%enterdivisiblebyfirstnumber==0 && index%enterdivisiblebysecondnumber==0)
			  {
				 
			    System.out.println(index);
				count++;
				//System.out.println("count is: "+count);
			  }
			  if (count==inputcountlimit)
				 break;	
		}
		if (count ==0)
		{
			  System.out.println("No divisble numbers present");
		}
		
	}
	
    public static void main(String[] args) {
		new DivisibleByNumbers().getNumbersDivisible(20, 100);
	}

}
