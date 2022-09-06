package technocredits.basicexamples.returnType;

public class Example1 {

	static int result;

	static boolean m1(int num) {
		boolean isEven = true;
		if (num % 2 == 0) {
			isEven = true;
		} else {
			isEven = false;
		}
		return isEven;
	}

	static boolean m2(int num) {
		if (num % 2 == 0) {
			return true;
		} else if (num % 3 == 0) {
			return false;
		}
		System.out.println("HI");
		return false;
	}

	static void m3() {
		return;
	}

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 5; i < 10; i++) {
			boolean flag = m2(3);
			if (flag)
				sum = sum + i;
		}
		System.out.println(sum);
	}
}
