
/****
 * Assignment - 17 : 7th Sep'2022

Program 1 : Write a method to return reverse name
input : Maulik
output : kiluaM

Program 2 : Write a method to return even position characters from given String. 
input : technocredits
output : ehordt

Program 3 : Write a method to return even position characters from given String in reverse.
input : technocredits
output : tdrohe

Program 4 : Write a method to return count of digits in a given string.
input : "Te8chno3cred7it9s"
output : 4

Program 5 : Write a method to return sum of digits in a given string.
input : "Te8chno3cred7it9s"
output : 27
Hint : ch = Character.charAt(index);
Character.isDigit(ch);
int num = Character.getNumericValue(ch); '9'
—-------------------------------------------------------

 *
 */
package mohiniA.StringArray.Assign17_18_19;

public class StringOperation17 {
	static int sum = 0;
	static String string="";

	String displayReverseString(String name) {
		String Rname = "";
		for (int index = name.length() - 1; index >= 0; index--) {
			Rname = Rname + name.charAt(index);
		}
		return (Rname);
	}

	static String displayEvenPosChar(String name) {
		String Evchar = "";
		for (int index = 1; index < name.length(); index = index + 2) {
			Evchar = Evchar + name.charAt(index);
		}
		return (Evchar);
	}

	int digitCount(String name) {
		int count = 0;
		for (int index = 0; index < name.length(); index++) {

			if (Character.isDigit(name.charAt(index))) {
				StringOperation17.string=string+name.charAt(index);
				sum = sum + Character.getNumericValue(name.charAt(index));
				count++;
			}
		}
		return (count);
	}

	public static void main(String[] args) {
		String str1="Mohini";
		String str2="technocredits";
		String str3="Te8chno3cred7it9s";
		System.out.println("Reverse String of the given string   : " +str1+"             : : " + new StringOperation17().displayReverseString(str1));
		System.out.println("Even position characters from String : "+str2+"      : : " + displayEvenPosChar(str2));
		System.out.println("Even position characters from String : "+str2+"      : : "+new StringOperation17().displayReverseString(displayEvenPosChar(str2))+" : in reverse " );
		System.out.println("Count of digits in a string          : "+str3+"  : : " + new StringOperation17().digitCount(str3));
		System.out.println("Sum of digits in a string            : "+str3+"  : : " + sum);
	}

}
