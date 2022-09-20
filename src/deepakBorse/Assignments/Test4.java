package deepakBorse.Assignments;

public class Test4 {

	int sumofallDigitInString(String inputstring) {
		int sumofdigit = 0;
		char ch = ' ';
		for (int i = 0; i < inputstring.length(); i++) {
			ch = inputstring.charAt(i);
			if (Character.isDigit(ch)) {
				sumofdigit = sumofdigit + Character.getNumericValue(ch);
			}
		}
		return sumofdigit;
	}
	
	int getvisibletree(int[] inputnumber) {
		int visiblenumber=0;
		int count=0;
		
		for(int i=0; i<inputnumber.length;i++) {
			if(visiblenumber<inputnumber[i]) {
				visiblenumber=inputnumber[i];
				count++;
			}
		}
		//System.out.println(count);
		return count;
	}
	public static void main(String[] args) {

		Test4 Test4 = new Test4();

		String[] inputstring = { "Ma1he4sh", "A9vni", "P1uj3a5", "Harshal", "A4d4itty", "Rahul" };
		System.out.println("Sum of digit from each string: ");
		for (int i = 0; i < inputstring.length; i++) {
			System.out.println(inputstring[i] + " -> " + Test4.sumofallDigitInString(inputstring[i]));
		}
		int[] inputnumber= {3,7,5};
		int outnumber=Test4.getvisibletree(inputnumber);
		System.out.println("Visible tree from int array: "+outnumber);
		
		int[] inputnumber2= {3,5,11,9,10,13};
		System.out.println("Visible tree from int array: "+Test4.getvisibletree(inputnumber2));
	}
}
