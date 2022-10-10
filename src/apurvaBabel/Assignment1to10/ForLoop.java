/*Assignment - 6 & 7 :
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

package apurvaBabel.Assignment1to10;

class ForLoop{

	// Method to print all even numbers from given range
	void evenNumbers(int startIndex,int endIndex){
		System.out.println("Even numbers are :");
		for(int index = startIndex; index <= endIndex; index++){
			if(index%2==0){
				System.out.println(index);
			}
		}
	}
	
	// Method to print numbers which are divisible by 5 from given range
	void divisibleBy5(int startIndex,int endIndex){
		System.out.println("Numbers divisible by 5 are :");
		for(int index = startIndex; index <= endIndex; index++){
			if(index%5==0){
				System.out.println(index);
			}
		}
	}
	
	// Method to print numbers which are divisible by 5 & 3 from given range
	void divisibleBy5and3(int startIndex,int endIndex){
		System.out.println("Numbers divisible by 5 and 3 are :");
		for(int index = startIndex; index <= endIndex; index++){
			if(index%5==0 && index%3==0){
				System.out.println(index);
			}
		}
	}
	
	// Method to print numbers which are divisible by 7 or 13 form given range
	void divisibleBy7or13(int startIndex,int endIndex){
		System.out.println("Numbers divisible by 7 or 13 are :");
		for(int index = startIndex; index <= endIndex; index++){
			if(index%7==0){
				System.out.println(index + " is divisible by 7");
			}else if (index%13==0){
				System.out.println(index + " is divisible by 13");
			}
		}
	}
	
	// Method to print sum of all numbers from given range
	void sumOfAllNumbers(int startIndex,int endIndex){
		int sum = 0;
		for(int index = startIndex; index <= endIndex; index++){
			sum = sum + index;
		}
		System.out.println("Sum of all numbers from " + startIndex +" to " + endIndex + " is: " + sum);
	}
	
	// Method to print difference between odd & even numbers from given range
	void differenceBetweenOddAndEven(int startIndex,int endIndex){
		int difference = 0;
		int sumOfOdd = 0;
		int sumOfEven = 0;
		for(int index = startIndex; index <= endIndex; index++){
			if(index%2==0){
				sumOfEven = sumOfEven + index;				
			}else{
				sumOfOdd = sumOfOdd + index;
			}
		}
		difference = sumOfOdd - sumOfEven;
		System.out.println("Difference between Sum of odd and even numbers from " + startIndex +" to " + endIndex + " is: " + difference);
	}
	
	// Method to print odd numbers in reverse order from given range
	void oddNumbersInReverse(int startIndex,int endIndex){
		System.out.println("Odd numbers in reverse order are :");
		for(int index = endIndex; index >= startIndex; index--){
			if(index%2!=0){
				System.out.println(index);
			}
		}
	}
	
	public static void main(String[] args){
		ForLoop forLoop = new ForLoop();
		forLoop.evenNumbers(10,15);
		forLoop.divisibleBy5(10,30);
		forLoop.divisibleBy5and3(5,18);
		forLoop.divisibleBy7or13(5,40);
		forLoop.sumOfAllNumbers(1,5);
		forLoop.differenceBetweenOddAndEven(3,9);
		forLoop.oddNumbersInReverse(10,20);
	}
}