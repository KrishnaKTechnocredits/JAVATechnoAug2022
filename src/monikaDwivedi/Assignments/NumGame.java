package monikaDwivedi.Assignments;
class NumGame{
	int num;
	
	void printEvenNumbers(int num1,int num2){	
		if(num1>num2){
			System.out.println("Negative number is neither an even number nor an odd number");
		}
		else{
			for(num=num1; num<=num2; num++){
				if(num%2==0){
					System.out.println("Number divisible by 2 are:- "+num);
				}
			}
		}
	}
	
	void divBy5(int num1,int num2){
		for(num=num1; num<=num2; num++){
			if(num%5==0){
				System.out.println("Number divisible by 5 are:- "+num);
			}
		}		
	}
	
	void divBy5And13(int num1,int num2){
		for(num=num1; num<=num2; num++){
			if(num%5==0 && num%13==0){
				System.out.println("Number divisible by 5 & 13 are:- "+num);
			}
		}		
	}
	
	void divBy7And13(int num1,int num2){
		for(num=num1; num<=num2; num++){
			if(num%7==0 && num%13==0){
				System.out.println("Number divisible by 7 & 13 are:- "+num);
			}
		}
	}
	
	void sumAll(int start, int end){
		int i, sum = 0;
		for(i = start; i<= end; i++){
			sum = sum + i;
		}
		System.out.println("Sum of given range is:- " + sum);
	}
	
	void diffBetweenSumOfEvenAndSumOfOdd(int num1, int num2){
		int evenSum=0;
		int oddSum=0;
		for (int num=num1; num<=num1; num++){
			if(num%2==0){
				evenSum += num;
			}
			else{
				oddSum += num;
			}
		}
		System.out.println("Difference between sum of even and odd numbers is:- " +(evenSum-oddSum));
	}
	
	void oddReverseOrder(int num1, int num2){
		System.out.println("Odd numbers in reverse order between range " +num1 +" and "+num2);
		for (int num=num2; num>=num1; num--){
			if(num%2!=0){
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args){
		NumGame numGame = new NumGame();
		numGame.printEvenNumbers(10,15);
		numGame.divBy5(10,30);
		numGame.divBy5And13(5,18);
		numGame.divBy7And13(5,40);
		numGame.sumAll(1,5);
		numGame.diffBetweenSumOfEvenAndSumOfOdd(3,9);
		numGame.oddReverseOrder(10,20);
	}
}