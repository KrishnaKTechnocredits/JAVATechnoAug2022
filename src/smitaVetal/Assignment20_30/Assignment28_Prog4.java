/*Print count of each vowels in a given String Array using switch case.

input : {"technocredits", "swati", "aashvi"}
output : vowel count in technocredits:
		 e -> 2
         o -> 1
		 i -> 1
		 vowel count in swati:
		 a -> 1
         i -> 1
		 vowel count in aashvi:
		 a -> 2
         i -> 1

int count = 0;
for(int index=0;index<str.length();index++){
	char ch = str.charAt(index);
	
	switch(ch){
		case 'a':
		case 'A':
			count++;
			break;	
	}
}*/

package smitaVetal.Assignment20_30;

public class Assignment28_Prog4 {

	void getCountVowels(String name) {
		int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
		System.out.println("Vowel count in word " + name);

		for (int index = 0; index < name.length(); index++) {

			char ch = name.charAt(index);
			switch (ch) {
			case 'a':
			case 'A':
				count1++;
				break;

			case 'e':
			case 'E':
				count2++;
				break;

			case 'i':
			case 'I':
				count3++;
				break;

			case 'o':
			case 'O':
				count4++;
				break;

			case 'u':
			case 'U':
				count5++;
				break;
			}
		}
		if (count1 > 0)
			System.out.println("Counts of vowel A is : " + count1);
		if (count2 > 0)
			System.out.println("Counts of vowel E is : " + count2);
		if (count3 > 0)
			System.out.println("Counts of vowel I is : " + count3);
		if (count4 > 0)
			System.out.println("Counts of vowel O is : " + count4);
		if (count5 > 0)
			System.out.println("Counts of vowel U is : " + count5);
	}

	void getString(String[] input) {
		for (int index = 0; index < input.length; index++)
			getCountVowels(input[index]);

	}

	public static void main(String[] args) {
		Assignment28_Prog4 program4 = new Assignment28_Prog4();
		String[] input = { "technocredits", "swati", "aashvi" };
		program4.getString(input);
		System.out.println();
	}
}
