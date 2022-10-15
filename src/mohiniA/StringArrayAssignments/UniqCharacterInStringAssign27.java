
/*Assignment-27 : 23rd Sep'2022

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
I 

2.  Write a program to print 1st unique character of each name in given string array.

String[] arr = {"Maulik", "KananiK", "akanksha"};

Name is Maulik : M
-------------------
Name is KananiK : i
-------------------
Name is akanksha : n ***/
package mohiniA.StringArrayAssignments;

public class UniqCharacterInStringAssign27 {
	
	
	void getUniqCharacterInName(String name) {
		while (name.length() > 0) {
			String ch = Character.toString(name.charAt(0));
			int originalLength = name.length();
			name = name.replace(ch, "");
			int presentNameLength = originalLength - name.length();
			if (presentNameLength == 1)
				System.out.println(ch);
		}
	}

	void getUniqCharInStringArray(String[] name) {
		for (int index = 0; index < name.length; index++) {
			System.out.println("Name is: " + name[index] + " \nUnique characters are: ");
			getUniqCharacterInName(name[index]);
			System.out.println("----------------------------------------------");
		}
	}

	void getFirstUniqChar(String name) {
		// name= name.toLowerCase();
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			int firstOccurance = name.indexOf(ch);
			int lastOccurance = name.lastIndexOf(ch);
			if (firstOccurance == lastOccurance) {
				System.out.println("  First Unique Char is : "+ch);
				break;
			}
		}
		System.out.println("----------------------------------------------");
	}

	void getFirstUniqCharInString(String[] name) {
		for (int index = 0; index < name.length; index++) {
			System.out.print("Name is " + name[index] + " :");
			getFirstUniqChar(name[index]);
		}
	}

	public static void main(String[] args) {
		UniqCharacterInStringAssign27 obj = new UniqCharacterInStringAssign27();
		String[] str = { "Maulik", "Kanani", "Mahesh" };
		String[] str1 = { "Maulik", "KananiK", "Mahesh" };
		obj.getUniqCharInStringArray(str);
		obj.getFirstUniqCharInString(str1);
	}

}
