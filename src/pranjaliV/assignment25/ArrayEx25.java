/*

Assignment - 25 : 20th Sep'2022

Program 1: //22.05
Print all the repeated word in given string.

String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
output : Hindavi Shubham 

Program 2: Print all the non repeated word in given string.

String str = "Maulik Puja Hindavi Shubham hindavi Shubham Titiksha Swati";
output : Maulik Puja Titiksha Swati

*/

package pranjaliV.assignment25;
  
public class ArrayEx25 {
	
	int getCountWord(String[] input,String name) {
		int count=0;
		for(int index=0; index<input.length; index++) {
			if(name==input[index]) {
				count++;
				System.out.println(input[index]);
				System.out.println(count);
			}
		}
		
		return count;
	}

	void printRepeatWord(String names) {
		String[] input = names.split(" ");
		
		System.out.print("Output : ");
		for(int index=0; index<input.length; index++) {
			for(int innerIndex=index+1; innerIndex<input.length; innerIndex++) {
				if(input[index].equals(input[innerIndex])&& (index!=innerIndex)) {
					System.out.print(input[index]+ " ");
				}
			}
		}
	}
	
	void printNonRepeatWord(String names) {
		String[] input = names.split(" ");
		
		System.out.print("Output : ");
		for(int index=0; index<input.length; index++) {
			boolean flag = true;
			for(int innerIndex=1; innerIndex<input.length; innerIndex++) {
				if(input[index].equals(input[innerIndex])&& (index!=innerIndex)) {
					flag=false;
				}
			}
			if(flag) {
				System.out.print(input[index]+ " ");
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		ArrayEx25 arrayEx25 = new ArrayEx25();
		String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
		
		System.out.println("Print all the repeated word in given string.");
		System.out.println("Input : "+ str);
		arrayEx25.printRepeatWord(str);
		System.out.println("");
		
		
		System.out.println("Print all the non repeated word in given string.");
		System.out.println("Input : "+ str);
		arrayEx25.printNonRepeatWord(str);
		System.out.println("");
		
	}

}
