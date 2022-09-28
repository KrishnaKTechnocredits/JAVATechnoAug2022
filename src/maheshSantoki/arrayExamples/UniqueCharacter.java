/*Program - 1. Write a program to print unique character of each name in given string array.
 
 String[] arr = {"Maulik", "Kanani","Mahesh", "Kanani"};
  
  Name is Maulik :
  M
  a
  u
  l
  i
  k*/
package maheshSantoki.arrayExamples;
import java.util.Arrays;
public class UniqueCharacter {
	
	void printUniqueCharOfStr(String[] arr) {
		System.out.println("1 : Unique character of each name in given string array : " );
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println("Name is \"" + arr[i] + "\" : " );
			for(int j = 0; j < arr[i].length() ; j++) {
				char ch=arr[i].charAt(j);
				if(arr[i].indexOf(ch)  == arr[i].lastIndexOf(ch)) {
					System.out.println(ch);
				}
			}
		}
		System.out.println("================================================================\n\n");
	}
/*
 * Program - 2. Write a program to print 1st unique character of each name in
 * given string array.
 * 
 * String[] arr = {"Maulik", "KananiK", "akanksha"};
 * 
 * Name is Maulik : M ------------------- Name is KananiK : i
 * ------------------- Name is akanksha : n
 */
	void printFirstUniqueCharOfStr(String[] arr) {
		System.out.println("2 : First unique character of each name in given string array : " );
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print("Name is \"" + arr[i] + "\" : " );
			for(int j = 0; j < arr[i].length() ; j++) {
				char ch =arr[i].charAt(j);
				if(arr[i].indexOf(ch)  == arr[i].lastIndexOf(ch)) {
					System.out.println(ch);
					break;
				}

			}
		}
	}
	public static void main(String[] args) {
		UniqueCharacter unique=new UniqueCharacter();
		String[] arr = {"Maulik", "Kanani","Mahesh", "Kanani"};
		unique.printUniqueCharOfStr(arr);
		String[] arr1 = {"Maulik", "KananiK", "akanksha"};
		unique.printFirstUniqueCharOfStr(arr1);
	}
}
