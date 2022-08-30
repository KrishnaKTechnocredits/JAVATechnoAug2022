package aishwaryaBirajdar;

public class Test {
	
	void displayDivisibility3_7(int start, int end) {
		
		int count	=	0;
		for(int i=start; i<=end; i++) {
			if(i%3==0 && i%7==0) {
				count++;
				System.out.println(i);
			}
			if(count==3) {
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		new Test().displayDivisibility3_7(20, 100);
	}

}
