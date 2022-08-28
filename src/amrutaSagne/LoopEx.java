package amrutaSagne;
class LoopEx{
	
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
			System.out.println(" " +sum);
		}		
	

	void diffOfSumOdd(int startIndex, int endIndex){
		int evenSum = 0;
		int oddSum =0;
		for(int i=startIndex; i<=endIndex; i++){
			if(i%2==0){
				evenSum = evenSum+i;
			}else{
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
		LoopEx loopEx = new LoopEx();
		loopEx.evenNumber(10,15);
		loopEx.divisbleBy5(10,30);
		loopEx.divisbleBy5And3(5,18);
		loopEx.divisbleBy7Or13(5,40);
		loopEx.sumOfNumbers(1,5);
		loopEx.diffOfSumOdd(3,9);
		loopEx.oddReverse(10,20);
	}
}
























