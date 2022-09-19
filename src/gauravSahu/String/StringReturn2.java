package gauravSahu.String;

public class StringReturn2 {

	int getstringlength(String name) {

		return name.length();
	}

	char getMidddleChar(String name) {
		int length = name.length();
		int index = 0;
		if (index % 2 == 0) {
			index = length / 2 - 1;
		} else {
			index = length / 2;
		}
		// char ch = name.charAt(index);
		return name.charAt(index);
	}

	public static void main(String[] args) {
		String name = "Gaurav";
		System.out.println(name.length());
		StringReturn2 s1 = new StringReturn2();
		char name1 = s1.getMidddleChar("Gaurav");
		System.out.println(name1);
		char name2 = s1.getMidddleChar("Technocredits");
		System.out.println(name2);

	}
}
