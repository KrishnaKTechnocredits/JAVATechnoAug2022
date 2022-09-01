package akankshaSharma;

public class PrimeForLoop {
		
		void testPrime(int startIndex,int endIndex) {
			for(int check=startIndex; check<=endIndex; check++) {
				if(check%3==0 && check%7==0) {
					System.out.println("Numbers divisible by 3 and 7 are: "+ check);
				}
			}
		}

		public static void main(String[] args) {
			PrimeForLoop primeForLoop = new PrimeForLoop();
			primeForLoop.testPrime(20,100);
		}
	}



