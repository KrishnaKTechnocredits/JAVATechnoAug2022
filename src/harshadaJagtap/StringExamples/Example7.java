//Program 5 : Write a method to return sum of digits in a given string.
//input : "Te8chno3cred7it9s"
//output : 27
//Hint : ch = Character.charAt(index);
//Character.isDigit(ch);
//int num = Character.getNumericValue(ch); '9'

package harshadaJagtap.return_type;

public class Example7 {

	int sumOfDigits(String input) {
		int sum=0;
		int lenght=input.length();
		for(int index=0;index<lenght;index++) {
			char ch=input.charAt(index);
			boolean isDigitFlag= Character.isDigit(ch);
			if(isDigitFlag) {
			int num=Character.getNumericValue(ch);
			sum=sum+num;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Example7 example7=new Example7();
		int sumOfDigit= example7.sumOfDigits("Te8chno3cred7it9s");
		System.out.println(sumOfDigit);
	}
	
}
