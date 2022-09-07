/*
Assignment - 16 : 6th Sep'2022

// 1. write a method to return length of the given name
// int getNameLength(String name)


//2. return middle character from given name.
// Hint : char getMiddleChar(String name)

// input : Maulik
// output : Middle character in name Maulik is u

// input : Technocredits
// output : Middle character in name Technocredits is c
*/
package deepakBorse.Assignments;

public class NameLengthChar {
	String name;
	int namelen;

	int getNameLength(String name) {
		this.name = name;
		namelen = name.length();
		// System.out.println(namelen);
		return (namelen);
	}

	char getMiddleChar(String name) {
		char ch;
		if (namelen % 2 == 0) {
			ch = name.charAt((namelen / 2) - 1);
			System.out.println(ch);
		} else
			ch = name.charAt((namelen / 2));
		System.out.println("Middle character of '" + name + "' : " + ch);
		return 0;
	}

	void printinfo(String name) {
		getNameLength(name);
		System.out.println("Length of the string '" + name + "' : " + namelen);
		getMiddleChar(name);
	}

	public static void main(String[] args) {
		// NameLengthChar NameLengthChar=new NameLengthChar();
		// int len=NameLengthChar.getNameLength("Deepak Borse");
		// System.out.println("Length of the string '"+NameLengthChar.name+"' : "+len);
		new NameLengthChar().printinfo("DeepakBorse");
	}

}
