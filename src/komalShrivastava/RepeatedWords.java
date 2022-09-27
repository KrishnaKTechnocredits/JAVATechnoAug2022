/*Assignment - 25 : 20th Sep'2022*/

package komalShrivastava;

public class RepeatedWords {
	
	/*method to print all the repeated word OR non repeated words in given string 
	 * 
	 Note: set isRepeatWordRequired as true to get Repeated words
	       set isRepeatWordRequired as false to get Non-Repeated words*/
	
	void printRepeatedAndNonRepeatedWord(String input, boolean isRepeatWordRequired) {
		String[] inputArray = input.split(" ");
		String[] inputArray2 = new String[inputArray.length];
		for(int i=0; i<inputArray.length; i++) {
			inputArray2[i] = inputArray[i];
		}
		if(isRepeatWordRequired)
			System.out.print("Repeated Words \nInput : " + input + "\nOutput : ");
		else
			System.out.print("Non Repeated Words \nInput : " + input + "\nOutput : ");
		for(int index=0; index<inputArray.length; index++) {
			String originalWord = inputArray[index];
			String str1 = inputArray[index].toUpperCase();
			if(str1 != "") {
				int count = 0;
				for(int j=index+1; j<inputArray2.length; j++) {
					String str2 = inputArray2[j].toUpperCase();
					if(str1.equals(str2)) {
						inputArray2[j]="";
						inputArray[j]="";
						count++;
					}	
				}
				if(count > 0 && isRepeatWordRequired == true)
					System.out.print(originalWord + " ");
				else if(count == 0 && isRepeatWordRequired == false)
					System.out.print(originalWord + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		RepeatedWords repeatedWords = new RepeatedWords();
		String input = "Maulik Puja Hindavi Shubham Hindavi Shubham Hindavi Titiksha Hindavi Swati";
		repeatedWords.printRepeatedAndNonRepeatedWord(input, true);
		System.out.println("\n");
		repeatedWords.printRepeatedAndNonRepeatedWord(input, false);
	}
}