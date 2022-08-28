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

package rahulSaswadkar;

class ForLoopAssignment{
	public static void main(String [] args){
		ForLoopAssignment forLoopAssignment = new ForLoopAssignment();
		forLoopAssignment.findEvenNumbers(10,15);
		forLoopAssignment.findDivisibleNumbers(10,30,5);
		forLoopAssignment.findDivisibleNumbers1(5,18,5,3);
		forLoopAssignment.findDivisibleNumbers2(5,40,7,13);
		forLoopAssignment.findDivisibleNumbers3(5,100,7,13);
		forLoopAssignment.SumOfNumbersInRange(1,5);
		forLoopAssignment.FindDiffInOddAndEvenNumbersInRange(3,9);
		forLoopAssignment.OddNumbersInRange(20,10);
	}
	
	void findEvenNumbers(int startIndex, int endIndex){
		int countEvenNumbers = 0;
		System.out.println("\n" + "Even numbers between " + startIndex + " and " + endIndex + " are as below:");  
		for(int index=startIndex;index<=endIndex;index++){
			if(index%2 == 0){
				System.out.println(index);
				countEvenNumbers++;
			}	
		}
		System.out.println("Count of Even numbers between " + startIndex + " and " + endIndex + " is : " + countEvenNumbers);
	}
	
	void findDivisibleNumbers(int startIndex, int endIndex, int divisor){
		int count = 0;
		System.out.println("\n" + "Numbers divisbile by " + divisor + " between " + startIndex + " and " + endIndex + " are as below:"); 
		for(int index=startIndex;index<=endIndex;index++){
			if(index%divisor == 0){
				System.out.println(index);
				count++;
			}	
		}
		System.out.println("Count of numbers divisible by " + divisor + " between " + startIndex + " and " + endIndex + " is : " + count);
	}
	
	void findDivisibleNumbers1(int startIndex, int endIndex, int divisor1, int divisor2){
		int count = 0;
		System.out.println("\n" + "Numbers divisbile by " + divisor1 +" & " + divisor2 + " between " + startIndex + " and " + endIndex + " are as below:"); 
		for(int index=startIndex;index<=endIndex;index++){
			if(index%divisor1 == 0 && index%divisor2 == 0){
				System.out.println(index);
				count++;
			}	
		}
		System.out.println("Count of numbers divisible by " + divisor1 +" & " + divisor2 + " between " + startIndex + " and " + endIndex + " is : " + count);
	}
	
	void findDivisibleNumbers2(int startIndex, int endIndex, int divisor1, int divisor2){
		//int count = 0;
		System.out.println("\n" + "Numbers divisbile by " + divisor1 +" Or " + divisor2 + " between " + startIndex + " and " + endIndex + " are as below:");
		for(int index=startIndex;index<=endIndex;index++){
			if(index%divisor1 == 0){
				System.out.println(index + " is divisible by " + divisor1);
				//count++;
			}
			if(index%divisor2 == 0){
				System.out.println(index + " is divisible by " + divisor2);
				//count++;
			}
		}
		
	}
	
	void findDivisibleNumbers3(int startIndex, int endIndex, int divisor1, int divisor2){
		//int count = 0;
		System.out.println("\n" + "Numbers divisbile by " + divisor1 +" Or " + divisor2 + " between " + startIndex + " and " + endIndex + " are as below:");
		for(int index=startIndex;index<=endIndex;index++){
			if(index%divisor1 == 0){
				System.out.println(index + " is divisible by " + divisor1);
				//count++;
			}
			else if(index%divisor2 == 0){
				System.out.println(index + " is divisible by " + divisor2);
				//count++;
			}
		}
		
	}
	
	void SumOfNumbersInRange(int startIndex, int endIndex){
		int sum = 0;
		for(int index=startIndex;index<=endIndex;index++){
			sum = sum + index;
		}
		System.out.println("\n" + "Sum of Numbers between range of " + startIndex + " to " + endIndex + " is : " + sum);
		System.out.println(" Sum of Numbers between range of " + startIndex + " to " + endIndex + " is : " + sum);
		System.out.println("\n Sum of Numbers between range of " + startIndex + " to " + endIndex + " is : " + sum);
		System.out.println("\nSum of Numbers between range of " + startIndex + " to " + endIndex + " is : " + sum);
		
	}
	
	void FindDiffInOddAndEvenNumbersInRange(int startIndex, int endIndex){
		int sumOfOddNumbers = 0;
		int sumOfEvenNumbers = 0;
		int diff;
		
		for(int index=startIndex;index<=endIndex;index++){
			if(index%2 != 0){
				sumOfOddNumbers = sumOfOddNumbers + index;
			}
			if(index%2 == 0){
				sumOfEvenNumbers = sumOfEvenNumbers + index;
			}
		}
		diff = sumOfOddNumbers - sumOfEvenNumbers;
		System.out.println("\n" + "Differnce in Sum of Odd Numbers and Sum of Even Number between range of " + startIndex + " to " + endIndex + " is : " + diff);
	}
	
	void OddNumbersInRange(int startIndex, int endIndex){
		System.out.println("\n" + "Odd Numbers between " + endIndex + " and " + startIndex + " are as below:");  
		for(int index = startIndex;index>=endIndex;index--){
			if(index % 2 != 0){
				System.out.println(index);
			}
		}
	}
}