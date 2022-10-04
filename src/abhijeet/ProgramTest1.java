package abhijeet;

class ProgramTest1{
	
	void first3DivisibleBy3And7(int startIndex,int endIndex){
		int count=0;
		
		for(int index=startIndex;index<=endIndex;index++){
			if(index%3==0 && index%7==0){
				count++;
				System.out.println(index);
				if (count==3)
					break;
			}
		}
	}
	
	public static void main (String[]args){
		new ProgramTest1().first3DivisibleBy3And7(20,100);
	}
}