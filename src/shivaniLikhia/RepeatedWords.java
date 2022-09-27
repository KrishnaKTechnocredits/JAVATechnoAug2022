/*Assignment - 25 : 20th Sep'2022
Program 1: Print all the repeated word in given string.
String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
output : Hindavi 
         Shubham */

package shivaniLikhia;

public class RepeatedWords {

	void getRepeatedWords(String input) {
		String[] arr = input.split(" ");
		for(int index=0;index<arr.length;index++) {
			int count = 0;
			for(int j =0;j<arr.length;j++) {
				if(index!=j) {
					if(arr[j].equals(arr[index])) {
						count++;
					}
				}
				else if(index==j){
					count = 0;
				}
			}
			if(count>0) {
				System.out.println(arr[index]);
			}
		}
	}
	
	void getNonRepeatedWords(String input) {
		String[] arr = input.split(" ");
		for(int index=0;index<arr.length;index++) {
			int count = 0;
			for(int j=0;j<arr.length;j++) {
				if(index!=j) {
					if(arr[j].equals(arr[index])) {
						count++;	
					}
				}
			}
			if(count==0) {
				System.out.println(arr[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		RepeatedWords repeatedWords = new RepeatedWords();
		System.out.println("The repeated words from given String are :" );
		repeatedWords.getRepeatedWords("Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati");
		System.out.println("");
		System.out.println("The Non Repeated words from the given string are : ");
		repeatedWords.getNonRepeatedWords("Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati");
		
	}
}
