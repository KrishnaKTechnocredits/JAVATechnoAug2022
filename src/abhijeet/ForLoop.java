package abhijeet;

class ForLoop{
	
	void allEvenNumbers(int startIndex,int endIndex){
		System.out.println("Following numbers are even numbers from range "+startIndex+" to "+endIndex);
		for(int index=startIndex;index<=endIndex;index++){
			if(index%2==0){
				System.out.println(+index);
			}
		}
	}
	
	void divisibleBy5(int startIndex,int endIndex){
		System.out.println("\n\nFollowing numbers are divisible by 5 from range "+startIndex+" to "+endIndex);
		for(int index=startIndex;index<=endIndex;index++){
			if(index%5==0){
				System.out.println(+index);
			}
		}
	}
	
	void divisibleBy3And5(int startIndex,int endIndex){
		System.out.println("\n\nFollowing numbers are divisible by both 3 & 5 from range "+startIndex+" to "+endIndex);
		for(int index=startIndex;index<=endIndex;index++){
			if(index%3==0 && index%5==0 ){
				System.out.println(+index);
			}
		}	
	}
	
	void divisibleBy7And13(int startIndex,int endIndex){
		System.out.println("\n\nFollowing numbers are divisible by either 7 or 13 from range "+startIndex+" to "+endIndex);
		for(int index=startIndex;index<=endIndex;index++){
			if(index%7==0){
				System.out.println(+index+" is divisible by 7");
			}else if(index%13==0){
				System.out.println(+index+" is divisible by 13");
			}
		}
	}
	
	void sumOfAllNumbers(int startIndex,int endIndex){
		int sum=0;
		System.out.println("\n\nThe sum of all numbers from range "+startIndex+" to "+endIndex+" is as follow");	
		
		for(int index=startIndex;index<=endIndex;index++){
			sum=sum+index;
		}
		System.out.println(+sum);
	}
	
	void differenceOfOddAndEvenNumbers(int startIndex,int endIndex){
		int sumOfOdd=0;
		int sumOfEven=0;
		int result=0;
		
		System.out.println("\n\nThe difference of all odd numbers and even numbers from range "+startIndex+" to "+endIndex+" is as follow");
		for(int index=startIndex;index<=endIndex;index++){
			if(index%2!=0){
				sumOfOdd=sumOfOdd+index;
			}else if(index%2==0){
				sumOfEven=sumOfEven+index;
			}
			result=sumOfOdd-sumOfEven;
			
		}
		System.out.println(+result);
	}
	
	void allOddNumbersReverse(int startIndex,int endIndex){
		System.out.println("\n\nFollowing numbers are odd numbers from range "+startIndex+" to "+endIndex+" in reverse order");
		for(int index=endIndex;index>=startIndex;index--){
			if(index%2!=0){
				System.out.println(+index);
			}
		}
	}

	public static void main(String[]args){
		ForLoop forLoop = new ForLoop();
		forLoop.allEvenNumbers(10,15);
		forLoop.divisibleBy5(10,30);
		forLoop.divisibleBy3And5(5,18);
		forLoop.divisibleBy7And13(5,40);
		forLoop.sumOfAllNumbers(1,5);
		forLoop.differenceOfOddAndEvenNumbers(3,9);
		forLoop.allOddNumbersReverse(10,20);
		
	}
}