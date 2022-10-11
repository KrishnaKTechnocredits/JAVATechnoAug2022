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
package hindaviIngle;

public class Assignment27 {

//find non repetitive character using string method indexOf,lastIndexOf 
	void nonRepetative(String[] nameArray) {
		String name = "";
		for (int i = 0; i < nameArray.length; i++) {
			name = nameArray[i].toLowerCase();
			System.out.println("Name is  -> " + name);
			for (int index = 0; index < name.length(); index++) {
				char ch = name.charAt(index);
				if (name.indexOf(ch) == name.lastIndexOf(ch)) {
					System.out.println(ch);
				}
			}
		}
	}

//find first unique character in array 
	void firstOccurance(String[] nameArry) {
		String name = "";
		for (int i = 0; i < nameArry.length; i++) {
			name = nameArry[i].toLowerCase();
			for (int j = 0; j < name.length(); j++) {
				char ch = name.charAt(j);
				if (name.indexOf(ch) == name.lastIndexOf(ch)) {
					System.out.println(nameArry[i] + "--->" + ch);
					break;
				}

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment27 assignment27 = new Assignment27();
		String[] nameArray = { "Maulik", "Kanani", "Mahesh", "Kanani" };
		assignment27.nonRepetative(nameArray);
		System.out.println("======================\n");
		String[] strArr = { "Maulik", "KananiK", "akanksha" };
		assignment27.firstOccurance(strArr);

	}

}
