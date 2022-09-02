package technocredits.loopexamples;

public class LoopEx6 {
	
	void processData() {
		int sum = 0;
		for(int index=2;index<=50;index++) {
			sum = sum + index;
			if(sum > 17)
				break;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		LoopEx6 loopEx6 = new LoopEx6();
		loopEx6.processData();
		System.out.println("End");
	}
}
