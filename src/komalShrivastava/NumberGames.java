//Komal Shrivastava - Assignment 7 - 25th Aug 2022

package komalShrivastava;

class NumberGames {

	void printEvenNumbers(int start, int end){
		System.out.print("Even Number between " + start + " to " + end + " : ");
		for(int index = start; index <=end; index++){
			if(index%2 == 0)
				System.out.print(index + " ");
		}
		System.out.println();
	}
	
	void divisibleBy5(int start, int end){
		System.out.print("Numbers divisible by 5 between " + start + " to " + end + " : ");
		for(int index = start; index <= end; index++){
			if(index%5 == 0)	
				System.out.print(index + " ");
		}
		System.out.println();
	}

	void divisibleBy3and5(int start, int end){
		System.out.print("Numbers divisible by 3 and 5 between " + start + " to " + end + " : ");
		for(int index = start; index <= end; index++){
			if(index%3 == 0 && index%5 == 0)
				System.out.print(index + " ");
		}
		System.out.println();
	}
		
	void divisibleBy7or13(int start, int end){
		System.out.println("Numbers divisible by 7 or 13 between " + start + " to " + end + " : ");
		for(int index = start; index <= end; index++){
			if(index%7 == 0)
				System.out.println(index + " is divisible by 7 "); 
			else if(index%13 == 0)	
				System.out.println(index + " is divisible by 13 "); 
		}
	}

	void sum(int start, int end){
		int sum = 0;
		for(int index = start; index <= end; index++){
			sum+= index;
		}
		System.out.println("Sum of all numbers between " + start + " to " + end + " : " + sum);
	}

	void difference(int start, int end){
		int sumEven = 0;
		int sumOdd = 0;
		for(int index = start; index <= end; index++){
			if(index%2 == 0)
				sumEven+= index;
			else
				sumOdd+= index;
		}
		System.out.println("Difference between Odd and Even numbers for range " + start + " to " + end + " : " + (sumOdd-sumEven));
	}
		
	void reverse(int start, int end){
		System.out.print("Reverse order for odd numbers between " + start + " to " + end + " : ");
		for(int index = end; index >= start; index--){
			if(index%2 != 0)
				System.out.print(index + " ");
		}
		System.out.println();
	}

	public static void main(String args[]){
		NumberGames numberGames = new NumberGames();
		numberGames.printEvenNumbers(10, 15);
		numberGames.divisibleBy5(10, 30);
		numberGames.divisibleBy3and5(5, 18);
		numberGames.divisibleBy7or13(5, 40);
		numberGames.sum(1, 5);
		numberGames.difference(3, 9);
		numberGames.reverse(10, 20);
	}	
}	
