package ashishBramhe;

class A6_EvenOddForLoopExamples{
	
	int sum = 0;
	
	void displayEvenNumbers(int n){
		System.out.println(" Even numbers till " + n + " are : ");
		for(int i=0; i<=n; i++){
			if(i%2 == 0)
				System.out.println(i);
		}		
	}
	
	void displayOddNumbers(int n){
		System.out.println(" Odd numbers till " + n + " are : ");
		for(int i=0; i<=n; i++){
			if(i%2 == 1)
				System.out.println(i);
		}		
	}
	
	void displaySum(int n){
		for(int i=0; i<=n; i++)
				sum = sum + i;
		System.out.println(" Sum of numbers till " + n + " is : " + sum);
	}
	
	void displayDecreasingTable(int n){
		System.out.println(" Table of " + n +" in decreasing order : ");
		for(int i=10; i>=1; i--)
			System.out.println(n*i);
	}
	
	public static void main(String args[]){
		A6_EvenOddForLoopExamples evenOddForLoopExamples = new A6_EvenOddForLoopExamples();
		evenOddForLoopExamples.displayEvenNumbers(20);
		evenOddForLoopExamples.displayOddNumbers(20);
		evenOddForLoopExamples.displaySum(10);
		evenOddForLoopExamples.displayDecreasingTable(9);
	}
}