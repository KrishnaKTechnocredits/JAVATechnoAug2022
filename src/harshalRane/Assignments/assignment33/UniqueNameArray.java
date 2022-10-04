/*
 * program 5 : print unique names from given array. 
input : {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
output : Hi
         Hello
		 Techno
		 Credits
 */
package harshalRane.Assignments.assignment33;

public class UniqueNameArray {
	
	void getUniqueNameFromArray(String[] input) {
		System.out.println("*** Option1 ***");
		System.out.println("All unique names from given array are: ");
		for(int index=0;index<input.length;index++) {
			boolean flag = true;
			for(int innerIndex=index+1;innerIndex<input.length;innerIndex++) {
				if(input[index].equals(input[innerIndex])  && index!=innerIndex) {
					flag = false;
				}
			}
			if(flag) {
				System.out.println(input[index]);
			}
		}
	}
	
	void getUniqueNamesFromArray1(String[] input) {
		System.out.println("\n*** Option2 ***");
		System.out.println("All unique names from given array are: ");
		for(int index=0;index<input.length;index++) {
			int count=1;
			for(int innerIndex=index+1;innerIndex<input.length;innerIndex++) {
				if(input[index].equalsIgnoreCase(input[innerIndex]) && input[innerIndex]!="") {
					input[innerIndex]= "";
					count++;
				}
			}
			if(count>=1 && input[index]!="") {
				System.out.println(input[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		UniqueNameArray u = new UniqueNameArray();
		String[] input = {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
		u.getUniqueNameFromArray(input);
		u.getUniqueNamesFromArray1(input);
	}
}
