/*WAP to print ascii value of A->Z.

output : A -> 65
         B -> 66
		 .
		 .
		 Z -> 90*/
package smitaVetal.Assignment31_40;

public class Assignment36_2 {

	void printAsciiValue() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			int num = ch;
			System.out.println(ch + " -> " + num);
		}
	}

	public static void main(String[] args) {
		Assignment36_2 prog = new Assignment36_2();
		prog.printAsciiValue();
	}
}
