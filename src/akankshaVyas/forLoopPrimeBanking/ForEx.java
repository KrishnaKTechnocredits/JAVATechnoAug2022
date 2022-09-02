/* 
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
		 
 On user define range print all numbers which is divisible by 7 or 13. 
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

Find difference between sum of odd numbers and even numbers in a given range
Input : Range -> 3 to 9
output : 6
hint : (3+5+7+9) - (4+6+8) = 6

Print only odd numbers in reverse order.
Input : Range -> 10 to 20
output : 19
         17
         15
         13
         11
*/

package akankshaVyas.forLoopPrimeBanking;
class ForEx{
	
	void printEvenNum(int startIndex, int endIndex){
		System.out.println("Even numbers are");
		for(int index=startIndex; index<=endIndex; index++){
			if(index % 2 == 0)
				System.out.println(index);
		}
	}
	
	void printDivisibleBy5Num(int startIndex, int endIndex){
		System.out.println("Divisible by 5, numbers are:");
		for(int index=startIndex; index<=endIndex; index++){
			if(index % 5 == 0)
			System.out.println(index);
		}
	}
	
		void printDivisibleBy5And3(int startIndex, int endIndex){
		System.out.println("\n Divisible by 5 & 3, numbers are:");
		for(int index=startIndex; index<=endIndex; index++){
			if(index % 5 ==0 && index % 3 == 0)
			System.out.println(index + "\n");
		}
	}
	
	
		void printDivisibleBy7Or13(int startIndex, int endIndex){
		for(int index=startIndex; index<=endIndex; index++){
			if(index % 7 ==0)
				System.out.println(index + "is divisible by " +7);
				if(index % 13 == 0)
					System.out.println(index + "is divisible by " +13);
		}
	}
	
	void sum(int startIndex, int endIndex){
		int sum=0;
		for(int index=startIndex; index<=endIndex; index++){
			sum = sum + index;
		}
		System.out.println("\n"+"sum is " + sum +"\n");
	}
	
	void difference(int startIndex, int endIndex){
		int sumOdd = 0;
		int sumEven = 0;
		for(int index=startIndex; index<=endIndex; index++){
			if(index %2 ==0){
				sumEven = sumEven + index;
			}else if(index %2 != 0)
				sumOdd = sumOdd + index;
		}
		System.out.println("Difference between sum of odd numbers and even numbers in a given range " + (sumOdd - sumEven) +"\n");
	}
	
	void reversePrint(int startIndex, int endIndex){
		for(int index= endIndex; index>=startIndex; index--){
			if(index % 2 !=0)
			System.out.println(index);
		}
	}
	
	public static void main(String[] args){
		ForEx forEX = new ForEx();
		forEX.printEvenNum(10,15);
		forEX.printDivisibleBy5Num(10,30);
		forEX.printDivisibleBy5And3(5,18);
		forEX.printDivisibleBy7Or13(5,95);
		forEX.sum(1,5);
		forEX.difference(3,9);
		forEX.reversePrint(10,20);
	}

}