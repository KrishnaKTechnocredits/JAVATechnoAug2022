package gauravSahu.String;

public class String4 {

	String getrevchar(String name) {
		String revname = "";
		for (int index = name.length() - 1; index >= 0; index--) {
			revname = revname + name.charAt(index);
		}
		return revname;
	}

	String getevenchar(String name) {
		String evenname = "";
		for (int index = 1; index <= name.length() - 1; index = index + 2) {
			evenname = evenname + name.charAt(index);
		}
		return evenname;
	}

	String getrevevenchar(String evenname) {
		String revevenname = "";
		for (int index = evenname.length() - 1; index >= 0; index--) {
			revevenname = revevenname + evenname.charAt(index);
		}
		return revevenname;
	}

	int isdigitcount(String name) {
		int count = 0;
		for (int index = 0; index <= name.length() - 1; index++) {
			if (Character.isDigit(name.charAt(index))) {
				count++;
			}
		}
		return count;
	}

	int isdigitsum(String digitcount) {
		int sum = 0;
		for (int index = 0; index <= digitcount.length() - 1; index++) {
			if (Character.isDigit(digitcount.charAt(index))) {
				int num = Character.getNumericValue(digitcount.charAt(index));
				sum = sum + num;
			}
		}
		return sum;

	}

	public static void main(String[] args) {
		String4 s1 = new String4();
		String revname = s1.getrevchar("Technocredits");
		System.out.println(revname);
		System.out.println("************************");
		String evenname = s1.getevenchar("Technocredits");
		System.out.println(evenname);
		System.out.println("************************");
		String revevenname = s1.getrevevenchar(evenname);
		System.out.println(revevenname);
		System.out.println("************************");
		int digitcount = s1.isdigitcount("Te8chno3cred7it9s");
		System.out.println(digitcount);
		System.out.println("************************");
		int sum = s1.isdigitsum("Te8chno3cred7it9s");
		System.out.println(sum);

	}

}

// G a u r a v