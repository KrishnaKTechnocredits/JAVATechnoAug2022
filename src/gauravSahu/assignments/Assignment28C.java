/*Program 3: [15 mins]
Print count of each vowels in a given String using switch case.

input : technocredits
output : e -> 2
         o -> 1
		 i -> 1
 */
package gauravSahu.assignments;

public class Assignment28C {

	void getVowelsCount(String name) {
		int counta = 0;
		int counte = 0;
		int counti = 0;
		int counto = 0;
		int countu = 0;

		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			switch (ch) {
			case 'a':
				counta++;
				break;
			case 'e':
				counte++;
				break;
			case 'i':
				counti++;
				break;
			case 'o':
				counto++;
				break;
			case 'u':
				countu++;
				break;
			}
		}
		if (counta > 0)
			System.out.println('a' + "=" + counta);
		if (counte > 0)
			System.out.println('e' + "=" + counte);
		if (counti > 0)
			System.out.println('i' + "=" + counti);
		if (counto > 0)
			System.out.println('o' + "=" + counto);
		if (countu > 0) {
			System.out.println('u' + "=" + countu);
		}
	}

	public static void main(String[] args) {
		Assignment28C a28 = new Assignment28C();
		String input = "technocredits";
		System.out.println("Given String is " + input);
		a28.getVowelsCount(input);

	}

}
