package niveditaGavade;

public class LoopTest{
	void divisibleBy3and7(int startIndex, int endIndex){
		int count=0;
		System.out.println("Number divisible by 3 and 7 are:");
		for(int index=startIndex; index<=endIndex; index++){
			if(index%3==0 && index%7==0) {
				System.out.println(index);
				count++;
			}
		if(count==3)
		break;
	}
	}
	public static void main(String[] args){
		LoopTest loopTest=new LoopTest();
		loopTest.divisibleBy3and7(20,100);
	}
	
	}
