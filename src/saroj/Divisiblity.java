package saroj;
class Divisiblity{

	/*even numbers*/

	void evenNumbers(int startIndex, int endIndex){
		if(endIndex <= startIndex){
			System.out.println("Loop will not execute\n");	
		}else{
			System.out.println("\nEven numbers are: ");
		}
			for(int num = startIndex; num <= endIndex; num++){
				if(num % 2 == 0){
					System.out.println(num);
				}
			}
	}
	
	/*Divisible by 5*/
	
	void divisibleBy5(int startIndex, int endIndex){	
		if(endIndex <= startIndex){
			System.out.println("Loop will not execute\n");	
		}else{
			System.out.println("\nDivisible by 5,numbers are: ");
		}
			for(int num = startIndex; num <= endIndex; num++){
				if(num % 5 == 0){
					System.out.println(num);
				}
			}
	}
	
	/*Divisible by 5 and 3*/
	
	void divisibleBy5And3(int startIndex, int endIndex){
		if(endIndex <= startIndex){
			System.out.println("Loop will not execute\n");	
		}else{
			System.out.println("\nDivisible by 5 & 3,numbers are: ");
		}
			for(int num = startIndex; num <= endIndex; num++){
				if(num % 5 == 0 && num % 3 == 0){
					System.out.println(num);
				}
			}
	}
	
	/*Divisible by 7 or 13*/
	
	void divisibleBy7And13(int startIndex, int endIndex){
		if(endIndex <= startIndex){
			System.out.println("Loop will not execute\n");	
		}else{
			System.out.println("\nDivisible by 7 or 13,numbers are:");
		}
			for(int num = startIndex; num <= endIndex; num++){
				if(num % 7 == 0){
					System.out.println(num + " is divisible by 7");
				}
				if(num % 13 == 0){
					System.out.println(num + " is divisible by 13");
				}
			}
	}
	
	/*Sum of all the number in user define range*/
	
	void sumNumbers(int startIndex, int endIndex){
		int sum = 0;
		if(endIndex <= startIndex){
			System.out.println("Loop will not execute\n");	
		}else{
			System.out.println("\nsum is: ");
		}
			for(int num = startIndex; num <= endIndex; num++){
				sum += num;
			}	
			System.out.println(sum);
	}
	
	/*difference between sum of odd numbers and even numbers in a given range*/
	
	void differenceNum(int startIndex, int endIndex){
		int sum = 0;
		int diff = 0;
		if(endIndex <= startIndex){
			System.out.println("Loop will not execute\n");	
		}else{
			System.out.println("\nDifference is: ");
		}
			for(int num = startIndex; num <= endIndex; num++){
				if(num % 2 == 0){
					sum += num;
				}else{
					diff += num;
				}
			}
				System.out.println((sum - diff));
	}
	
	/*Print only odd numbers in reverse order*/
	
	void reverseOrder(int startIndex, int endIndex){
		if(endIndex <= startIndex){
			System.out.println("Loop will not execute\n");	
		}else{
			System.out.println("\nOdd number in reverse order is:");
		}
			for(int num = endIndex; num >= startIndex; num--){
				if(num % 2 != 0){
					System.out.println(num);
				}	
			}
	}
	
	public static void main(String[] args){
		Divisiblity divisibility = new Divisiblity();
		divisibility.evenNumbers(5, 18);
		divisibility.divisibleBy5(0, 20);
		divisibility.divisibleBy5And3(1,30);
		divisibility.divisibleBy7And13(7, 65);
		divisibility.sumNumbers(2, 11);
		divisibility.differenceNum(2, 3);
		divisibility.reverseOrder(2,10);
	}
}