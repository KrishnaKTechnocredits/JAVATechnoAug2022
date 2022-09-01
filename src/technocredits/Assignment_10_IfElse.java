package technocredits;

class Assignment_10_IfElse{
	
	public static void main(String[] args) {
		System.out.println("Assignment 10 DOne");
	}
	
	void m1(int startIndex){
		int count=0;
		for(;startIndex<=50;startIndex++){
			
			if(startIndex%3==0 && startIndex%7==0){
				count++;
			}
		}
		System.out.println(count);
	}
	
	void m2(int startIndex, int endIndex){
		for(int index=startIndex;index<=endIndex;index++){
			int count=0;
			if(index%3==0 && index%7==0){
				count++;
			}
		}
	}
		
		
}