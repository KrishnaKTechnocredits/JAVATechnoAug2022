/*Assignment-27 : 23rd Sep'2022
 
Program - 1. Write a program to print unique character of each name in given string array.
 
 String[] arr = {"Maulik", "Kanani","Mahesh", "Kanani"};
  
  Name is Maulik :
  M
  a
  u
  l
  i
  k
  ----------------------
  Name is Kanani : 
  K
  i

Program - 2.  Write a program to print 1st unique character of each name in given string array.
 
 String[] arr = {"Maulik", "KananiK", "akanksha"};
 
 Name is Maulik : M
 -------------------
 Name is KananiK : i
 -------------------
 Name is akanksha : n */

package shivaniLikhia;

public class Assignment27 {

	void getUniqueCharacterInString(String str) {
		System.out.println("The name is : " +str);
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				System.out.println(ch);
			}
		}
	}
	
	void getUniqueCharacterInArray(String[] arr) {
		for(String str : arr) {
			 getUniqueCharacterInString(str);
			 System.out.println("----------------------------");
		}
	}
	
	void getFirstUniqueCharacterFromString(String str) {
		System.out.println("The name is : " +str);
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				System.out.println(ch);
				break;
			}
		}
	}
	
	void getFirstUniqueCharacterFromArray(String[] arr) {
		for(String str : arr) {
			getFirstUniqueCharacterFromString(str);
			System.out.println("-----------------------------");
		}
	}
	
	public static void main(String[] args) {
		Assignment27 assignment27 = new Assignment27();
		String[] arr = {"Maulik", "Kanani","Mahesh", "Kanani"};
		assignment27.getUniqueCharacterInArray(arr);
		String[] arr1 = {"Maulik", "KananiK", "akanksha"};
		assignment27.getFirstUniqueCharacterFromArray(arr1);	}
}
