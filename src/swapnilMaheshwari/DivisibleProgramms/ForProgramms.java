package swapnilMaheshwari;
class ForProgramms
{
	void evenNumberCheck ( int startIndex , int endIndex){
		for (int sIndex=startIndex; sIndex<=endIndex;sIndex++) {
			if ( sIndex%2==0)
				System.out.println("Number is even:"+sIndex);
			else if ( sIndex<0 || endIndex<0)
				System.out.println("Invalid number");	
		}
	}
	
	void divisableBy5 ( int startIndex , int endIndex){
		for (int sIndex=startIndex; sIndex<=endIndex;sIndex++) {
			if ( sIndex%5==0)
				System.out.println("Divisable by 5, numbers are:"+sIndex);
			else if ( sIndex<0 || endIndex<0)
				System.out.println("Invalid number");	
		}
	}
	void divisableBy3And5 ( int startIndex , int endIndex){
		for (int sIndex=startIndex; sIndex<=endIndex;sIndex++) {
			if ( sIndex%3==0 && sIndex%5==0)
				System.out.println("Divisable by 5 and 3, numbers are:"+sIndex);
			else if ( sIndex<0 || endIndex<0)
				System.out.println("Invalid number");	
		}
	}
	void divisableBy7Or13 ( int startIndex , int endIndex){
		for (int sIndex=startIndex; sIndex<=endIndex;sIndex++) {		 
				if ( sIndex%7==0)
				{
					System.out.println(sIndex+"Divisable by 7");
				}
				if ( sIndex%13==0)
				{
					System.out.println(sIndex+"Divisable by 13");
				}
			else if ( sIndex<0 || endIndex<0)
				System.out.println("Invalid number");	
		}
	}
	void sumOfNumber ( int startIndex , int endIndex){
		int sum=0;
		for (; startIndex<=endIndex;startIndex++) {
				sum=sum+startIndex;
			if ( startIndex<0 || endIndex<0)
			{
				System.out.println("Invalid number");	
			}
		}
		System.out.println("The sume of given number is:"+sum);
	}
	void diffOfOddAndEvenNumber ( int startIndex , int endIndex){
		int sumEven=0; int sumOdd=0; int diff;
		for (int sIndex=startIndex; sIndex<=endIndex;sIndex++) {
			if ( sIndex%2==0)
			{
					sumEven=sumEven+sIndex;
			}
			else 
					sumOdd=sumOdd+sIndex;	
		}
		diff=sumOdd-sumEven;
		System.out.println("The difference of sum of even and odd number is:"+diff);
	}
	void reverseOfOddNumber ( int startIndex , int endIndex){
		
		for (int eIndex=endIndex; eIndex>=startIndex;eIndex--) {
			if ( eIndex%2!=0)
				System.out.println("Reverse list of odd number is"+eIndex);
			else if ( startIndex<0 || eIndex<0)
				System.out.println("Invalid number");	
		}
	}
	public static void main ( String [] args)
	{
		ForProgramms forProgramms=new ForProgramms();
		forProgramms.evenNumberCheck(10,15);
		forProgramms.divisableBy5(10,30);
		forProgramms.divisableBy3And5(5,18);
		forProgramms.divisableBy7Or13(5,40);
		forProgramms.sumOfNumber(1,5);
		forProgramms.diffOfOddAndEvenNumber(3,9);
		forProgramms.reverseOfOddNumber(10,20);
	}
}