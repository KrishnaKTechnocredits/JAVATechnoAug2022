
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
package rashmiG;

class Number{
	
	void printEvenNumbers(int startNum, int endNum){
		System.out.println("Even Numbers are :");
		for(int index=startNum; index<=endNum;index++){
			if(index%2 ==0){
				System.out.println(index);
			}
		}
	}
	
	void printNumbersDivisibleBy5(int startNum, int endNum){
			//if(startNum>0 && endNum>0)
		System.out.println("Divisible by 5, numbers are:");
		for(int index=startNum; index<=endNum; index++){
			if(index%5==0){
				System.out.println(index);
			}
		}
	}
	
	void printAllNumbersDivisibleBy5and3(int startNum, int endNum){
		System.out.println("Divisible by 5 & 3, numbers are:");
		for(int index=startNum; index<=endNum; index++){
			if(index%5==0 && index%3==0){
				System.out.println(index);
			}
		}
	}
	
	void printAllNumbersDivisibleBy7or13(int startNum, int endNum){
		System.out.println("Divisible by 7 or 13, numbers are:");
		for(int index=startNum;	index<=endNum; index++){
			if(index%7==0){
				System.out.println(index+" is divisible by 7");
			}
			if(index%13==0){
				System.out.println(index+" is divisible by 13");
			}
		}
	}
	
	void sumOfNumbers(int startNum, int endNum){
		int sum=0;
		for(;startNum<=endNum;startNum++){
			sum = sum+startNum;
		}
		System.out.println("Sum is "+sum);
	}
	
	void differenceBetwnSumOfOddAndEvenNumbers(int startNum,int endNum){
		int oddSum=0;
		int evenSum=0;
		for(int index=startNum;index<=endNum;index++){
			if(index%2==0){
				evenSum=evenSum+index;
			}
			else{
				oddSum=oddSum+index;
			}
		}
		/*int diff = oddSum - evenSum;
		System.out.println("Difference between odd and even numbers is "+diff);*/
		System.out.println("Difference between odd and even numbers is "+(oddSum-evenSum));
	}
	
	void printOddNumbersReverseOrder(int startNum, int endNum){
		System.out.println("Odd numbers between "+startNum+" and "+endNum+" in reverse order : ");
		for(int index = endNum; index>=startNum; index--){
			if(index%2!=0){
				System.out.println(index);
			}
		}
	}
		
	public static void main(String[] args){
		Number number = new Number();
		number.printEvenNumbers(10,15);
		number.printNumbersDivisibleBy5(10,30);
		number.printAllNumbersDivisibleBy5and3(15,18);
		number.printAllNumbersDivisibleBy7or13(5,40);
		number.printAllNumbersDivisibleBy7or13(5,95);
		number.sumOfNumbers(4,10);
		number.sumOfNumbers(1,5);
		number.differenceBetwnSumOfOddAndEvenNumbers(3,9);
		number.differenceBetwnSumOfOddAndEvenNumbers(20,50);
		number.printOddNumbersReverseOrder(10,20);
		
	}
}
	
				