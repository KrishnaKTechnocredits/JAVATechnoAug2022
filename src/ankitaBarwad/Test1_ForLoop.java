package ankitaBarwad;

public class Test1_ForLoop {
	
	void processData(int startRange, int endRange) {
		int count = 0;
		
		for(int index=startRange;index<=endRange;index++) {
			if(index%3 == 0 && index%7==0) {
				System.out.println(index + " is divisible by 3 and 7");
				count++;
				if(count==3)
					break;
			}
		}
	}

	public static void main(String[] args) {
		Test1_ForLoop forLoop1 = new Test1_ForLoop();
		forLoop1.processData(20, 100);
	}
}
