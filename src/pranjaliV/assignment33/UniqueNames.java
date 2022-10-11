/*
 
Assignment - 33 : 10th Oct'2022

program 5 : print unique names from given array. 
input : {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
output : Hi
         Hello
		 Techno
		 Credits
		 
 */

package pranjaliV.assignment33;
import java.util.Arrays;

public class UniqueNames {

	void printUniqueName(String[] input)  {
		for(int index=0; index<input.length; index++) {
			int count=1;
			for(int innerIndex=0; innerIndex<input.length; innerIndex++) {
				if (input[index]==input[innerIndex] && index!=innerIndex && input[innerIndex]!="") {
					count++;
					input[innerIndex]="";
				}
			}
			if(count>=1 && input[index]!="" ) {
				System.out.println(input[index]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		UniqueNames ex33= new UniqueNames();
		
		System.out.println("------------------------------");
		System.out.println("Program 5 : print unique names from given array.");
		String[] input5 = {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
		System.out.println("Input = "+Arrays.toString(input5));
		System.out.println("Output:");
		ex33.printUniqueName(input5);
		System.out.println("");
		

	}

}
