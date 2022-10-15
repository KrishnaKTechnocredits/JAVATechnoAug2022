package priyankaD.assignments_31_40;
import java.util.Arrays;
public class Assignment_33 {
		/*Program 1: print duplicate numbers from given array. 
	     input : {10,20,10,44,33,55,33};
		 output : 10
		          33*/
		void printDuplicateNumbers(int[]num) {
			for(int index=0;index<num.length;index++) {
				int count=0;
				for(int j=index+1;j<num.length;j++) {
					if(num[index]==num[j]) {
						count++;
						num[j]=0;
					}
				}if(count>=1) {
					System.out.println(num[index]);
				}
			}
		}
		/*Program 2 : print unique numbers from given array (having freq 1). 
     	input : {10,20,10,44,33,55,33};
	    output : 20
	             44
	             55*/
		void printUniqueNumbersInArray(int[]num1) {
			for(int index=0;index<num1.length;index++) {
				boolean flag=true;
				for(int j=0;j<num1.length;j++) {
					if(num1[index]==num1[j]&&index!=j) {
						flag=false;
					}
				}if(flag==true) {
					System.out.println(num1[index]);
				}
			}
		}
		/*program 3 : print missing numbers from given array from range 1 to 10. 
	     input : {1,3,9,5,6,10}
	     output : 2
	              4
	              7
	              8*/
		void printMissingNum(int[]arr) {
			for(int num=1;num<10;num++) {
				boolean isMissingFlag=true;
				for(int index=0;index<arr.length;index++) {
					if(num==arr[index]) {
						isMissingFlag=false;
						break;
					}
				}if(isMissingFlag) {
					System.out.println(num);
				}
			}
		}
		/*program 4: print duplicate names from given array (do not consider case sensitivity). 
	input : {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
	output : hello
	         ptc*/
		void printDuplicateNamesInString(String[]input) {
			for(int index=0;index<input.length;index++) {
				for(int j=index+1;j<input.length;j++) {
					if(input[index].toLowerCase().equals(input[j].toLowerCase())&&input[j]!=" ") {
						input[j]=" ";
						System.out.println("->"+input[index]);
					}
				}
			}
		}
		/*program 5 : print unique names from given array. 
	input : {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
	output : Hi
	         credits*/
		void printUniqueNamesInString(String[]input1) {
			for(int index=0;index<input1.length;index++) {
				boolean flag=true;
				for(int j=0;j<input1.length;j++) {
					if(input1[index].toLowerCase().equals(input1[j].toLowerCase())&&index!=j) {
						flag=false;
						break;
					}
				}if(flag)
					System.out.println("->"+input1[index]);
			}
		}
		public static void main(String[]args) {
			Assignment_33 assignment=new Assignment_33();
					int[]num= {10,20,10,44,33,55,33};
					System.out.println("input array->"+Arrays.toString(num));
					System.out.println("Duplicate numbers in given array->");
					assignment.printDuplicateNumbers(num);
					System.out.println("-------------------");
					int[]num1={10,20,10,44,33,55,33};
					System.out.println("Unique numbers in given array->");
					assignment.printUniqueNumbersInArray(num1);
					System.out.println("-------------------");
					int[]arr={1,3,9,5,6,10};
					System.out.println("input array->"+Arrays.toString(arr));
					System.out.println("Missing numbers in given array->");
					assignment.printMissingNum(arr);
					System.out.println("-------------------");
					String[]input={"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
					System.out.println("input: "+Arrays.toString(input));
					System.out.println("Duplicate name in given array->");
					assignment.printDuplicateNamesInString(input);
					System.out.println("-------------------");
					String[]input1={"Hi", "Hello", "Hello","Techno","Credits","Techno"};
					System.out.println("input: "+Arrays.toString(input));
					System.out.println("Duplicate name in given array->");
					assignment.printUniqueNamesInString(input1);
					}
}

