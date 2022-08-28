package monikaDwivedi;

class PrimeNumber(){	
    int num = 29;
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
	public static void main(String[] args){
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.isPrime(37);
		primeNumber.isPrime(36);
		primeNumber.isPrime(99);
}
