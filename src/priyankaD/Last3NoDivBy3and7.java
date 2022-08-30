package priyankaD;

public class Last3NoDivBy3and7 {
	void processData(int startR, int endR) {
		int count=0;
		for(int index=startR;index>=endR;index--) {
			if(index%3==0 && index%7==0) {
				count++;
			System.out.println(index);
		}
		if(count==3)
	    break;
	}
}
	public static void main(String[]args) {
		Last3NoDivBy3and7 lastNo=new Last3NoDivBy3and7();
		lastNo.processData(200,10);
	}
}
