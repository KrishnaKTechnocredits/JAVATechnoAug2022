// Return sum of all the digits present in each elements from given array

package komalShrivastava;

public class Test4a {

	static int sumOfDigitsInString(String name) {
		int sum = 0;
		for(int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if(Character.isDigit(ch))
				sum = sum + Character.getNumericValue(ch);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		String[] inputName = {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"};
		System.out.println("Sum of digits in each String in Array : ");
		for(int i=0; i<inputName.length; i++) {
			System.out.println(inputName[i] +" --> "+Test4a.sumOfDigitsInString(inputName[i]));
	    }
    }
}