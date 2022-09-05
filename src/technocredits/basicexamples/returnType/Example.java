package technocredits.basicexamples.returnType;

public class Example {

	static void m1() {
		return;
	}

	static String result(int marks) {
		String resultMessage = "";
		if (marks <= 35) {
			resultMessage = "fail";
		} else if (marks > 35 && marks <= 100) {
			resultMessage = "pass";
		}
		return resultMessage;
	}

	static boolean m2() {
		return true;
	}

	static int m3() {
		return 5;
	}

	static double m4() {
		return 5.0;
	}

	static float m6() {
		return 6.0f;
	}

	static char m7() {
		return 'a';
	}

	public static void main(String[] args) {
	
	}

}
