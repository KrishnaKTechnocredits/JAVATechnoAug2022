package apurvaBabel;

class ForLoop{

	void evenNumbers(int startIndex,int endIndex){
		System.out.println("Even numbers are :");
		for(int index = startIndex; index <= endIndex; index++){
			if(index%2==0){
				System.out.println(index);
			}
		}
	}
	
	void divisibleBy5(int startIndex,int endIndex){
		System.out.println("Numbers divisible by 5 are :");
		for(int index = startIndex; index <= endIndex; index++){
			if(index%5==0){
				System.out.println(index);
			}
		}
	}
	
	void divisibleBy5and3(int startIndex,int endIndex){
		System.out.println("Numbers divisible by 5 and 3 are :");
		for(int index = startIndex; index <= endIndex; index++){
			if(index%5==0 && index%3==0){
				System.out.println(index);
			}
		}
	}
	
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
	
	void sumOfAllNumbers(int startIndex,int endIndex){
		int sum = 0;
		for(int index = startIndex; index <= endIndex; index++){
			sum = sum + index;
		}
		System.out.println("Sum of all numbers from " + startIndex +" to " + endIndex + " is: " + sum);
	}
	
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