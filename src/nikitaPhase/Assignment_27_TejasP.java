package nikitaPhase;
import java.util.Arrays;

public class Assignment_27_TejasP {
     
	void printUniqChar(String[] arr) {        
		
		//used enhance for loop
		for (String name : arr) {			
			
			System.out.println(name);	
			
			//it will lower case String so that to verify char uniqueness
			name = name.toLowerCase();		
			
			for (int index = 0; index < name.length(); index++) {
				if (name.indexOf(name.charAt(index)) == name.lastIndexOf(name.charAt(index)))
					System.out.println(name.charAt(index));
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Program - 1. Write a program to print unique \ncharacter "
				+ "of each name in given string array");
		String[] arr = { "Maulik", "Kanani", "Mahesh", "Aashvi" };
		
		System.out.println("Given Array is: " + Arrays.toString(arr));
		
		Assignment_27_TejasP newPrint =  new Assignment_27_TejasP();
		
		newPrint.printUniqChar(arr);
	}
}
