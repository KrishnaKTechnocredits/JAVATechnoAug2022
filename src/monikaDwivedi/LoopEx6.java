package monikaDwivedi;

public class LoopEx6 {
	void processData(int num) {
		int index;
		for(index=2;index<=50;index++) {
			if(num%index == 0) {
				System.out.println("Techno "+index);
				
			}break;
		}
	}
	public static void main(String[] args) {
		LoopEx6 loopEx6 = new LoopEx6();
		loopEx6.processData(8);
		System.out.println("End");
		loopEx6.processData(9);
		System.out.println("End");
	}
}
