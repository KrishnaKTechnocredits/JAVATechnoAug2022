package nikeshM.Assignment32;

public class ReverseNo {

	int getReverseNo(int number ) {
		int reminder = 0;
		int result = 0; 
		System.out.println("Given Number Is " + number);
		while(number >0) {
			reminder = number %10;
			result = result *10 +reminder;
			number = number/10;
			
		}	
		return result;
	}
		public static void main(String[] args) {
			int number = 123;
			ReverseNo p1 = new ReverseNo();
			int rev = p1.getReverseNo(number);
		System.out.println(" Reverse Number Are "+rev);
		}
}

