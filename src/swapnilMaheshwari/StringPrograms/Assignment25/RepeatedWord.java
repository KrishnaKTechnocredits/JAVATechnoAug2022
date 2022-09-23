/*
 Program 1: Print all the repeated word in given string.
String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
output : Hindavi 
         Shubham 

 */

package swapnilMaheshwari.StringPrograms.Assignment25;

public class RepeatedWord {
	
void getRepeatedWordFromString(String input) {
		 String[] str=input.split(" ");
		 
		 for (int i=0; i<str.length; i++) {
			 
			for (int j=i+1; j<str.length; j++) {
				
				if (str[i].equals(str[j]))
					{
						System.out.println("Duplicate word :"+str[i]);
						break;
					}

			}
			
		 }

	} 
	public static void main(String[] args) {
		String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
		RepeatedWord repeatedWord= new RepeatedWord();
		repeatedWord.getRepeatedWordFromString(str);
	}
}
