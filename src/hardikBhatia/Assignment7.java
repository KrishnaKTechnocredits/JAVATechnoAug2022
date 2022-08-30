package hardikBhatia;

public class Assignment7 {
	void printAllEvenNumber(int startIndex, int endIndex){
		System.out.println("Even numbers are:");
		for(int i = startIndex; i<= endIndex; i++){
			if(i%2 == 0){
				System.out.println(i);
			}
		}
	}
	void printAllDivideBy5(int startIndex, int endIndex){
		System.out.println("Divisible by 5, numbers are:");
		for(int i = startIndex; i<= endIndex; i++){
			if(i%5 == 0){
				System.out.println(i);
			}
		}
	}
	void printAllDivideBy5DivisibleBy7(int startIndex, int endIndex){
		System.out.println("Divisible by 5 & 3, numbers are:");
		for(int i = startIndex; i<= endIndex; i++){
			if(i%5 == 0 && i%3 == 0){
				System.out.println(i);
			}
		}
	}
	void printAllDivideBy7DivisibleBy13(int startIndex, int endIndex){
		System.out.println("Divisible by 7 or 13, numbers are:");
		for(int i = startIndex; i<= endIndex; i++){
			if(i%7 == 0){
				System.out.println(i + " is divisible by 7");
			}
			else if(i%13 == 0){
				System.out.println(i + " is divisible by 13");
			}
		}
	}
	void findSumOfAllNumber(int startIndex, int endIndex){
		System.out.println("Find sum of all the numbers");
		int sum = 0;
		for(int i = startIndex; i <= endIndex; i++){
			sum = sum + i;
		}
		System.out.println("Sum is " + sum);
	}
	void FindDifferenceSumOfOddNoEvenNo(int startIndex, int endIndex){
		System.out.println("Difference between sum of odd numbers and even numbers");
		int sumOdd = 0;
		int sumEven = 0;
		for(int i = startIndex; i <= endIndex; i++){
			if(i%2 == 0){
				sumOdd = sumOdd + i;
			}else{
				sumEven = sumEven + i;
			}
		}
		System.out.println(sumEven - sumOdd);
	}
	void printOddNumber(int startIndex, int endIndex){
		System.out.println("Print only odd numbers in reverse order");
		for(int i = endIndex; i >= startIndex; i--){
			if(i%2 != 0){
				System.out.println(i);
			}
		}
	}

	
	public static void main(String[] args){
		Assignment7 assignment7 =  new Assignment7();
		assignment7.printAllEvenNumber(10,15);
		assignment7.printAllDivideBy5(10,30);
		assignment7.printAllDivideBy5DivisibleBy7(5,18);
		assignment7.printAllDivideBy7DivisibleBy13(5,40);
		assignment7.findSumOfAllNumber(1,5);
		assignment7.FindDifferenceSumOfOddNoEvenNo(3,9);
		assignment7.printOddNumber(10,20);
	}
}
