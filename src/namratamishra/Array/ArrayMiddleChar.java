package namratamishra.Array;
/*Write a method to print middle character of all array elements.
input : {"Ashish","Aditty","Manjiri","Ankita"}
output : Ashish -> h
         Aditty -> i
		 Manjiri -> j
		 Ankita -> k
*/

class ArrayMiddleChar {
	char getMiddlechar(String name) {
		int l = name.length();
		char ch;
		if (l % 2 == 0)
			ch = name.charAt(l / 2 - 1);
		else
			ch = name.charAt(l / 2);

		return ch;

	}

	public static void main(String[] args) {

		String name[] = { "Ashish", "Aditty", "Manjari", "Ankita" };

		for (int i = 0; i < name.length; i++) {

			System.out.println(name[i] + "---->" + new ArrayMiddleChar().getMiddlechar(name[i]));
		}

	}
}