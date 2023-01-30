package gauravSahu.practiceJanuray2023;

public class practice8 {
	
	
	void lastNumDivBy37(int start, int end) {
		int count = 1;
		for(int index = end; index>=start;index--) {
			if(index%3 == 0 && index%7 == 0) {
				if(count<=3) {
					count++;
					System.out.println(index);
				}if(count>3) {
					break;
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		practice8 p8 = new practice8();
		p8.lastNumDivBy37(20,100);
	}

}
