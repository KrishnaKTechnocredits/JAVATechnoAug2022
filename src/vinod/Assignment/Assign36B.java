//WAP to print ascii value of A->Z

package vinod.Assignment;

public class Assign36B {
	void getAsciiValue() {
		for (int i=65; i<=90; i++) {
			char ch = (char)i;
			System.out.println(ch + "--->" + i);
		}
	}
	public static void main(String[] args) {
		Assign36B assign36B = new Assign36B();
		assign36B.getAsciiValue();
	}

}
