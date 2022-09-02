package nehaniG;

public class Test1_Nehani {
	void divisibleby3and7 (int startIndex, int endIndex) {
		int count=0; 
		for (int index = startIndex; index <= endIndex; index++) {
			if(index%3 == 0 && index%7 == 0) {
				count++;
				System.out.println(index);
			}
			if(count == 3) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		
		Test1_Nehani test1_nehani = new Test1_Nehani();
		test1_nehani.divisibleby3and7(20, 100);
	}
	
}
