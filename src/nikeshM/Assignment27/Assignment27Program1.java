package nikeshM.Assignment27;

//Program - 1. Write a program to print unique character of each name in given string array.
//
//String[] arr = {"Maulik", "Kanani","Mahesh", "Kanani"};
// 
// Name is Maulik :
// M
// a
// u
// l
// i
// k
// ----------------------
// Name is Kanani : 
// K
// i


//Program - 2.  Write a program to print 1st unique character of each name in given string array.
//
//String[] arr = {"Maulik", "KananiK", "akanksha"};
//
//Name is Maulik : M
//-------------------
//Name is KananiK : i
//-------------------
//Name is akanksha : n

public class Assignment27Program1 {
	void getUniqueCharacter(String[] input) {
		for (int index = 0; index < input.length; index++) {
			for (int i = 0; i < input[index].length(); i++) {
				char ch = input[index].charAt(i);
				int index1 = input[index].indexOf(ch);
				int index2 = input[index].lastIndexOf(ch);
				if (index1 == index2) {
					System.out.println( ch);
				}

			}
			System.out.println(".........");
		}

	}

	void getFirstUniqueName(String [] input){
		for (int index = 0; index < input.length; index++) {
			for (int i = 0; i < input[index].length(); i++) {
				char ch = input[index].charAt(i);
				int index1 = input[index].indexOf(ch);
				int index2 = input[index].lastIndexOf(ch);
				if (index1 == index2) {
					System.out.println("First Unique Name Are \n" +ch);
					break;
				}

			}
			System.out.println(".........");
		}

	}
	public static void main(String[] args) {
		String[] input = { "Maulik", "Kanani", "Mahesh", "Kanani" };
		Assignment27Program1 p1 = new Assignment27Program1();
			p1.getUniqueCharacter(input);
			p1.getFirstUniqueName(input);
		}
}
