package swapnilMaheshwari;

public class AvgofNumDivisibleBy3and7 {
	int count=0, sum=0;
	double avg;
	void avg (int srange, int erange) {
		for ( ; srange < erange; srange++) {
		 if ( srange%3==0 && srange%7==0 ) {
			 count++;
			 System.out.println(srange);
			 sum=sum+srange;
			}
		}
		avg=(sum/count);
		System.out.println("Average of given number is :"+avg);
	}
	public static void main (String[] args) {
		AvgofNumDivisibleBy3and7 avgofNumDivisibleBy3and7 = new AvgofNumDivisibleBy3and7();
		avgofNumDivisibleBy3and7.avg(10,200);
	}
}
