package rohanNaik;

class LoopAssignment{
	
	void printEven(int num1, int num2){
		for(;num1<=num2;num1++){
				if(num1%2==0)
					System.out.println(num1);
		}
	}
	
	
	void divisibleByFive(int num1, int num2){
		for(;num1<=num2;num1++){
				if(num1%5==0)
					System.out.println(num1);
		}
	}
	
	
	void divisibleByFiveAndThree(int num1, int num2){
		for(;num1<=num2;num1++){
				if(num1%5==0  && num1%3==0)
					System.out.println(num1);
		}
	}
	
	
	void divisibleBySevenOrThirteen(int num1, int num2){
		for(;num1<=num2;num1++){
				if(num1%7==0  || num1%13==0){
					if(num1%7==0)
						System.out.println(num1 +" is divisible by 7");
					if(num1%13==0)
						System.out.println(num1 +" is divisible by 13");
				}
		}
	}
	
	void sum(int num1, int num2){
		int x=0;
		for(;num1<=num2;num1++){
			x = x + num1;
		}
		System.out.println(x);
	}
	
	void oddEvenDifference(int num1, int num2){
		int oddSum=0;
		int evenSum=0;
		int difference=0;
		
		for(;num1<=num2;num1++){
			if(num1%2==0)
				evenSum = evenSum + num1;
			else
				oddSum = oddSum + num1;				
		}
		difference = oddSum-evenSum;
		System.out.println(difference);
	}
	
	void oddreverse(int num1,int num2){
		
		for(int x=num2;x>=num1;x--){
			if(x%2==1)
				System.out.println(x);
		}
		
		
	}
	
	
	public static void main(String[] args){
		LoopAssignment example1 = new LoopAssignment();
		example1.printEven(10,15);
		System.out.println("----------");
		example1.divisibleByFive(10,30);
		System.out.println("----------");
		example1.divisibleByFiveAndThree(5,18);
		System.out.println("----------");
		example1.divisibleBySevenOrThirteen(5,100);
		System.out.println("----------");
		example1.sum(1,5);
		System.out.println("----------");
		example1.oddEvenDifference(3,9);
		System.out.println("----------");
		example1.oddreverse(10,20);
	
	}
}
	