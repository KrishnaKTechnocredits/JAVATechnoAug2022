//Write only one program having the following methods. [7 methods in same program] 

package sagaryadav;
class ForLoop{
/*1. On user define range (parameterized method) print all even numbers. 
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
		 10
		 12
		 14	*/	
	void evenOrOdd(int startIndex, int endIndex){
		System.out.print("Even Numbers between " +startIndex + " and " +endIndex+ " are: ");
		for(int index=startIndex; index<=endIndex; index++){
			if(index % 2==0){
				System.out.print(index + ",");
			}
		}
	}

/*2. On user define range print all numbers which is divisible by 5. 
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 30
Output : Divisible by 5, numbers are:
		 10
		 15
		 20
		 25
		 30	*/
	void divisibleBy5(int startIndex, int endIndex){
		System.out.print("Numbers divisible 5 are: ");
		for(int index=startIndex; index<=endIndex; index++){
			if(index % 5==0){
				System.out.print(index + ",");
				
			}		
		}
	}
/*3. On user define range print all numbers which is divisible by 5 and divisible by 3. 
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 18
Output : Divisible by 5 & 3, numbers are:
		 15*/	
	void divisibleBy5And3(int startIndex, int endIndex){
		System.out.print("Numbers divisible 5 and 3 are: ");
		for(int index=startIndex; index<=endIndex; index++){
			if(index % 3==0 && index % 5==0){
				System.out.print(index + ",");
				
			}
		}
	}
/*4. On user define range print all numbers which is divisible by 7 or 13. 
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
		 39 is divisible by 13*/	
	void divisibleBy7Or13(int startIndex, int endIndex){
		System.out.println("Numbers divisible by 7 or 13 between ("+startIndex + " to " +endIndex+ ") are: ");
		for(int index=startIndex; index<=endIndex; index++){
			if(index % 7==0 || index % 13==0){
				if(index % 7==0){
				System.out.println(index +" divisible by 7");
				}else{
				System.out.println(index +" divisible by 13");
			}
		  }
		}
	}
/*5. Find sum of all the numbers in user define range.
Input : Range -> 1 to 5
output : sum is 15*/	
	void sumOfDigits(int startIndex, int endIndex){
		System.out.print("sum of all the numbers from " +startIndex+ " to " +endIndex+" are: ");
		int sum=0;
		for(int index=startIndex; index<=endIndex; index++){
			sum=sum+index;
		}
			System.out.print(sum);
	}
/*6. Find difference between sum of odd numbers and even numbers in a given range
Input : Range -> 3 to 9
output : 6
hint : (3+5+7+9) - (4+6+8) = 6*/	
	void differenceInEvenAndOdd(int startIndex, int endIndex){
		int sum1=0; int sum2=0;
		System.out.print("Difference between Odd and Even from ("+startIndex + " to " +endIndex+ ") are: ");
			for (int index=startIndex; index<=endIndex; index++){
				if(index%2==0){
				sum1=sum1+index;
				}else if(index%2==1){
				sum2=sum2+index;
			}
		}
			System.out.print(sum2-sum1);
	}
/*7. Print only odd numbers in reverse order.
Input : Range -> 10 to 20
output : 19
         17
         15
         13
         11*/
	void oddReverse(int startIndex, int endIndex){
		System.out.print("Print only odd numbers in reverse order between " +startIndex+ " to " +endIndex+" : ");
		for(int index=endIndex; index>=startIndex; index--){
			System.out.print(index +",");
		}
	}
	
	public static void main(String[] args){
		ForLoop forLoop = new ForLoop();
		System.out.println("");
		forLoop.evenOrOdd(10,20);
		System.out.println("");
		forLoop.divisibleBy5(5,20);
		System.out.println("");
		forLoop.divisibleBy5And3(10,30);
		System.out.println("");
		forLoop.divisibleBy7Or13(5,91);
		System.out.println("");
		forLoop.sumOfDigits(1,15);
		System.out.println("");
		forLoop.sumOfDigits(3,9);
		System.out.println("");
		forLoop.differenceInEvenAndOdd(3,13);
		System.out.println("");
		forLoop.oddReverse(10,30);
		System.out.println("");
	}
}