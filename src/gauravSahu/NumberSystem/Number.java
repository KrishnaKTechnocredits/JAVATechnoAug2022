package gauravSahu.NumberSystem;

class Number {

	void check(int num) {
		boolean flag = false;

		if (num > 1) {
			for (int a = num; a <= num / 2; a++) {
				if (num % a == 0) {
					flag = true;
					// System.out.println(num + "Number is not prime);//
					break;
				}
				if (flag == false) {
					System.out.println(num + "Number is a prime number");
				}
			}
		} else {
			System.out.println("NUmber is invalid");
		}
	}

	public static void main(String[] a) {
		Number number = new Number();
		number.check(63);
		number.check(19);
		number.check(0);
	}
}