package smitaVetal.Assignment31_40;

public class Assignment36_1 {
	
	private int getAscii(char ch) {
		int ascii = ch;
		return ascii;
	}
	
	public void display(char ch) {
		System.out.println("Ascii of "+ch+ " is "+ getAscii(ch));
	}

	public static void main(String[] args) {
		Assignment36_1 prog = new Assignment36_1();
		System.out.println("Program to return ascii of given character\ninput : C\noutput : 67");
		prog.display('c');
		prog.display('K');
		prog.display('C');
	}
}
