package aishwaryaBirajdar;


class LoopExamples{
	int evensum=0;
    int	oddsum=0;
    int total;
	void evenDisplay(int start, int end){
		System.out.println("Even numbers are :");
		for(int i=start; i<=end; i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
	void divisible5(int start, int end){
		System.out.println("Divisible by 5, numbers are:");
		for(int i=start; i<=end; i++){
			if(i%5==0){
				System.out.println(i);
			}
		}
	}
	void divisible53(int start, int end){
		System.out.println("Divisible by 5 & 3, numbers are : ");
		for(int i=start; i<=end; i++){
			if(i%3==0 && i%5==0){
				System.out.println(i);
			}
		}
	}
	void divisible713(int start, int end){
		System.out.println("Divisible by 7 or 13, numbers are : ");
		for(int i=start; i<=end; i++){
			if(i%7==0){
				System.out.println(i+" is divisible by 7");
			}else if(i%13==0){
				System.out.println(i+" is divisible by 13");
			}
		}
	}
	void sumDisplay(int start, int end){
		int sum = 0;
		System.out.println("Sum of number between "+start+" to "+end+" : ");
		for(int i=start; i<=end; i++){
			sum = sum + i;
		}
		System.out.println(sum);
	}
	
	void differenceOddEven(int start, int end){
		
		for(int i=start; i<=end; i++){
			if(i%2==0){
				evensum = evensum+ i;
		    }else if(i%2==1){
				oddsum = oddsum + i;
			}
		}
		total = oddsum - evensum;
		System.out.println("Difference between Odd numbers and Even numbers is : "+total);
	}
	void reverseOddDisplay(int start, int end){
		System.out.println("Odd number reverse order : ");
		for(int i=end; i>=start; i--){
			if(i%2==1){
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args){
		LoopExamples loopexm = new LoopExamples();
		loopexm.evenDisplay(10,15);
		System.out.println(" ");
		loopexm.divisible5(10,30);
		System.out.println(" ");
		loopexm.divisible53(5,18);
		System.out.println(" ");
		loopexm.divisible713(5,40);
		System.out.println(" ");
		loopexm.sumDisplay(1,5);
		System.out.println(" ");
		loopexm.differenceOddEven(3,9);
		System.out.println(" ");
		loopexm.reverseOddDisplay(10,20);
	}
}