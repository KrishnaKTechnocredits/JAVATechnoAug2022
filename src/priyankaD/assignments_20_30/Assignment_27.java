package priyankaD.assignments_20_30;
import java.util.Arrays;
public class Assignment_27 {
	/*Assignment-27 
	  1. Write a program to print unique character of each name in given string array.
	 String[] arr = {"Maulik", "Kanani","Mahesh", "Kanani"};*/
	String printUniqueCharOfName(String name) {
		for (int index=0;index<name.length();index++) {
			char ch=name.charAt(index);
			if(name.indexOf(ch)==name.lastIndexOf(ch)) {
				System.out.println(ch);
			}
		}System.out.println("-------------------");
		return name;
	}
	void getStringOfName(String[] arr) {
		for(int index=0;index<arr.length;index++) {
			String name=arr[index];
			System.out.println("Name is -->"+arr[index]);
			name=printUniqueCharOfName(name);
		}
	}
	/*2.  Write a program to print 1st unique character of each name in given string array.
	 String[] arr = {"Maulik", "KananiK", "akanksha"};*/

	String printFirstUniqueCharacterOfName(String name) {
		for (int index=0;index<name.length();index++) {
			char ch=name.charAt(index);
			if(name.indexOf(ch)==name.lastIndexOf(ch)) {
				System.out.println(ch);
				break;
			}
		}System.out.println("-------------------");
		return name;
	}
	void getArrayStringOfName(String[] arr1) {
		for(int index=0;index<arr1.length;index++) {
			String name=arr1[index];
			System.out.println("Name is -->"+arr1[index]);
		    name=printFirstUniqueCharacterOfName(name);
		}
	}
	public static void main(String[]args) {
		Assignment_27 assignment=new Assignment_27();
		String[] arr={"Maulik", "Kanani","Mahesh", "Kanani"};
		System.out.println(Arrays.toString(arr));
		assignment.getStringOfName(arr);
		System.out.println("----*-----*-----*-----*-----*-----");
		String[] arr1={"Maulik", "KananiK", "akanksha"};
		System.out.println(Arrays.toString(arr1));
		assignment.getArrayStringOfName(arr1);
	}
}
