/*Assignment - 33 : 10th Oct'2022*/

package shivaniLikhia;

import java.util.Arrays;

public class Assignment33 {
	
	
	/*Program 1: print duplicate numbers from given array. 
				input : {10,20,10,44,33,55,33};
				output : 10
		 				 33*/
	
	void printAllDuplicateNumbersFromArray(int[] arr) {
		
		System.out.println("Input Array : "+Arrays.toString(arr));
		System.out.println("OUTPUT :  The duplicate numbers from the given array are : ");
		for(int index=0;index<arr.length;index++){
			int count = 0;
			for(int innerIndex=index+1;innerIndex<arr.length;innerIndex++){
				if(arr[index]==arr[innerIndex] && index!=innerIndex){
					arr[innerIndex] = 0;
					count++;	
				}
			}
			if(count>0){
				System.out.println(arr[index]);
			}
		}
	}
	
	/*Program 2 : print unique numbers from given array (having freq 1). 
				   input : {10,20,10,44,33,55,33};
				   output : 20
         		       	    44
		 				    55*/
	void printAllUniqueNumbersFromArray(int[] arr) {
		System.out.println("Input Array : " +Arrays.toString(arr));
		System.out.println("OUTPUT : All the unique numbers from given array are : ");
		for(int index=0;index<arr.length;index++) {
			boolean flag = true;
			for(int innerIndex=index+1;innerIndex<arr.length;innerIndex++) {
				if(arr[index]==arr[innerIndex] && index!=innerIndex) {
					flag = false;
					arr[innerIndex]=0;
				}
			}
			if(flag && arr[index]!=0) {
				System.out.println(arr[index]);
			}
		}
	}
	
	
	/*program 3 : print missing numbers from given array from range 1 to 10. 
					input : {1,3,9,5,6,10}
					output : 2
							 4
							 7
							 8*/
	void printMissingNumberFromArray(int startRange,int endRange,int[] arr) {
		System.out.println("Input Array : " +Arrays.toString(arr));
		System.out.println("The missing Numbers from the given array are : ");
		for(int num=startRange;num<=endRange;num++) {
			boolean flag = true;
			for(int innerIndex=0;innerIndex<arr.length;innerIndex++) {
				if(num==arr[innerIndex]) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(num);
			}
		}	
	}
	
	/*program 4: print duplicate names from given array (do not consider case sensitivity). 
				input : {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
				output : hello
				         ptc*/
	void printAllDuplicateNamesFromArray(String[] arr) {
		System.out.println("Input Array : " +Arrays.toString(arr));
		System.out.println("OUTPUT : The duplicate names from given array is : ");
		for(int index=0;index<arr.length;index++) {
			String name = arr[index].toLowerCase();
			int count = 0;
			for(int innerIndex=index+1;innerIndex<arr.length;innerIndex++) {
				String name2 = arr[innerIndex].toLowerCase();
				if(name.equals(name2) && index!=innerIndex) {
					name2 = "";
					count++;
				}
			}
			if(count>0 && arr[index]!="") {
				System.out.println(name);
			}
		}
	}
	
	
	/*program 5 : print unique names from given array. 
					input : {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
					output : Hi
					         Hello
							 Techno
							 Credits*/
	void printAllUniqueNameFromArray(String[] arr) {
		System.out.println("Input Array : "+Arrays.toString(arr));
		System.out.println("All the unique names from the given array are: ");
		for(int index=0;index<arr.length;index++) {
			boolean flag = true;
			for(int innerIndex=index+1;innerIndex<arr.length;innerIndex++) {
				if(arr[index].equals(arr[innerIndex]) && index!=innerIndex) {
					flag = false;
				}
			}
			if(flag) {
				System.out.println(arr[index]);
			}
		}	
	}
	
	
	/*Program 6 : print unique numbers from given array (all content uniquely). 
					input : {10,20,10,44,33,55,33};
					output : 10 
					         20
					         44
							 33 
							 55*/
	void printEachUniqueNumbersFromArray(int[] arr){
		System.out.println("Input Array : "+Arrays.toString(arr));
		System.out.println("OUTPUT : Each unique number form given array is : ");
		for(int index=0;index<arr.length;index++) {
			int count = 0;
			for(int innerIndex=index+1;innerIndex<arr.length;innerIndex++) {
				if(arr[index]==arr[innerIndex] && index!=innerIndex) {
					count++;
					arr[innerIndex] = 0;
				}
			}
			if(count>=0 && arr[index]!=0) {
				System.out.println(arr[index]);
			}
		}
	}
	
	
	/*program 7 : print each number with its frequency. 
					input : {10,11,11,10,5,6,5,6,5,5,4}
					output : 10 -> 2
					         11 -> 2
					          5 -> 4
					          6 -> 2
					          4 -> 1*/
	
	void printFrequencyOfEachNumberFromArray(int[] arr) {
		System.out.println("Input Array : "+Arrays.toString(arr));
		System.out.println("OUTPUT : Frequency of each number from given array is : ");
		for(int index=0;index<arr.length;index++) {
			int count = 1;
			for(int innerIndex=index+1;innerIndex<arr.length;innerIndex++) {
				if(arr[index]==arr[innerIndex] && arr[index]!=0) {
					count++;
					arr[innerIndex] = 0;
				}
			}
			if(arr[index]!=0) {
			System.out.println(arr[index]+ " --> " +count);
			}
		}
  	}
	
	public static void main(String[] args) {
		System.out.println("------------------------------------Program1------------------------------------");
		Assignment33 assignment33 = new Assignment33();
		int[] arr1 = {10,20,10,44,33,55,33};
		assignment33.printAllDuplicateNumbersFromArray(arr1);
		System.out.println("------------------------------------Program2------------------------------------");
		int[] arr2 = {10,20,10,44,33,55,33};
		assignment33.printAllUniqueNumbersFromArray(arr2);
		System.out.println("------------------------------------Program3------------------------------------");
		int[] arr3 = {1,3,9,5,6,10};
		assignment33.printMissingNumberFromArray(1, 10, arr3);
		System.out.println("------------------------------------Program4------------------------------------");
		String[] arr4 = {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
		assignment33.printAllDuplicateNamesFromArray(arr4);
		System.out.println("------------------------------------Program5------------------------------------");
		String[] arr5 = {"Hi", "Hello", "Hello","Techno","Credits","Techno"}; 
		assignment33.printAllUniqueNameFromArray(arr5);
		System.out.println("------------------------------------Program6------------------------------------");
		int[] arr6 = {10,20,10,44,33,55,33};
		assignment33.printEachUniqueNumbersFromArray(arr6);
		System.out.println("------------------------------------Program7------------------------------------");
		int[] arr7 = {10,11,11,10,5,6,5,6,5,5,4};
		assignment33.printFrequencyOfEachNumberFromArray(arr7);
	}	
}
