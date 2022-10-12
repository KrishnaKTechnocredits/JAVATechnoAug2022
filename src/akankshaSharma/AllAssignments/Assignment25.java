//Program 1: Print all the repeated word in given string.
//String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
//output : Hindavi 
//       Shubham 

package akankshaSharma.AllAssignments;

public class Assignment25 {
	public static void main(String[] args) {
		String string = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
		int count;
		string = string.toLowerCase();
		String words[] = string.split(" ");

		System.out.println("Duplicate words in a given string : ");
		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "0";
				}
			}

			if (count > 1 && words[i] != "0")
				System.out.println(words[i]);
		}
	}
}
