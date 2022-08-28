package hemanshi;
class MathLogic{
	
	void EvenNumber(int startindex, int finalindex){
		System.out.println("Even number between "+startindex+" and "+finalindex+"  are:");
		for(int index=startindex; index<=finalindex; index++){
			if(index%2 == 0){
				System.out.println(index);
			}
		}
			
	}
	
    void DivisibleBy5(int startindex, int finalindex){
		System.out.println("Number Divisible  between  "+startindex+" and "+finalindex+"  by 5 are:");
		for(int index=startindex; index<=finalindex; index++){
			if(index%5 == 0){
				System.out.println(index);
			}
		}
			
	}

    void DivisibleBy5And3(int startindex, int finalindex){
		System.out.println("Number Divisible  between "+startindex+" and "+finalindex+"  by 3 and 5 are:");
		for(int index=startindex; index<=finalindex; index++){
			if(index%5 == 0 && index%3 == 0){
				System.out.println(index);
			}
		}
			
	}
	
	void DivisibleBy7And13(int startindex, int finalindex){
		System.out.println("Number Divisible  between "+startindex+" and "+finalindex+"  by 7 and 13 are:");
		for(int index=startindex; index<=finalindex; index++){
			if(index%7 == 0 ){
				System.out.println(index + " is Divisible by 7");
			}else if(index%13 == 0){
				System.out.println(index + " is Divisible by 13");
				
			}
		}
			
	}
	
     void Sum(int startindex, int finalindex){
		 int  count=0;
		 for(int index=startindex; index<=finalindex; index++){
			 count = count + index;
		 }
		 System.out.println("sum is "+ count);
	
    }
	
	void Difference(int startindex, int finalindex){
		int even = 0;
		int odd = 0;
		for(int index=startindex; index<=finalindex; index++){
			if(index%2==0)
				even=even+index;
			else
				odd=odd+index;
		}
		System.out.println("Differenc is "+(odd-even));
		
	}
	
	void Reverse(int startindex, int finalindex){
		System.out.println("Reverse output of odd number between " + startindex + " and " + finalindex);
		for(int index=finalindex; index>=startindex; index--){
			if(index%2!=0){
				System.out.println(index);
			}
		}
			
	}
	
	
	
public static void main(String[] args){
	MathLogic mathLogic = new MathLogic();
	mathLogic.EvenNumber(10,15);
    mathLogic.DivisibleBy5(10,30);
	mathLogic.DivisibleBy5And3(5,18);
	mathLogic.DivisibleBy7And13(5,40);
	mathLogic.Sum(1,5);
	mathLogic.Difference(3,9);
	mathLogic.Reverse(10,20);
}

}