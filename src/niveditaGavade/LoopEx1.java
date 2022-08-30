package niveditaGavade;

public class LoopEx1 {
	void lastDivisibleBy3and7(int startIndex, int endIndex){
		int count=0;
		System.out.println("Last three numbers divisible by 3&7 are:");
		
		for(int index=startIndex;index>=endIndex; index--){
			if(index%3==0 && index%7==0){
			System.out.println(index);
			count++;
			}
			if (count==3)
				break;
		}
	}
	
	public static void main(String[] args){
		LoopEx1 loopEx1= new LoopEx1();
		loopEx1.lastDivisibleBy3and7(200,10);
	}	
}
