package swatiM;
class ForLoopExp{
		
		void evenNumber(int start,int end){
			System.out.println("Even numbers are: ");
			 for(int index=start;index<=end;index++){
				if(index%2==0){
					System.out.println(index);
				}
			 }
		}
		void divisibleByFive(int start,int end){
			System.out.println("Divisible by 5 numbers are: ");
              for(int index=start;index<=end;index++){
				if(index%5==0){
					System.out.println(index);
				}
			 }
		}
		void divisibleByFiveAndThree(int start,int end){
			System.out.println("Divisible by 5 & 3 numbers are: ");
              for(int index=start;index<=end;index++){
				if(index%3==0 && index%5==0){
					System.out.println(index);
				}
			 }
		}
		void divisibleBySevenAndThirteen(int start,int end){
			System.out.println("Divisible by 7 or 13 numbers are: ");
              for(int index=start;index<=end;index++){
				if(index%7==0){
					System.out.println(index+" Divisible by 7");
				}
				else if(index%13==0){
					System.out.println(index+" Divisible by 13");
				}	
			 }
		}
		void sumDisplay(int start,int end){
			 int sum=0;
			System.out.println("sum of number between  " +start+ "  to " +end+ ":");
              for(int index=start;index<=end;index++){
				  sum = sum + index;					
				}
				System.out.println(sum);
		 }
		 void diffOddAndEven(int start,int end){
			    int evenSum =0;
				int oddSum =0;
				for(int index=start;index<=end;index++){
				   if(index%2==0){
						 evenSum = evenSum + index;
				}
				else if(index%2==1){
						 oddSum = oddSum + index;
					}
				}
				int total = oddSum - evenSum;
				System.out.println("Differnce between odd number and even number is : " +total);
		 }
		void reverseOddNumberDisplay(int start,int end){
			 System.out.println("Reverse order of odd number is  : ");
              for(int index=end;index>=start;index--){
				  if(index%2==1){
					 System.out.println(index);
				  }
			}
		 }
    public static void main(String[] a){
		ForLoopExp forLoopExp = new ForLoopExp();
		forLoopExp.evenNumber(10,15);
		forLoopExp.divisibleByFive(10,30);
		forLoopExp.divisibleByFiveAndThree(5,18);
		forLoopExp.divisibleBySevenAndThirteen(5,40);
		forLoopExp.sumDisplay(1,5);
		forLoopExp.diffOddAndEven(3,9);
		forLoopExp.reverseOddNumberDisplay(10,20);
		
		
	}
}