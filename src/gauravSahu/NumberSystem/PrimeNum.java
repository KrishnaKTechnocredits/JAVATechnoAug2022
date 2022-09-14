package gauravSahu.NumberSystem;

public class PrimeNum {

	

	void checkprime(int num) {
		boolean flag = true;
		for (int index = num; index <= num / 2; index++) {
			if (index % num == 0) {
				flag = false;
				System.out.println(num + "Not a prime number");
			}
		}
		if (flag == true)
			System.out.println("It is a prime number");
	}

	void checkout(int startnum, int endnum) {
		for (int index = startnum; index <= endnum; index++) {
		
		}
	}

	public static void main(String[] args) {
		PrimeNum primenum = new PrimeNum();
		primenum.checkout(100, 120);
	}
}
