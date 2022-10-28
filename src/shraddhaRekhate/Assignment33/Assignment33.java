package shraddhaRekhate.Assignment33;

import java.util.Arrays;

//Program 1: print duplicate numbers from given array. 
//
//input : {10,20,10,44,33,55,33};
//output : 10
//		 33
//
public class Assignment33 {
	void printDuplicateNumFromArray(int[] arr) {
		for(int index=0;index<arr.length;index++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[index]==arr[j] && index!=j) {
					System.out.println(arr[index]);
					arr[index]=0;
					break;
	            }
			}
		}
	}
//Program 2 : print unique numbers from given array (having freq 1). 
//input : {10,20,10,44,33,55,33};
//output : 20
//         44
//		 55
	void printUniqueNumFromArrayFreq1(int[] arr) {
		for(int index=0;index<arr.length;index++) {
			boolean flag=true;
			for(int j=0;j<arr.length;j++) {
				if(arr[index]==arr[j] && index!=j) {
					arr[j]=0;
					flag=false;
	            }
			}
			if(flag && arr[index]!=0) {
				System.out.println(arr[index]);
			}
		}
	}		
	
//program 3 : print missing numbers from given array from range 1 to 10. 
//input : {1,3,9,5,6,10}
//output : 2
//		 4
//		 7
//		 8
//
	void printMissingNumFromArray(int[] arr) {
		for(int num=1;num<=10;num++) {
			boolean isMissingNumFlag=true;
			//to iterate inside the array
			 for(int index=0;index<arr.length;index++) {
				 if(num==arr[index]) {
					 isMissingNumFlag=false;
					 break;
				 }
			 }
			 if(isMissingNumFlag) {
				 System.out.println(num);
			 }
		}
	}
//program 4: print duplicate names from given array (do not consider case sensitivity). 
//input : {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
//output : hello
//         ptc
//
//
	void printDuplicateNameFromArray(String[] arr) {
		for(int index=0;index<arr.length;index++) {
			int count=1;
			arr[index]=arr[index].toLowerCase();
			for(int j=0;j<arr.length;j++) {
				arr[j]=arr[j].toLowerCase();
				if(arr[index].equals(arr[j]) && index!=j && arr[j]!="") {
					arr[j]="";
					count++;
				}
			}
			if(count>1) {
				System.out.println(arr[index]);
		}
		
			
		}
	}
//program 5 : print unique names from given array. 
//input : {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
//output : Hi
//         Hello
//		 Techno
//		 Credits
//
	void printDuplicateUniqueNameFromArray(String[] arr) {
		for(int index=0;index<arr.length;index++) {
			int count=1;
			for(int j=0;j<arr.length;j++) {
				if(arr[index]==(arr[j]) && index!=j && arr[j]!="") {
					count++;
					arr[j]="";
				}
			}
			if(count>=1 && arr[index]!="") {
				System.out.println(arr[index]);
		}
		
			
		}
	}
//Program 6 : print unique numbers from given array (all content uniquely). 
//input : {10,20,10,44,33,55,33};
//output : 10 
//         20
//         44
//		 33 
//		 55
	void printUniqueNumFromArray(int[] arr) {
		for(int index=0;index<arr.length;index++) {
			int count=1;
			for(int j=0;j<arr.length;j++) {
				if(arr[index]==arr[j] && index!=j) {
					arr[j]=0;
					count++;
	            }
			}
			if(count>=1 && arr[index]!=0) {
				System.out.println(arr[index]);
			}
		}
	}		
	
//program 7 : print each number with its frequency. 
//input : {10,11,11,10,5,6,5,6,5,5,4}
//output : 10 -> 2
//         11 -> 2
//          5 -> 4
//         6 -> 2
//         4 -> 1
	void printEachNumFromArrayFreq(int[] arr) {
		for(int index=0;index<arr.length;index++) {
			int count=1;
			for(int j=index+1;j<arr.length;j++) {
				if(arr[index]==arr[j] && index!=j) {
					count++;
					arr[j]=0;
	            }
			}
			if(arr[index]!=0) {
				System.out.println(arr[index]+"->"+count);
			}
		}
	}		
	
//—-------------------------------------------------------



	public static void main(String[] args) {
		//program1
		Assignment33 assignment33=new Assignment33();
		int[] arr={10,20,10,44,33,55,33};
		String str= Arrays.toString(arr);
		assignment33.printDuplicateNumFromArray(arr);
		
		//program2
		int [] freqInput = {10,20,10,44,33,55,33};
		System.out.println("---------------------------");
//		System.out.println(Arrays.toString(input));
		assignment33.printUniqueNumFromArrayFreq1(freqInput);
		
		//program3
		int [] input = {1,3,9,5,6,10};
		System.out.println("---------------------------");
//		System.out.println(Arrays.toString(input));
		assignment33.printMissingNumFromArray(input);
		
		//program4
		String [] strArray = {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
		System.out.println("---------------------------");
        System.out.println(Arrays.toString(strArray));
		assignment33.printDuplicateNameFromArray(strArray);
		
		//program5
		String [] strArray1 = {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
		System.out.println("---------------------------");
        System.out.println(Arrays.toString(strArray1));
		assignment33.printDuplicateUniqueNameFromArray(strArray1);
		
		//program6
		int [] input3 = {10,20,10,44,33,55,33};
		System.out.println("---------------------------");
//		System.out.println(Arrays.toString(input));
		assignment33.printUniqueNumFromArray(input3);
		
		//program7
		int [] input4 = {10,11,11,10,5,6,5,6,5,5,4};
		System.out.println("---------------------------");
//		System.out.println(Arrays.toString(input));
		assignment33.printEachNumFromArrayFreq(input4);
		
		
		

	}

}
