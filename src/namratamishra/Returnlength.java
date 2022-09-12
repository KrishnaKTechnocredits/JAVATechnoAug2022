
//to return length of string.
package namratamishra;

class Returnlength {
	int getNameLength(String name) {
		int l = name.length();
		return l;
	}

	public static void main(String[] args) {
		Returnlength rl = new Returnlength();
		System.out.println("length in string Maulik is "+rl.getNameLength("Maulik"));
		System.out.println("length in string Technocredits is "+rl.getNameLength("Technocredits"));
	}
}