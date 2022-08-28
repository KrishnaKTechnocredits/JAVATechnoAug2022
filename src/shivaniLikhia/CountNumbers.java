package shivaniLikhia;
class CountNumbers{

	void evenNumbers(int startIndex,int endIndex){
		System.out.println("The Even Numbers are : ");
		for(int index=startIndex;index<=endIndex;index++){
			if(index%2==0){
				System.out.println(index);
			}
		}
	}

	void divisibleBy5(int startIndex,int endIndex){
		System.out.println("The Numbers divisible by 5 are :");
		for(int index=startIndex;index<=endIndex;index++){
			if(index%5==0){
				System.out.println(index);
			}
		}
	}

	void divisibleBy3and5(int startIndex,int endIndex){
		System.out.println("The Numbers divisible by 3 and 5 are :");
		for(int index=startIndex;index<=endIndex;index++){
			if(index%3==0 && index%5==0){
				System.out.println(index);
			}
		}
	}
	
	void divisibleBy70r13(int startIndex,int endIndex){
		System.out.println("The Numbers divisible by 7 0r 13 are :");
		for(int index=startIndex;index<=endIndex;index++){
			if(index%7==0 && index%13==0){
				System.out.println(index + " is divisible by both 7 and 13.");
			}
			else if(index%7==0){
				System.out.println(index + " is divisible by 7");
			}
			else if(index%13==0){
				System.out.println(index + " is divisible by 13");
			}
		}
	}

	void sumNumbers(int startIndex,int endIndex){
		int sum=0;
		for(int index=startIndex;index<=endIndex;index++){
			sum=sum+index;
		}
		System.out.println("The sum of Numbers from " + startIndex + " to " + endIndex + " is : " +sum);
	}

	void differenceNumbers(int startIndex,int endIndex){
		int sum=0;
		int sum1=0;
		int sum2=0;
		for(int index=startIndex;index<=endIndex;index++){
			if(index%2!=0){
				sum1=sum1+index;
			}
			else if(index%2==0){
				sum2=sum2+index;
			}
			sum=sum1-sum2;
		}
		System.out.println("The difference of the sum of odd and even numbers is : " +sum);
	}

	void  reverseOdd(int startIndex,int endIndex){
		System.out.println("The reverse order of odd numbers between " +startIndex+ " and " +endIndex+ " is :");
		for(int index=endIndex;index>=startIndex;index--){
			if(index%2!=0){
				System.out.println(+index);
			}
		}
	}

	public static void main(String[] args){
		CountNumbers countNumbers = new CountNumbers();
		countNumbers.evenNumbers(10,15);
		countNumbers.divisibleBy5(10,30);
		countNumbers.divisibleBy3and5(5,18);
		countNumbers.divisibleBy70r13(5,40);
		countNumbers.sumNumbers(1,5);
		countNumbers.differenceNumbers(3,9);
		countNumbers.reverseOdd(10,20);
	}
}