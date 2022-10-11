/***Write a program to print unique character of each name in given string array.***/
// input:
// String[] arr = {"Maulik", "Kanani","Mahesh", "Kanani"};
//  output:
//  Name is Maulik :
//  M
//  a
//  u
//  l
//  i
//  k
//  ----------------------
//  Name is Kanani : 
//  K
//  i
/***********************************************************************************/

package manjiri.assignments.assignment27printuniquecharacter;

public class UniqueCharString {
	
	void printUniqueCharInString(String[] inputArr){
		
		for (int index = 0; index < inputArr.length; index++) {
			System.out.println("Name is " + inputArr[index] +":");
			for(int innerIndex = 0; innerIndex < inputArr[index].length();innerIndex++) {
				char ch = inputArr[index].charAt(innerIndex);
				int firstIndex = inputArr[index].indexOf(ch);
				int lastIndex = inputArr[index].lastIndexOf(ch);
				if(firstIndex == lastIndex) {
					System.out.println(ch);
				}
			}
			System.out.println("-----------------------");
		}
	}
	
	public static void main(String[] args) {
		String[] arr = {"Maulik", "Kanani","Mahesh", "Kanani"};
		new UniqueCharString().printUniqueCharInString(arr);
	}
}
