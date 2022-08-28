package adittyThakare;

class Assignment7{
	void processEvenNumber(int startIndex, int endIndex){
		int result = 0;
		System.out.println("Even numbers between "+startIndex+" and "+endIndex+" are: ");
		for(int index=startIndex;index<=endIndex;index++){
			if(index%2==0)
				System.out.println(index);
		}		
	}
	
	void processDivisibleNumber(int startIndex, int endIndex){
		int result = 0;
		System.out.println("Numbers divisible by 5 are: ");
		for(int index=startIndex;index<=endIndex;index++){
			if(index%5==0)
				System.out.println(index);
		}		
	}
	
	void processDivisibleNumber1(int startIndex, int endIndex){
		int result = 0;
		System.out.println("Numbers divisible by 5 and 3 are: ");
		for(int index=startIndex;index<=endIndex;index++){
			if(index%5==0 && index%3==0)
				System.out.println(index);
		}		
	}
	
	void processDivisibleNumber2(int startIndex, int endIndex){
		int result = 0;
		System.out.println("Numbers divisible by 7 or 13 are: ");
		for(int index=startIndex;index<=endIndex;index++){
			if(index%7==0)
				System.out.println(index+" is divisible by 7");
			else if(index%13==0)
				System.out.println(index+" is divisible by 13");
		}		
	}
	
	void processSum(int startIndex, int endIndex){
		int result = 0;
		for(int index=startIndex;index<=endIndex;index++){
			result = result + index;
		}	
		System.out.println("Sum of numbers between "+startIndex+" and "+endIndex +": "+result);	
	}
	
	void processData(int startIndex, int endIndex){
		int result = 0, result1 =0, output=0;
		
		for(int index=startIndex;index<=endIndex;index++){
			if(index%2==0)
				result =  result + index;
			else if(index%2==1)
				result1 = result1 + index;	
		}	
		if(result>result1)
			output = result -  result1;
		else
			output = result1 - result;	
		System.out.println("Difference between sum of odd numbers and even numbers between "+startIndex+" and "+endIndex+": "+output);
	}
	
	void processOddNumber(int startIndex, int endIndex){
		int result = 0;
		System.out.println("Odd numbers are: ");
		for(int index=endIndex;index>=startIndex;index--){
			if(index%2==1)
				System.out.println(index);
		}		
	}

	public static void main(String[] args){
		Assignment7 assignment7 = new Assignment7();
		assignment7.processEvenNumber(10,15);
		System.out.println(" ");
		assignment7.processDivisibleNumber(10,30);
		System.out.println(" ");
		assignment7.processDivisibleNumber1(5,18);
		System.out.println(" ");
		assignment7.processDivisibleNumber2(5,40);
		System.out.println(" ");
		assignment7.processSum(1,5);
		System.out.println(" ");
		assignment7.processData(3,9);
		System.out.println(" ");
		assignment7.processOddNumber(10,20);
	}	
}