package monikaDwivedi;

public class LoopEx7 {
	
	void loopExample(int num) {
		int index;
		for(index=1;index<=5;index++) {
			System.out.println(index);
		}
		System.out.println("----------"+index);
	}
	public static void main(String[] args) {	
		new LoopEx7().loopExample(10);
	}
}
