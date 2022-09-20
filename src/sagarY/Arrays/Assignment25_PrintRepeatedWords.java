package sagarY.Arrays;
import java.util.Arrays;

public class Assignment25_PrintRepeatedWords {

	void printRepeatWords(String str) {
		String[] str1 = str.split(" ");
		System.out.println("Given String array is: \n" + Arrays.deepToString(str1) + "\n");
		System.out.print("Repeated words from th given array are:\n");

		for (int i = 0; i < str1.length; i++) {
			int count=0;
			for (int j = i+1; j < str1.length; j++) {
				if (str1[i].equals(str1[j])) {
					count++;
				}
			}
			if (count == 1 )
				System.out.println(":" + str1[i]);
		}
	}

	void printNonRepeatWords(String str) {
		String[] str1 = str.split(" ");
		System.out.print("\nNon Repeated words from th given array are:\n");

		for (int i = 0; i < str1.length; i++) {
			int count = 0;
			for (int j = 1; j < str1.length; j++) {
				if (str1[i].equals(str1[j]) && i != j) {
					count++;
				}
			}
			if (count == 0)
				System.out.println(":" + str1[i]);
		}
	}

	public static void main(String[] args) {
		String str = "Maulik Puja Hindavi Shubham Hindavi Shubham \nTitiksha Swati";
		Assignment25_PrintRepeatedWords printRepeat = new Assignment25_PrintRepeatedWords();
		printRepeat.printRepeatWords(str);
		printRepeat.printNonRepeatWords(str);

	}

}
