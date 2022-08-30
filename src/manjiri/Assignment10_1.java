package manjiri;

public class Assignment10_1 {
	
	void divisibleBy3and7(int startIndex, int endIndex) {
		int count = 0;
		for (int index = endIndex;index >= startIndex; index--) {
			if(index % 3 == 0 && index%7 ==0) {
				count++;
				System.out.println(index);
				if (count == 3) {
					break;
				}
			}
		}	
	}
	
	void findSecondLastNumber(int startIndex, int endIndex) {
		int count = 0;
		for (int index = endIndex;index >= startIndex; index--) {
			if(index % 3 == 0 && index%7 ==0) {
				count++;
				if (count == 2) {
					System.out.println("Second last index is: " + index);
					break;
				}
			}
		}		
	}
	
	public static void main(String[] args) {
		Assignment10_1 assignment10_1 = new Assignment10_1();
		assignment10_1.divisibleBy3and7(10,200);
		assignment10_1.findSecondLastNumber(10, 200);
	}
}
