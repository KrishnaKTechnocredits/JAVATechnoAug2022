package nikeshM.Assignment32;

public class PallindrimeNo {
	int PalliondromeNo(int number ) {
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
			int number = 1212;
			PallindrimeNo p1 = new PallindrimeNo();
			int rev = p1.PalliondromeNo(number);
		System.out.println(" PallindrimeNo Are "+rev);
		}
}
	

