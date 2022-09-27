/*
 * Assignment - 25 : 20th Sep'2022

Program 1: Print all the repeated word in given string.
String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
output : Hindavi 
         Shubham 

Program 2: Print all the non repeated word in given string.
String str = "Maulik Puja Hindavi Shubham hindavi Shubham Titiksha Swati";
output : Maulik 
         Puja
         Titiksha
         Swati 
 */

package rahulSaswadkar.arrayPrograms;

//import java.util.Arrays;

public class ArrayProgram9 {
	public static void main(String[] args) {
		ArrayProgram9 arrayProgram9 = new ArrayProgram9();
		
		String str1 = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
		String str2 = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Hindavi Swati";
		
		//arrayProgram9.printRepeatWordInStrOld(str1);
		arrayProgram9.printRepeatWordInStr(str1);
		arrayProgram9.printRepeatWordInStr(str2);
		arrayProgram9.printNonRepeatWordInStr(str1);
		}
	
	
	
//	void printRepeatWordInStrOld(String str) {
//		System.out.println("Repeated words in given String \"" + str + "\" are as below : " );
//		String[] arr = str.split(" ");
//		for(int i = 0 ; i < arr.length ; i++) {
//			for(int j = 0 ; j < arr.length ; j++) {
//				if(i != j && arr[i].equals(arr[j])) {
//					System.out.println(arr[i]);
//					break;
//				}
//			}
//		}
//	}
	
	void printRepeatWordInStr(String str) {
		System.out.println("\nRepeated words in given String \"" + str + "\" are as below : " );
		String[] arr = str.split(" ");
		int count = 0;
		
		for(int index = 0; index < arr.length ; index++) {
			count = 0;
			if(arr[index] != "") {
				for(int innerIndex = 0 ; innerIndex < arr.length ; innerIndex++) {
					if(index != innerIndex && arr[index].equals(arr[innerIndex])) {
						count += 1;
						arr[innerIndex] = "";
					}
				}
			}
			if(count > 0) {
				System.out.println(arr[index]);
			}
		}
		//System.out.println(Arrays.toString(arr));
		
		
	}


	void printNonRepeatWordInStr(String str) {
		System.out.println("\nNon Repeated words in given String \"" + str + "\" are as below : " );
		String[] arr = str.split(" ");
		int count = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			count = 0;
			for(int j = 0 ; j < arr.length ; j++) {
				if(i != j && arr[i].equals(arr[j])) {
					count += 1;
					break;
				}
			}
			if(count == 0) {
				System.out.println(arr[i]);
			}
		}
	}
}

	
	
	


