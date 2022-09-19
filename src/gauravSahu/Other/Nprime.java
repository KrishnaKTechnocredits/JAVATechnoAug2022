package gauravSahu.Other;

public class Nprime {

	boolean flag = true;
	int startnum;

	void checkprime(int num) {
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println(num + "  It is a prime number");
		}
	}


	
	
		

	public static void main(String[] args) {
		
	}

}
