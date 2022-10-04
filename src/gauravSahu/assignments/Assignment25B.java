/*Program 2: Print all the non repeated word in given string.
String str = "Maulik Puja Hindavi Shubham hindavi Shubham Titiksha Swati";
output : Maulik 
         Puja
         Titiksha
         Swati 
*/
package gauravSahu;

public class Assignment25B {

	void getRepWord(String[] name) {
		for (int i = 0; i < name.length; i++) {
			int count = 0;
			for (int j = 1; j < name.length; j++) {
				if (name[i].equals(name[j]) && i != j) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(name[i]);
			}
		}
	}

	public static void main(String[] args) {
		Assignment25B a25 = new Assignment25B();
		String str = "Maulik Gaurav Hindavi Shubham Hindavi Shubham Titiksha Swati";
		String str2 = str.toLowerCase();
		String[] name = str2.split(" ");
		a25.getRepWord(name);
	}

}
