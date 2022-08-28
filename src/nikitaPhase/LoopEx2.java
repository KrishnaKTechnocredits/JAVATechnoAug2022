package nikitaPhase;
class LoopEx2{ 
	
	void sumOfAllNumbers(int startIndex,int endIndex){
		int sum = 0;
		for(int index=startIndex;index<=endIndex; index++){
			sum = sum + index;
		}
		System.out.println("Sum of all numbers from " + startIndex + " to "+ endIndex+ " are:" + sum);
		System.out.println();
	}
	
	void differenceBetweenOddAndEven(int startIndex,int endIndex){
		int difference = 0;
		int sumOfOdd = 0;
		int sumOfEven = 0;
		for(int index = startIndex; index<=endIndex; index++){
			if(index%2==0){
				sumOfEven = sumOfEven + index;
			}
			else{
				sumOfOdd = sumOfOdd + index;
			}
		}
		difference = sumOfOdd - sumOfEven;
		System.out.println("Difference between sum of odd and even numbers from" +startIndex + " and " + endIndex +" are:" + difference);
		System.out.println();
	}
	
	
	void oddNumbersInReverse (int startIndex, int endIndex){
        System.out.println("Odd numbers in reverse order are: ");
        for(int index = endIndex; index>=startIndex; index--){
			if(index%2!=0)
            System.out.println(index);
		}
		System.out.println();
	}
	
	public static void main(String args []){
		LoopEx2 loopEx2 = new LoopEx2 ();
		loopEx2.sumOfAllNumbers(0,5);
		loopEx2.differenceBetweenOddAndEven(3,5);
		loopEx2.oddNumbersInReverse(10,20);
	}
}