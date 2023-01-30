package gauravSahu.practiceJanuray2023;

public class practice2 {
	
	void numberDiv(int num) {
		System.out.println("given number " + num);
		for(int index=1; index<=num;index++) {
			if(index%3==0) {
				System.out.println("Num div by 3 " + index);
			}
		}
	}
	
	public static void main(String[] args) {
		practice2 p2 = new practice2();
		p2.numberDiv(15);
		
	}

}
