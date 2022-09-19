package gauravSahu.String;

public class String18 {

	int getsum(String name) {
		int sum = 0;
		for (int index = 0; index < name.length(); index++) {
			char num = name.charAt(index);
			if (Character.isDigit(num)) {
				sum = sum + Character.getNumericValue(num);
			}
		}
		return sum;
	}

	String getchar(String name) {
		String name2 = "";
		for (int index = 0; index < name.length(); index++) {
			char name1 = name.charAt(index);
			if(Character.isAlphabetic(index)) {
				name2 = name2 + Character.isAlphabetic(index);
			}
			name2 = name2 + name1;
		}
		return name;
	}

	public static void main(String[] args) {
		String18 s1 = new String18();
		int name = s1.getsum("Gau5rav7Sa7hu");
		System.out.println(name);
		int name1 = s1.getsum("Gau5rav7Sa7hu");
		System.out.println(name1);
		String name3 = s1.getchar("Gau5rav7Sa7hu");
		System.out.println(name3);

	}
}
