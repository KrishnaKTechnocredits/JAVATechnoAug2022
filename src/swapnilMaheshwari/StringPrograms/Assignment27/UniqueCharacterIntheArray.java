package swapnilMaheshwari.StringPrograms.Assignment27;
/*  1. Write a program to print unique character of each name in given string array.
 
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
  
  */
public class UniqueCharacterIntheArray {
	void getUniqueChar(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			String str = arr[i];
			System.out.println("Name is : " + str);
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (str.indexOf(ch) == str.lastIndexOf(ch)) 
				{
					System.out.println(ch);
					
				}
			}
		}
	}

	public static void main(String[] args) {
		String[] str = { "Maulik", "Swapnil", "aakansha", "KananiK" };
		new UniqueCharacterIntheArray().getUniqueChar(str);
	}

}
