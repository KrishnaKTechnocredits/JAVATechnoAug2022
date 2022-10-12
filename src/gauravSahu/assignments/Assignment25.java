/*Program 1: Print all the repeated word in given string.
String str = "Maulik Maulik Hindavi Shubham Hindavi Shubham Titiksha Swati";
output : Hindavi 
         Shubham*/
package gauravSahu.assignments;

public class Assignment25 {

	void getRepWord(String[] name) {
		for (int i = 0; i < name.length; i++) {
			int count = 0;
			for (int j = i + 1; j < name.length; j++) {
				if (name[i].equals(name[j])) {
					count++;
				}
			}
			if (count >= 1) {
				System.out.println(name[i]);
			}
		}
	}

	public static void main(String[] args) {
		Assignment25 a25 = new Assignment25();
		String str = "Maulik Gaurav Hindavi Shubham Hindavi Shubham Titiksha Swati";
		String str2 = str.toLowerCase();
		String[] name = str2.split(" ");
		a25.getRepWord(name);

	}
}
