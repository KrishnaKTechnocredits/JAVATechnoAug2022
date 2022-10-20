/*Assignment - 33 : 10th Oct'2022

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
         4 -> 1*/
package shrutiArora;

import java.util.Arrays;

public class Assignment33 {
	void printDuplicateNum(int[]arr) {
		System.out.println("input: " + Arrays.toString(arr));
		System.out.println("Duplicate elements in array: ");
	    for(int i = 0 ; i<arr.length;i++) {
			for(int j = i+1 ; j <arr.length ; j++ ) {
				if(arr[i] == arr[j]&& arr[j]!= -1) {
					System.out.println(arr[i]);
					arr[j]= -1;
					break;
				}
			}
		}
	}
	void printUniqueElement(int[]arr) {
		System.out.println("input: " + Arrays.toString(arr));
		System.out.println("unique elements in array: ");
	    for(int i = 0 ; i<arr.length;i++) {
	    	int count =1 ;
	        for(int j = i+1 ; j <arr.length ; j++ ) {
				if(arr[i] == arr[j]&& arr[j]!= -1) {
					count++;
					arr[j] = -1;
					break;
				}
	        }
	        if(count==1 && arr[i]!= -1) {
	        	System.out.println(arr[i]);
	        }
	    }
	}
	void printMissingNum(int[]array) {
		System.out.println("input: " + Arrays.toString(array));
		System.out.println("missing elements in array: ");
		for(int i = 1 ; i<=10;i++) {
			boolean flag = true ;
			for(int j = 0 ; j<array.length;j++) {
				if(i == array[j]) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(i);
			}
		}
	}
	void printDuplicateNames(String[]str) {
		System.out.println("input: " + Arrays.toString(str));
		System.out.println("Duplicate names in array: ");
		for(int i = 0 ; i<str.length;i++) {
	    	
	        for(int j = i+1 ; j <str.length ; j++ ) {
				if(str[i].equalsIgnoreCase(str[j])&& !str[j].equals("")) {
					System.out.println(str[i]);
					str[j] = "";
				}
	        }
		}
	}
	void printUniqueNames(String[]str) {
		System.out.println("input: " + Arrays.toString(str));
		System.out.println("unique names in array: ");
		for(int i = 0 ; i<str.length;i++) {
	    	boolean flag = true ;
	        for(int j = i+1 ; j <str.length ; j++ ) {
				if(str[i].equalsIgnoreCase(str[j])&& !str[j].equals("")) {
					flag = false;
					str[j] = "";
					break;
				}
	        }
	        if(flag==false || !str[i].equals("")) {
	        	System.out.println(str[i]);
	        }
		}
	}
	void uniqueContent(int[]arr) {
		System.out.println("input: " + Arrays.toString(arr));
		System.out.println("unique content in array: ");
	    for(int i = 0 ; i<arr.length;i++) {
	        boolean flag = false;
	        for(int j = i+1 ; j <arr.length ; j++ ) {
				if(arr[i] == arr[j]&& arr[j]!= -1) {
					flag = true;
					arr[j] = -1;
					break;
				}
	        }
	        if(flag == true || arr[i]!= -1) {
	        	System.out.println(arr[i]);
	        }
	    }
	}
	void printEachNumberFreq(int[]arr) {
		System.out.println("input: " + Arrays.toString(arr));
		System.out.println(" number with  frequency: ");
		for(int i = 0 ; i<arr.length;i++) {
			int count = 1 ;
		    for(int j = i+1 ; j <arr.length ; j++ ) {
				if(arr[i] == arr[j]&& arr[j]!= -1) {
					count++;
					arr[j]= -1;
				}
		    }
		    if(arr[i]!=-1) {
		    System.out.println(arr[i]+ "-> " + count);
		    }
		}
	}
	public static void main(String[] args) {
		Assignment33 a33 = new Assignment33();
		System.out.println("**********************************************************program_1**********************************************");
		int[] arr = {10,20,10,44,33,55,33};
		a33.printDuplicateNum(arr);
		System.out.println("**********************************************************program_2**********************************************");
		int[] num = {10,20,10,44,33,55,33};
		a33.printUniqueElement(num);
		System.out.println("**********************************************************program_3**********************************************");
		int[] arr1 = {1,3,9,5,6,10};
		a33.printMissingNum(arr1);
		System.out.println("**********************************************************program_4**********************************************");
		String[] str = {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
		a33.printDuplicateNames(str);
		System.out.println("**********************************************************program_5**********************************************");
		String[] str1 = {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
		a33.printUniqueNames(str1);
		System.out.println("**********************************************************program_6**********************************************");
		int[] arr2 = {10,20,10,44,33,55,33};
		a33.uniqueContent(arr2);
		System.out.println("**********************************************************program_7**********************************************");
		int[] arr3 = {10,11,11,10,5,6,5,6,5,5,4};
		a33.printEachNumberFreq(arr3);
	}
}