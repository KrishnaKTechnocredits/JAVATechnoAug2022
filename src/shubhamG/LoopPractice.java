package shubhamG;
class LoopPractice{

	void evenNumber(int startIndex, int endIndex){
		System.out.println("Even numbers are:");
		for (int i= startIndex;i<=endIndex;i++){
			if(i%2==0)
				System.out.println(i);
		}	
	}
	
	void divisiblityBy5(int startIndex, int endIndex){
		System.out.println("\nDivisible by 5, numbers are:");
		for (int i= startIndex;i<=endIndex;i++){
			if(i%5==0)
				System.out.println(i);
		}	
	}
		
	void divisiblityBy5and3(int startIndex, int endIndex){
		System.out.println("\nDivisible by 5 & 3, numbers are:");
		for (int i= startIndex;i<=endIndex;i++){
			if(i%3==0 && i%5==0 )
				System.out.println(i);
		}	
	}
	
	void divisiblityBy7or13(int startIndex, int endIndex){
		System.out.println("\nDivisible by 7 or 13, numbers are:");
		for (int i= startIndex;i<=endIndex;i++){
			if(i%7==0 )
				System.out.println(i+" is divisible by 7");
			else if(i%13==0 )
				System.out.println(i+" is divisible by 13");
		}	
	}	
	
	void sumInRange(int startIndex, int endIndex){
		int sum=0; 
		for (int i= startIndex;i<=endIndex;i++){
			sum =sum+i;
		}	
		System.out.println("\nsum is: " +sum);
		
	}	
	
	void difference(int startIndex, int endIndex){
		int even=0;
		int odd=0;
		int difference;
		for (int i= startIndex;i<=endIndex;i++){
			if(i%2==0 )
				even =even+i;
			else if(i%2==1 )
				odd=odd+i;
		}	
		difference=odd-even;
		System.out.println("\nDifference is: "+difference);
	}	
	
	void reverseOrder(int startIndex, int endIndex){
		System.out.println("\nOdd numbers in reverse order are:");
		for (int i= endIndex;i>=startIndex;i--){
			if(i%2==1)
				System.out.println(i);
		}	
	}	
		
	public static void main(String[] args){
		LoopPractice loopPractice = new LoopPractice();
		loopPractice.evenNumber(10,15);
		loopPractice.divisiblityBy5(10,30);
		loopPractice.divisiblityBy5and3(5,18);
		loopPractice.divisiblityBy7or13(5,40);
		loopPractice.sumInRange(1,5);
		loopPractice.difference(3,9);
		loopPractice.reverseOrder(10,20);
	}
}	