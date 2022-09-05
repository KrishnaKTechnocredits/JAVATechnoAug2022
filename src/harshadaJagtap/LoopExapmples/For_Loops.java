package harshadaJagtap.LoopExapmples;

public class For_Loops{
	void evenNumbers(int startRange, int endRange){
		System.out.println("Even numbers are: ");
		for(int range=startRange;range<=endRange;range++){
			if(range%2==0){
				System.out.println(range);
			}
		}
	}
	
	void divisibleBy5(int startRange, int endRange){
		System.out.println("Numbers Divisibe by 5 are: ");
		for(int range=startRange;range<=endRange;range++){
			if(range%5==0){
				System.out.println(range);
			}
		}
	}
	
	void divisibleBy5and3(int startRange, int endRange){
		System.out.println("Numbers Divisibe by 5 and 3 are: ");
		for(int range=startRange;range<=endRange;range++){
			if(range%5==0 && range%3==0){
				System.out.println(range);
			}
		}
	}
	
	void divisibleBy7and13(int startRange, int endRange){
		System.out.println("Numbers Divisibe by 7 and 13 are: ");
		for(int range=startRange;range<=endRange;range++){
				if(range%7==0){
					System.out.println(range+" Divisibe by 7");
				}
				else if(range%13==0){
					System.out.println(range+" Divisibe by 13");
				}
		}
	}
	
	void sumOfGivenNumbers(int startIndex, int endIndex){
		int sum=0;
		for (int index=startIndex;index<=endIndex;index++){
			sum=sum+index;
		}
		System.out.println("sum from " + startIndex + " to " + endIndex+" is "+sum);
	}
	
	void diffInSumOfOddEvnNum(int startRange,int endRange){
		int difference=0;
		int sumOfEven=0;
		int sumOfOdd=0;
		for(int range=startRange;range<=endRange;range++){
			if(range%2==0){
				sumOfEven=sumOfEven+range;
			}
			else{
				sumOfOdd=sumOfOdd+range;
			}
		}
		difference=sumOfOdd-sumOfEven;
		System.out.println("difference between sum of odd numbers and even numbers in a given range "+ difference);
	}
	
	void oddNumbers(int startRange,int endRange){
		System.out.println("Odd numbers are as below:");
		for(int index=endRange;index>=startRange;index--){
			if(index%2==1){
				System.out.println(index);
			}
		}
	}
	
	public static void main(String[]args){
		For_Loops forLoops=new For_Loops();
		forLoops.evenNumbers(10,15);
		forLoops.divisibleBy5(10,30);
		forLoops.divisibleBy5and3(5,18);
		forLoops.divisibleBy7and13(5,91);
		forLoops.sumOfGivenNumbers(1,5);
		forLoops.diffInSumOfOddEvnNum(3,9);
		forLoops.oddNumbers(10,20);
	}
}