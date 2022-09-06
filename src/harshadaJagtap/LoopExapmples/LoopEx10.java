package harshadaJagtap.LoopExapmples;

public class LoopEx10 {
	int count;
	
	void processData(int startR, int endR) {
		for(int index=startR; index<=endR; index++) {
			if(index%3==0 && index%7==0) {
				System.out.println(index);
				count++;
				if(count==3)
					break;
			}
		}
	}
	
	public static void main(String[] args) {
		LoopEx10 loopex10=new LoopEx10();
		loopex10.processData(1,100);
	}
}
