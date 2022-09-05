
package gauravSahu.NumberSystem;

class Primenumber {

	void prime(int num) {
		boolean code = true;

		if (num > 0) {
			for (int index = 2; index < num / 2; index++) {
				if (num % index == 0) {
					code = false;
					System.out.println(num + " It is not a prime number");
					break;
				}
			}
			if (code == true) {
				System.out.println(num + " It is a prime number");
			}
		} else {
			System.out.println(num + "Enter valid number");
		}
	}

	public static void main(String[] args) {
		Primenumber primenumber = new Primenumber();
		primenumber.prime(15);
		primenumber.prime(17);
		primenumber.prime(-10);
	}
}