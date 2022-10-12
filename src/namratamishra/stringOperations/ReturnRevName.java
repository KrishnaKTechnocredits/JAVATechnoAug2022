package namratamishra.stringOperations;

/*Write a method to return reverse name
input : Maulik
output : kiluaM
*/
import java.util.*;

class ReturnRevName {
	String getReverseStr(String str) {
		String rstr = "";
		for (int index = str.length() - 1; index >= 0; index--)
			rstr = rstr + str.charAt(index);
		return rstr;
	}

	public static void main(String[] args) {
		ReturnRevName rs = new ReturnRevName();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name for reversal");
		String name = sc.nextLine();
		System.out.println("the reverse name is: " + rs.getReverseStr(name));
		sc.close();

	}
}