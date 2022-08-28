package amrutaSagne;
class LoopEx1{
	
	void evenNumber(int startIndex, int endIndex){
		System.out.println("Even numbers are : ");
		for(int i = startIndex; i<=endIndex; i++){
			if(i%2==0){
			System.out.println(" "+i);
			}			
		}
	}

	void divisbleBy5(int startIndex, int endIndex){
		System.out.println("Divisible by 5, numbers are : ");	
		for(int i=startIndex; i<=endIndex; i++){
			if(i%5==0){
			System.out.println(" "+i);
			}	
		}	
	}

	void divisbleBy5And3(int startIndex, int endIndex){
		System.out.println("Divisible by 5&3, numbers are : ");
		for(int i=startIndex; i<=endIndex; i++){
			if(i%5==0 && i%3==0){
			System.out.println(" " +i);	
			}	
		}
	}
	
	void divisbleBy7Or13(int startIndex, int endIndex){
		System.out.println("Divisible by 7 or 13, numbers are : ");
		for(int i=startIndex; i<=endIndex; i++){
			if(i%7==0){
				System.out.println(i + " is divisible by "+7 );	
			}else if (i%13==0){
				System.out.println(i + " is divisible by "+13 );
			}	
		}
	}
	
	void sumOfNumbers(int startIndex, int endIndex){
		int sum = 0;
			for(int i=startIndex; i<=endIndex; i++){
				sum += i;
			}	
			System.out.println("Sum of numbers " +sum);
	}

	void diffOfSumOdd(int startIndex, int endIndex){
		int evenSum = 0;
		int oddSum =0;
		for(int i=startIndex; i<=endIndex; i++){
			if(i%2==0){
				evenSum = evenSum+i;
			}else if (i%2!=0){
				oddSum = oddSum+i;
			}	 
		}
		System.out.println("Difference between sum of odd and even numbers " + (oddSum-evenSum));
	}

	void oddReverse(int startIndex, int endIndex){
		System.out.println("Reverse order is : ");	
		for(int i=endIndex; i>=startIndex; i--){
			if(i%2!=0){
				System.out.println (" " +i);
			}	
		}
	}	
		
	public static void main (String[] args) {
		LoopEx1 loopEx1 = new LoopEx1();
		loopEx1.evenNumber(10,15);
		loopEx1.divisbleBy5(10,30);
		loopEx1.divisbleBy5And3(5,18);
		loopEx1.divisbleBy7Or13(5,40);
		loopEx1.sumOfNumbers(1,5);
		loopEx1.diffOfSumOdd(3,9);
		loopEx1.oddReverse(10,20);
	}
}
























