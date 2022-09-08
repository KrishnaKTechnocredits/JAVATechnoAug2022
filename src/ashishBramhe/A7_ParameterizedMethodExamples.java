package ashishBramhe;

/*

Assignment - 7 : 25th Aug'2022
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
         11
		 
*/

class A7_ParameterizedMethodExamples{
	
	void displayEvenNumbersForRange(int start, int end){
		System.out.println(" Even numbers in range (" + start + "," + end + ") are : ");
		for(int i=start; i<=end; i++){
			if(i%2 == 0)
				System.out.println(" " + i);
		}
	}
	
	void displayDivisibleBy5ForRange(int start, int end){
		System.out.println(" Numbers divisible by 5 in range (" + start + "," + end + ") are : ");
		for(int i=start; i<=end; i++){
			if(i%5 == 0)
				System.out.println(" " + i);
		}
	}
	
	void displayDivisibleBy3And5ForRange(int start, int end){
		System.out.println(" Numbers divisible by 3 and 5 in range (" + start + "," + end + ") are : ");
		for(int i=start; i<=end; i++){
			if(i%3 == 0 && i%5 == 0)
				System.out.println(" " + i);
		}
	}
	
	void displayDivisibleBy7Or13ForRange(int start, int end){
		System.out.println(" Numbers divisible by 7 or 13 in range (" + start + "," + end + ") are : ");
		for(int i=start; i<=end; i++){
			if(i%7 == 0 || i%13 == 0)
				System.out.println(" " + i);
		}
	}
	
	void displaySumForRange(int start, int end){
		int sum = 0;
		for(int i=start; i<=end; i++)			
				sum = sum + i;
		System.out.println(" Sum of numbers in range (" + start + "," + end + ") is : " + sum);
	}	
	
	void displayDifferenceOfSumOfOddAndEvenForRange(int start, int end){
		int difference = 0,sumOfOdd = 0, sumOfEven = 0;
		for(int i=start; i<=end; i++){
			if(i%2 == 0)
				sumOfEven = sumOfEven + i;
			else if(i%2 == 1)
				sumOfOdd = sumOfOdd + i;
		}
		difference = sumOfEven - sumOfOdd;
		System.out.println(" Difference of Sum of Even and Odd numbers in range (" + start + "," + end + ") is : " + difference);
	}
	
	void displayOddNumbersInReverseForRange(int start, int end){
		System.out.println(" Odd numbers in range (Reverse Order)(" + start + "," + end + ") are : ");
		for(int i=end; i>=start; i--){
			if(i%2 == 1)
				System.out.println(" " + i);
		}
	}
	
	public static void main(String args[]){
		A7_ParameterizedMethodExamples a7_ParameterizedMethodExamples = new A7_ParameterizedMethodExamples();
		a7_ParameterizedMethodExamples.displayEvenNumbersForRange(1,20);
		a7_ParameterizedMethodExamples.displayDivisibleBy5ForRange(1,50);
		a7_ParameterizedMethodExamples.displayDivisibleBy3And5ForRange(1,40);
		a7_ParameterizedMethodExamples.displayDivisibleBy7Or13ForRange(1,50);
		a7_ParameterizedMethodExamples.displayDifferenceOfSumOfOddAndEvenForRange(1,10);
		a7_ParameterizedMethodExamples.displaySumForRange(1,10);
		a7_ParameterizedMethodExamples.displayOddNumbersInReverseForRange(1,10);
	}
}	