package vibhaS;

public class LoopEx1 {
	int count=0;
	void processData(int num1,int num2) {
		System.out.println("Three number which is divisible by 3 and 7 is :-");
		for(int index=num1;index<=num2;index++) {
			if(index%3==0 && index%7==0) {
				System.out.println(" "+index);
				count++;
			}if(count==3) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		LoopEx1 loopEx1=new LoopEx1();
		loopEx1.processData(20,100);
	}
}
