package nehaniG;

public class Divisibility{
	void divisibleby3and7 (int endIndex, int startIndex) {
		int count=0; 
		for (int index = endIndex; index >= startIndex; index--) {
			if (index % 3 == 0 && index % 7 == 0){	
				count++;
				System.out.println(index);
			}
			if(count == 3) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		
        Divisibility divisibility = new Divisibility();
		divisibility.divisibleby3and7(200,10);
	}
	
}

