/*Program 3 : 
WAP to print ascii value of A->Z.

output : A -> 65
         B -> 66
		 .
		 .
		 Z -> 90*/
package adittyThakare.ascii;

public class Assignment36_Program3 {
	void printAsciiValuesOfCharAtoZ() {

		for (int index = 'A'; index <= 'Z'; index++) {
			char ch = (char) index;
			System.out.println(ch + " -> " + index);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment36_Program3 assignment36_Program3 = new Assignment36_Program3();
		System.out.println("ASCII values of characters A to Z!");
		assignment36_Program3.printAsciiValuesOfCharAtoZ();
	}

}
