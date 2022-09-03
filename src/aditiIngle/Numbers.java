package aditiIngle;
class Numbers{
	
	void evenNumbers(int startIndex, int endIndex){
		System.out.println("Even numbers are:");
		for(int index=startIndex;index<=endIndex;index++){
			if(index%2==0){
				System.out.println(index);
			}
		}
		System.out.println("\n");
	}
	void divisible5(int startIndex, int endIndex){
		System.out.println("Divisible by 5, numbers are:");
		for(int index=startIndex;index<=endIndex;index++){
			if(index%5==0){
				System.out.println(index);
			}
		}
		System.out.println("\n");
	}
	void divisible5and3(int startIndex,int endIndex){
		System.out.println("Divisible by 5 & 3, numbers are:");
		for(int index=startIndex;index<=endIndex;index++){
			if(index%3==0 && index%5==0){
				System.out.println(index);
			}
		}
		System.out.println("\n");
	}
	void divisible7or13(int startIndex,int endIndex){
		System.out.println("Divisible by 7 or 13, numbers are:");
		for(int index=startIndex;index<=endIndex;index++){
			if(index%7==0){
				System.out.println(index + " is divisible by 7");
			}
			else if(index%13==0){
				System.out.println(index + " is divisible by 13");
			}
		}
		System.out.println("\n");
	}
	void sum(int startIndex, int endIndex){
		int sum=0;
		for(int index=startIndex;index<=endIndex;index++){
			sum=sum + index;
		}
		System.out.println("sum is "+sum);
		System.out.println("\n");
	}
	void oddEven(int startIndex, int endIndex){
		int even=0;
		int odd=0;
		for(int index=startIndex; index<=endIndex;index++){
			if(index%2==0){
				even=even+index;
			}
			else if(index%2!=0){
				odd=odd+index;
			}
		}
		System.out.println("Difference of Odd and Even numbers is: "+(odd-even));
		System.out.println("\n");
	}
	void reverseOdd(int startIndex, int endIndex){
		for(int index=endIndex; index>=startIndex; index--){
			if(index%2!=0){
				System.out.println("Reverse order of Odd numbers: "+index);
			}
		}
	}
	public static void main(String[] args){
		Numbers numbers = new Numbers();
		numbers.evenNumbers(10,15);
		numbers.divisible5(10,30);
		numbers.divisible5and3(5,18);
		numbers.divisible7or13(5,40);
		numbers.sum(1,5);
		numbers.oddEven(3,9);
		numbers.reverseOdd(10,20);
	}
}