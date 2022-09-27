package swatiM.assignment.arrayPrograms;

/*Assignment - 25 : 20th Sep'2022
Program 1: Print all the repeated word in given string.
String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
output : Hindavi 
         Shubham 
*/

public class RepeateNonRepeateWords {

	//Print all the repeated word in given string.
	void getRepeatedWords(String name) {
		System.out.println("Input string is \n" + name + "\n\nRepeated words from given string are ");
		String word[] = name.split(" ");
		for (int index = 0; index < word.length; index++) {
			for (int j = index + 1; j < word.length; j++) {
				if ((word[index]).equals(word[j]))
					System.out.println(word[j]);
			}
		}
	}

	/*
	 * Program 2: Print all the non repeated word in given string. String str =
	 * "Maulik Puja Hindavi Shubham hindavi Shubham Titiksha Swati"; output : Maulik
	 * Puja Titiksha Swati
	 */
	
	// Print all the non repeated word in given string
	void getNonRepeatedWords(String name) {

		String word[] = name.split(" ");
		for (int index = 0; index < word.length; index++) {
			boolean flag = true;
			for (int j = 1; j < word.length; j++) {
				if (index != j) {
					if ((word[index].equals(word[j])) && (index != j)) {
						flag = false;
					}
				}
			}
			if (flag)
				System.out.println(word[index]);
		}
	}

	public static void main(String[] args) {
		RepeateNonRepeateWords assignment25 = new RepeateNonRepeateWords();
		String name = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
		assignment25.getRepeatedWords(name);
		System.out.println("------------------------------------------------------------");
		System.out.println("Non repeated words from given string are below  ");
		assignment25.getNonRepeatedWords(name);
	}

}