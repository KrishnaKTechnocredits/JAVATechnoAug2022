/*
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
 */
package deepakBorse.Assignments;

public class Assignment17StringOps {
	int namelen;

	String revstring(String name) {
		String revname = "";
		namelen = name.length();
		for (int index = namelen - 1; index >= 0; index--) {
			char revch = name.charAt(index);
			revname = revname + revch;

		}
		System.out.println("Reverse of the string : "+revname);
		evenpos(name);
		evenposrev(name);
		return revname;
	}

	String evenpos(String name) {
		String evenname = "";
		namelen = name.length();
		for (int index = 1; index <= namelen - 1; index = index + 2) {

			char revch = name.charAt(index);
			evenname = evenname + revch;

		}
		System.out.println("Evenposition character print of '"+name+"' : "+evenname);
		return evenname;
	}

	String evenposrev(String name) {
		String revname = "";
		namelen = name.length();
		for (int index = namelen - 2; index >= 0; index -= 2) {
			char revch = name.charAt(index);
			revname = revname + revch;
		}
		System.out.println("Reverse string even postion of '"+name+"' : "+revname);
		return revname;
	}

	int returndigitcount(String name) {
		int stgintcount = 0;
		System.out.println("Given string : "+name);
		namelen = name.length();
		for (int index = 0; index <= namelen - 1; index++) {
			char ch = name.charAt(index);
			boolean isDigitFlag = Character.isDigit(ch);
			if (isDigitFlag) {
				stgintcount++;
			}
		}
		// System.out.println("Digit Count in String : "+stgintcount);
		return stgintcount;
	}
	
	int returnsumdigitstrg(String name) {
		int sum = 0;
		namelen = name.length();
		for (int index = 0; index <= namelen - 1; index++) {
			char ch = name.charAt(index);
			boolean isDigitFlag = Character.isDigit(ch);
			if (isDigitFlag) {
				sum=sum+Character.getNumericValue(ch);
				
			}
		}
		//System.out.println("Sum of Digit given String : "+sum);
		return sum;
	}

	public static void main(String[] args) {

		String revname = new Assignment17StringOps().revstring("technocredits");
		//System.out.println("Reverse of the string : "+revname);

		int digitcount = new Assignment17StringOps().returndigitcount("Te8chno3cred7it9s");
		System.out.println("Digit Count in String : " + digitcount);
		
		int digitsum = new Assignment17StringOps().returnsumdigitstrg("Te8chno3cred7it9s");
		System.out.println("Sum of Digit given String : " + digitsum);
	}

}
