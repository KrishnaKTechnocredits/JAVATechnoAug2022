/*
 program 4: print duplicate names from given array (do not consider case sensitivity). 
input : {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
output : hello
         ptc

 */

package swapnilMaheshwari.ArrayPrograms.Assignment33;

public class DuplicatNameFromArray {
	
	void printDuplicateName(String[] arr) {
		String arr1=arr.toString();
		String[] output=new String[arr.length];
		for (int i=0; i<arr.length;i++) {
			for (int j=i+1; j<arr.length; j++) {
				if(arr[i].toLowerCase().equals(arr[j].toLowerCase()))
					System.out.println(arr[j]);	
					
			}
		}
		
	}
	public static void main(String[] args) {
		String[] input= {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
		new DuplicatNameFromArray().printDuplicateName(input);
	}
}
