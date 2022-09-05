package technocredits.loopexamples;

public class LoopEx7 {
	void loopExample(int number) {
		int index;
		for(index=1;index<=4;index++) {
			System.out.println(index);
		}
		System.out.println("-----"+index);
	}
	
	public static void main(String[] args) {
		LoopEx7 loopEx7 = new LoopEx7();
		loopEx7.loopExample(10);
	}
}
