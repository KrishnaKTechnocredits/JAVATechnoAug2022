package shrutiArora;
public class LoopExample {
	int evenSum;
    int	oddSum;
    int diff;
	void printEvenNum(int startIndex, int endIndex){
		System.out.println("Even numbers are :");
		for(int num=startIndex; num<=endIndex; num++){
			if(num%2==0){
				System.out.println(num);
			}
		}
	}
	void divisibleBy5(int startIndex, int endIndex){
		System.out.println("Divisible by 5, numbers are:");
		for(int num=startIndex; num<=endIndex; num++){
			if(num%5==0){
				System.out.println(num);
			}
		}
	}
	void divisibleBy5And3(int startIndex, int endIndex){
		System.out.println("Divisible by 5 & 3, numbers are : ");
		for(int num=startIndex; num<=endIndex; num++){
			if(num%3==0 && num%5==0){
				System.out.println(num);
			}
		}
	}
	void divisible7Or13(int startIndex, int endIndex){
		System.out.println("Divisible by 7 or 13, numbers are : ");
		for(int num=startIndex; num<=endIndex; num++){
			if(num%7==0){
				System.out.println(num+" is divisible by 7");
			}else if(num%13==0){
				System.out.println(num+" is divisible by 13");
			}
		}
	}
	void PrintSum(int startIndex, int endIndex){
		int sum = 0;
		System.out.println("Sum of number between "+startIndex+" to "+endIndex+" : ");
		for(int num=startIndex; num<=endIndex; num++){
			sum = sum + num;
		}
		System.out.println(sum);
	}
	
	void differenceOddEven(int startIndex, int endIndex){
		
		for(int num=startIndex; num<=endIndex; num++){
		     if(num%2 ==0 ) {
		    	 evenSum = evenSum + num;
		     }
		     else {
		    	 oddSum = oddSum + num;
		     }
		}
	   diff = evenSum>oddSum? evenSum-oddSum:oddSum-evenSum;
		System.out.println("Difference between evenSum and oddSum: " + diff);
	}
		
	void printOddInReverse(int startIndex, int endIndex){
		System.out.println("Odd numbers In reverse order : ");
		for(int num=endIndex; num>=startIndex; num--){
			if(num%2!=0){
				System.out.println(num);
			}
		}
	}
	public static void main(String[] args){
		LoopExample loopExample = new LoopExample();
		System.out.println("*******************************************Program1**************************************");
		loopExample.printEvenNum(10, 15);
		System.out.println("********************************************Program2********************************************");
		loopExample.divisibleBy5(10, 30);
		System.out.println("*****************************************Program3******************************************************"); 
		loopExample.divisibleBy5And3(5, 18);
		System.out.println("********************************************Program4*****************************************************");
		loopExample.divisible7Or13(5, 40);
		System.out.println("***********************************************Program5***************************************************");
		loopExample.PrintSum(1, 5);
		System.out.println("************************************************Program6****************************************************");
		loopExample.differenceOddEven(3, 9);
		System.out.println("****************************************************Program7*****************************************************");
		loopExample.printOddInReverse(10, 20);
	}
}