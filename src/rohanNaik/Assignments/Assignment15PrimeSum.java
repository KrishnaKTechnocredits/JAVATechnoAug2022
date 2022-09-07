/*Assignment - 15 : 5th Sep'2022

1. We need to do sum of first 5 prime number, using return keyword
output: (2 + 3 + 5 + 7 + 11) = 28

-----------------------------
*/

package rohanNaik.Assignments;

public class Assignment15PrimeSum {

	int primeSum(int start, int end) {
		boolean flag = true;
		int sum=0;
		for (; start <= end; start++) {

			for (int index = 2; index <= start / 2; index++) {
				if (start % index == 0) {
					//System.out.println(start + "not prime");
					flag = false;
					break;
				} else{
					System.out.println(start + "prime");
				}
			}
			if (flag == true)
				System.out.println(start + "prime");
				sum = sum + start;

		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment15PrimeSum psum = new Assignment15PrimeSum();
		int total = psum.primeSum(0, 10);
		System.out.println("-----------------");
		System.out.println("sum is: "+total);
		
	}

}
