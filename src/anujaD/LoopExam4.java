package anujaD;

class LoopExam4{
	
		void printevenNumber(int startIndex,int endIndex){
			System.out.println("even numbers are :");
				for(int index=startIndex;index<=endIndex;index++){
					if(index%2==0){
					  System.out.println(index);
					  }
				}
			}
		void dividenumbers(int startIndex,int endIndex){
			System.out.println("divisible by 5 numbers are :");
			   for(int index=startIndex;index<=endIndex;index++){
					if(index%5==0){
						System.out.println(index);
					}
			   }
		    }
		void divisiblnumbers(int startIndex,int endIndex){
			System.out.println("Numbers divisible by 5 and divisible by 3 are : ");
				for(int index=startIndex;index<=endIndex;index++){
					if(index%3==0 && index%5==0){
						System.out.println(index);
					}
				}
			}
		  void divnum(int startIndex,int endIndex){
			System.out.println("Divisible by 7 or by 3 numbes are : ");
				for(int index=startIndex;index<=endIndex;index++){
				if(index%7==0){
						System.out.println(index+ " number is divisible by 7");
					}
					else if(index%13==0){
						System.out.println(index+ " number is divisible by 13");
					}
					
				}
			
			}
		void sumnumber(int startIndex,int endIndex){
			int sum =0;
			for(int Index=startIndex;Index<=endIndex;Index++){
				sum = sum + Index;
			}
				  System.out.println("Sum is :" +sum);
			}
		void range(int startIndex,int endIndex){
			int difference=0;
			int oddsum =0;
			int evensum =0;
					for(int Index=startIndex;Index<=endIndex;Index++){
						if(Index%2==0){
						evensum = evensum +Index;
					}else{
						oddsum = oddsum +Index;
					}
					difference = evensum - oddsum;
				}
				System.out.println("difference between sum of odd numbers and even numbers"  +difference);
			}
		void oddnumber(int startIndex,int endIndex){
			System.out.println("odd numbers in reverse are :");
			    for(int Index=endIndex;Index>=startIndex;Index--){
				      if(Index%2==1){
						  System.out.println(Index);
					}
				}
			}
				public static void main(String[] args){
					LoopExam4  loopexam4 =new LoopExam4();
					loopexam4.printevenNumber(10,15);
					loopexam4.dividenumbers(10,30);
					loopexam4.divisiblnumbers(5,18);
					loopexam4.divnum(5,40);
					loopexam4.sumnumber(1,5);
					loopexam4.range(3,9);
					loopexam4.oddnumber(10,20);
				}
}