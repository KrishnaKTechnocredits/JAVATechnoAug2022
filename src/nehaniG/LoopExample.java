package nehaniG;

class LoopExample{ 
    
	void printEvenNumbers(int startIndex, int endIndex){
		
		for (int index = startIndex; index <= endIndex; index++){
			if (index % 2 == 0){
				 System.out.println("Even number is:  " + index);
			}
		}
	}
	
	void divisibilityby5(int startIndex, int endIndex){
		
		for (int index = startIndex; index <= endIndex; index++){
			if (index % 5 == 0){
				 System.out.println("divisibility by 5 is:  " + index);
			}
		}
	}
	
	void divisibilityby5and13(int startIndex, int endIndex){
		
		for (int index = startIndex; index <= endIndex; index++){
			if (index % 5 == 0 && index % 3 == 0){
				 System.out.println("divisibility by 5 and 3 is:  " + index);
			}
		}
	}
	
	void divisibleby7and13(int startIndex, int endIndex){
		
		for (int index = startIndex; index <= endIndex; index++){
			if (index % 7 == 0){
				 System.out.println(index +"  "+ "is divisible by 7");
			}
			else if (index % 13 == 0){
				 System.out.println(index +"  "+ "is divisible by 13");
			}
		}
	}
	
    void sumOfNumbers(int startIndex, int endIndex){

        int sum = 0;
        for (int index = startIndex; index <= endIndex; index++){
            sum = sum + index;
		}
        System.out.println("Sum is:  " + sum);
    }

    void differenceInSumOfOddAndEvenNumbers(int startIndex, int endIndex){
		int sumEven = 0;
		int sumOdd = 0;
		for (int index = startIndex; index <= endIndex; index++){
			if (index % 2 == 0)
				sumEven += index;
			else 
				sumOdd = sumOdd + index;
		}
		    System.out.println("Difference in sum of od and even numbers is:  " + (sumOdd - sumEven) +"\n");
	}
	
	void oddNumbersInReverseOrder(int startIndex, int endIndex){
		
		for(int index = startIndex; index >= endIndex; index--){
			if (index % 2 != 0){
				 System.out.println("Odd numbers in reverse order is:  " + index);
			}
		}
	}
	
	public static void main(String[] args){
		LoopExample loopExample = new LoopExample();
		loopExample.printEvenNumbers(10,15);
		loopExample.divisibilityby5(10,30);
		loopExample.divisibilityby5and13(5,18);
		loopExample.divisibleby7and13(5,40);
		loopExample.sumOfNumbers(1,5);
		loopExample.differenceInSumOfOddAndEvenNumbers(3,9);
		loopExample.oddNumbersInReverseOrder(20,10);
	}
}	
			
		
	
				 
