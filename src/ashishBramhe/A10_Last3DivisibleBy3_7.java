package ashishBramhe;

public class A10_Last3DivisibleBy3_7 {

	void printLastThreeDivisibleBy3_7(int start, int end) {
		int count = 0;
		for(int i=end; i>=start; i--) {
			if(i%3 == 0 && i%7 == 0) {
				System.out.println(i);
				count++;
			}
				
			if(count == 3)
				break;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A10_Last3DivisibleBy3_7 a10_Last3DivisibleBy3_7 = new A10_Last3DivisibleBy3_7();
		a10_Last3DivisibleBy3_7.printLastThreeDivisibleBy3_7(10, 100);
	}

}
