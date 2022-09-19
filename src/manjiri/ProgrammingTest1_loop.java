package manjiri;

public class ProgrammingTest1_loop {
	int count;
	void divisibleBy3and7(int startIndex,int endIndex) {
		for(int index= startIndex;index<=endIndex;index++) {
			if(index%3 == 0 & index%7 ==0) {
				System.out.println(index);
				count += 1;
				if(count == 3) {
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		new ProgrammingTest1_loop().divisibleBy3and7(20,100);
	}

}
