//Program 4 : Write a method to return count of digits in a given string.
//input : "Te8chno3cred7it9s"
//output : 4

package harshadaJagtap.return_type;

public class Example6 {
	int count=0;
	int getDigitCount(String input) {
		int lenght=input.length();
		for(int index=0;index<lenght;index++) {
			char ch=input.charAt(index);
            boolean isDigitFlag=Character.isDigit(ch);
            if(isDigitFlag)
            	count++;
		}
		return count;
	}

	
	public static void main(String[] args) {
		Example6 example6=new Example6();
		int digitCount=example6.getDigitCount("Te8chno3cred7it9s");
		System.out.println(digitCount);
	}
}
