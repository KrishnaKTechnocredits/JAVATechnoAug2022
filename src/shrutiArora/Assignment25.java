/*Assignment - 25 : 20th Sep'2022

Program 1: Print all the repeated word in given string.
String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
output : Hindavi 
         Shubham 

Program 2: Print all the non repeated word in given string.
String str = "Maulik Puja Hindavi Shubham hindavi Shubham Titiksha Swati";
output : Maulik 
         Puja
         Titiksha
         Swati */
package shrutiArora;
public class Assignment25 {
	void printAllRepeatedWord(String str) {
		System.out.println("String str: " + str);
		System.out.println("Output: ");
		String[] arr = str.split(" ");
		for(int index =0 ; index<arr.length;index++) {
			String output = "";
			for(int innerIndex = index+1 ;innerIndex<arr.length;innerIndex++) {
				if(arr[index].equals(arr[innerIndex])) {
					System.out.println(arr[index]);
					break;
				}
				
			}
		}
	}
    void printAllNonRepeatedWord(String input) {
		System.out.println("String str: " + input);
		System.out.println("Output: ");
		String[] arr = input.split(" ");
		for(int index =0 ; index<arr.length;index++) {
			String output = "";
			if(input.indexOf(arr[index])== input.lastIndexOf(arr[index])){
				output+= arr[index];
				System.out.println(output);
			}
		}
	}
	public static void main(String[] a) {
		Assignment25 assignment25 = new Assignment25();
		String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
		System.out.println("**********************************************************Repeated Words*****************************");
		assignment25.printAllRepeatedWord(str);
		System.out.println("**********************************************************UnRepeated Words*****************************");
		assignment25.printAllNonRepeatedWord(str);
	}
}