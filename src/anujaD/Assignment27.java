/*
 * Assignment-27 
  1. Write a program to print unique character of each name in given string array.
 
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
  
  2.  Write a program to print 1st unique character of each name in given string array.
 
 String[] arr = {"Maulik", "KananiK", "akanksha"};
 
 Name is Maulik : M
 -------------------
 Name is KananiK : i
 -------------------
 Name is akanksha : n 
 */


package anujaD;

public class Assignment27 {
	
	void nonRepet(String[] Array) {
		String name = "";
		for (int i = 0; i < Array.length; i++) {
			name = Array[i].toLowerCase();
			System.out.println("Name is  -> " + name);
			for (int index = 0; index < name.length(); index++) {
				char ch = name.charAt(index);
				if (name.indexOf(ch) == name.lastIndexOf(ch)) {
					System.out.println(ch);
				}
			}
		}
	}

 
	void firstOccur(String[] Array) {
		String name = "";
		for (int i = 0; i < Array.length; i++) {
			name = Array[i].toLowerCase();
			for (int j = 0; j < name.length(); j++) {
				char ch = name.charAt(j);
				if (name.indexOf(ch) == name.lastIndexOf(ch)) {
					System.out.println(Array[i] + "--->" + ch);
					break;
				}

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment27 assignment27 = new Assignment27();
		String[] nameArray = { "Maulik", "Kanani", "Mahesh", "Kanani" };
		assignment27.nonRepet(nameArray);
		System.out.println("======================\n");
		String[] strArr = { "Maulik", "KananiK", "akanksha" };
		assignment27.firstOccur(strArr);

	}


}
