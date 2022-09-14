package anujaD;

public class LoopEx7 {
	
	void loopExample(int number) {
		int index=1;
		for (;index<=5;) {
		
			System.out.println("-----" +index);
			index++;
		}
		
	}
	
	public static void main(String[] args) {
		LoopEx7 loopEx7 = new LoopEx7();
		loopEx7.loopExample(10);
	
	}

}
