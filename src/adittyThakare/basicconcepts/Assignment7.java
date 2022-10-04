/*Assignment - 7 : 25th Aug'2022
Write only one program having the following methods. [7 methods in same program] 

1. On user define range (parameterized method) print all even numbers. 
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
		 10
		 12
		 14	

2. On user define range print all numbers which is divisible by 5. 
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 30
Output : Divisible by 5, numbers are:
		 10
		 15
		 20
		 25
		 30	

3. On user define range print all numbers which is divisible by 5 and divisible by 3. 
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 18
Output : Divisible by 5 & 3, numbers are:
		 15

4. On user define range print all numbers which is divisible by 7 or 13. 
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 7 or 13, numbers are:
		 7 is divisible by 7
		 13 is divisible by 13
		 14 is divisible by 7
		 21 is divisible by 7
		 26 is divisible by 13
		 28 is divisible by 7
		 35 is divisible by 7
		 39 is divisible by 13
		 
5. Find sum of all the numbers in user define range.
Input : Range -> 1 to 5
output : sum is 15

6. Find difference between sum of odd numbers and even numbers in a given range
Input : Range -> 3 to 9
output : 6
hint : (3+5+7+9) - (4+6+8) = 6
       
7. Print only odd numbers in reverse order.
Input : Range -> 10 to 20
output : 19
         17
         15
         13
         11*/

package adittyThakare.basicconcepts;

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