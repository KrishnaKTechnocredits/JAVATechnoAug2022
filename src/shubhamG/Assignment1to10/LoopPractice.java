package shubhamG.Assignment1to10;

/*Assignment - 6 & 7 : 25th Aug'2022
Write only one program having the following methods. [7 methods in same program] 

1. On user defined range (parameterized method) print all even numbers. 
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
		 10
		 12
		 14	

2. On user defined range print all numbers which are divisible by 5. 
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 30
Output : Divisible by 5, numbers are:
		 10
		 15
		 20
		 25
		 30	

3. On user defined range print all numbers which are divisible by 5 and divisible by 
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 18
Output : Divisible by 5 & 3, numbers are:
		 15

4. On user defined range print all numbers which are divisible by 7 or 13. 
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
		 
5. Find sum of all the numbers in user defined range.
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
         11
 */
class LoopPractice{

	void evenNumber(int startIndex, int endIndex){
		System.out.println("Even numbers are:");
		for (int i= startIndex;i<=endIndex;i++){
			if(i%2==0)
				System.out.println(i);
		}	
	}
	
	void divisiblityBy5(int startIndex, int endIndex){
		System.out.println("\nDivisible by 5, numbers are:");
		for (int i= startIndex;i<=endIndex;i++){
			if(i%5==0)
				System.out.println(i);
		}	
	}
		
	void divisiblityBy5and3(int startIndex, int endIndex){
		System.out.println("\nDivisible by 5 & 3, numbers are:");
		for (int i= startIndex;i<=endIndex;i++){
			if(i%3==0 && i%5==0 )
				System.out.println(i);
		}	
	}
	
	void divisiblityBy7or13(int startIndex, int endIndex){
		System.out.println("\nDivisible by 7 or 13, numbers are:");
		for (int i= startIndex;i<=endIndex;i++){
			if(i%7==0 )
				System.out.println(i+" is divisible by 7");
			else if(i%13==0 )
				System.out.println(i+" is divisible by 13");
		}	
	}	
	
	void sumInRange(int startIndex, int endIndex){
		int sum=0; 
		for (int i= startIndex;i<=endIndex;i++){
			sum =sum+i;
		}	
		System.out.println("\nsum is: " +sum);
		
	}	
	
	void difference(int startIndex, int endIndex){
		int even=0;
		int odd=0;
		int difference;
		for (int i= startIndex;i<=endIndex;i++){
			if(i%2==0 )
				even =even+i;
			else if(i%2==1 )
				odd=odd+i;
		}	
		difference=odd-even;
		System.out.println("\nDifference is: "+difference);
	}	
	
	void reverseOrder(int startIndex, int endIndex){
		System.out.println("\nOdd numbers in reverse order are:");
		for (int i= endIndex;i>=startIndex;i--){
			if(i%2==1)
				System.out.println(i);
		}	
	}	
		
	public static void main(String[] args){
		LoopPractice loopPractice = new LoopPractice();
		loopPractice.evenNumber(10,15);
		loopPractice.divisiblityBy5(10,30);
		loopPractice.divisiblityBy5and3(5,18);
		loopPractice.divisiblityBy7or13(5,40);
		loopPractice.sumInRange(1,5);
		loopPractice.difference(3,9);
		loopPractice.reverseOrder(10,20);
	}
}	