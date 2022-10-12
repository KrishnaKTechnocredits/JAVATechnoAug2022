/*
 * Assignment - 33 : 10th Oct'2022

Program 1: print duplicate numbers from given array. 

input : {10,20,10,44,33,55,33};
output : 10
		 33

Program 2 : print unique numbers from given array (having freq 1). 
input : {10,20,10,44,33,55,33};
output : 20
         44
		 55
		 
program 3 : print missing numbers from given array from range 1 to 10. 
input : {1,3,9,5,6,10}
output : 2
		 4
		 7
		 8

program 4: print duplicate names from given array (do not consider case sensitivity). 
input : {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
output : hello
         ptc


program 5 : print unique names from given array. 
input : {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
output : Hi
         Hello
		 Techno
		 Credits

Program 6 : print unique numbers from given array (all content uniquely). 
input : {10,20,10,44,33,55,33};
output : 10 
         20
         44
		 33 
		 55

program 7 : print each number with its frequency. 
input : {10,11,11,10,5,6,5,6,5,5,4}
output : 10 -> 2
         11 -> 2
          5 -> 4
         6 -> 2
         4 -> 1
 */
package deepakBorse.Assignments;

import java.util.Arrays;

public class Assignment33 {

//clone the array from the original
	int[] clonearray(int[] input) {
		int[] clonearr = new int[input.length];
		for (int index = 0; index < input.length; index++) {
			clonearr[index] = input[index];
		}
		return clonearr;
	}

//Program 1: print duplicate numbers from given array. 
	void printDuplicate(int[] inputarry) {
		int count = 1;

		int[] clonearr = clonearray(inputarry);

		for (int index = 0; index < inputarry.length; index++) {

			for (int innerindex = 1; innerindex < inputarry.length; innerindex++) {
				if (clonearr[index] == inputarry[innerindex] && index != innerindex) {
					clonearr[innerindex] = 0;
					count++;
				}

			}
			if (count > 0 && clonearr[index] != 0) {
				System.out.println(inputarry[index]);
				count = 0;
			}

		}

	}

//Program 2 : print unique numbers from given array (having freq 1)
	void printUniqueNumb(int[] inputarry) {
		int count = 0;

		int[] clonearr = clonearray(inputarry);

		for (int index = 0; index < inputarry.length; index++) {

			for (int innerindex = 0; innerindex < inputarry.length; innerindex++) {
				if (clonearr[index] == inputarry[innerindex] && index != innerindex) {
					// clonearr[innerindex] = 0;
					count++;
				}
			}
			if (count == 0) {
				System.out.println(inputarry[index]);

			} else
				// System.out.println(inputarry[index]);
				count = 0;
		}

	}
	
//program 3 : print missing numbers from given array from range 1 to 10. 
	void printmissingnumber(int[] input,int startr, int endr ) {
		
		for(int num=startr;num<endr;num++) {
			boolean ismissingnum=true;
			for(int index=0;index<input.length;index++) {
				if(num==input[index]) {
					ismissingnum=false;
					break;
				}
				
			}
			if(ismissingnum) {
				System.out.println(num);
			}
		}

	}
	
	
//program 4: print duplicate names from given array (do not consider case sensitivity). 
	void dupstring(String[] str) {

		for (int index = 0; index < str.length; index++) {

			for (int inneindex = index + 1; inneindex < str.length; inneindex++) {
				if (str[index].equalsIgnoreCase(str[inneindex]) && index != inneindex) {
					System.out.println(str[index]);
					break;

				}
			}
		}
	}

//program 5 : print unique names from given array. 
	void printuniquestr(String[] str) {
		
		for (int index = 0; index < str.length; index++) {
			for (int inneindex = index + 1; inneindex < str.length; inneindex++) {
				if (str[index].equalsIgnoreCase(str[inneindex]) && index != inneindex) {
					str[inneindex] = "";
					break;
				}
			}
			if (str[index] != "") {
				System.out.println(str[index]);
			}
		}
	}

//Program 6 : print unique numbers from given array (all content uniquely). 
	void printallunique(int[] inputarry) {

		int[] clonearr = clonearray(inputarry);

		for (int index = 0; index < inputarry.length; index++) {

			for (int innerindex = 0; innerindex < inputarry.length; innerindex++) {
				if (clonearr[index] == inputarry[innerindex] && index != innerindex) {
					clonearr[innerindex] = 0;
				}
			}
			if (clonearr[index] != 0) {
				System.out.println(inputarry[index]);

			}

		}

	}

//program 7 : print each number with its frequency. 
	void printNumberFreq(int[] inputarry) {

		for (int index = 0; index < inputarry.length; index++) {
			int count = 1;
			for (int innerindex = 0; innerindex < inputarry.length; innerindex++) {
				if (inputarry[index] == inputarry[innerindex] && index != innerindex) {
					inputarry[innerindex] = 0;
					count++;
				}
			}
			if (inputarry[index] != 0)
				System.out.println(inputarry[index] + " - > " + count);
		}

	}

	public static void main(String[] args) {
		Assignment33 assignment = new Assignment33();

		int[] input1 = { 10, 20, 10, 44, 33, 55, 33 };
		//Program 1: print duplicate numbers from given array.
		System.out.println("----------------------------------------------------------------");
		System.out.println("P1-Duplicate number form given Array :"+Arrays.toString(input1));
		assignment.printDuplicate(input1);
		
		//Program 2 : print unique numbers from given array (having freq 1)
		System.out.println("----------------------------------------------------------------");
		System.out.println("P2-Unique number form given Array :"+Arrays.toString(input1));
		assignment.printUniqueNumb(input1);
		 
		int[] input2 = {1,3,9,5,6,10};
		//program 3 : print missing numbers from given array from range 1 to 10.
		System.out.println("----------------------------------------------------------------");
		System.out.println("P3-Missing number form given Array :"+Arrays.toString(input2));
		assignment.printmissingnumber(input2,1,10);// provide the input along with start and end range
		
		String[] str = { "Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc", "Hello" };
		//program 4: print duplicate names from given array (do not consider case sensitivity).
		System.out.println("----------------------------------------------------------------");
		System.out.println("P4-Duplicate names form given Array :"+Arrays.toString(str));
		assignment.dupstring(str); 
		
		
		String[] str2 = { "Hi", "Hello", "Hello", "Techno", "Credits", "Techno" };
		//program 5 : print unique names from given array.
		System.out.println("----------------------------------------------------------------");
		System.out.println("P5-Unique names form given Array :"+Arrays.toString(str2));
		assignment.printuniquestr(str2);
		
		//Program 6 : print unique numbers from given array (all content uniquely).
		System.out.println("----------------------------------------------------------------");
		System.out.println("P6-Unique numbers form given Array :"+Arrays.toString(input1));
		assignment.printallunique(input1);
		
		int[] input3 = { 10, 11, 11, 10, 5, 6, 5, 6, 5, 5, 4 };
		//program 7 : print each number with its frequency.
		System.out.println("----------------------------------------------------------------");
		System.out.println("P7-Missing number form given Array :"+Arrays.toString(input3));
		assignment.printNumberFreq(input3);
		System.out.println("----------------------------------------------------------------");
	}
}