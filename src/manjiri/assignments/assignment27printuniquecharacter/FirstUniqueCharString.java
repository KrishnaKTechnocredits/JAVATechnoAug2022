/***Write a program to print 1st unique character of each name in given string array.***/
// input:
// String[] arr = {"Maulik", "KananiK", "akanksha"};
// output:
// Name is Maulik : M
// -------------------
// Name is KananiK : i
// -------------------
// Name is akanksha : n 
/***************************************************************************************/

package manjiri.assignments.assignment27printuniquecharacter;

public class FirstUniqueCharString {
	
void printFirstUniqueCharInString(String[] inputArr){
		
		for (int index = 0; index < inputArr.length; index++) {
			System.out.print("Name is " + inputArr[index]+": ");
			for(int innerIndex = 0; innerIndex < inputArr[index].length();innerIndex++) {
				char ch = inputArr[index].charAt(innerIndex);
				int firstIndex = inputArr[index].indexOf(ch);
				int lastIndex = inputArr[index].lastIndexOf(ch);
				if(firstIndex == lastIndex) {
					System.out.println(ch);
					break;
				}
			}
			System.out.println("-----------------------");
		}
	}
	
	public static void main(String[] args) {
		String[] arr = {"Maulik", "KananiK", "akanksha"};
		new FirstUniqueCharString().printFirstUniqueCharInString(arr);
	}
}
