/*On User defined range, print first 3 numbers which are divisible by 3 and 7.
input : 20 to 100
output : 		21
             	42
              	63*/
package pankajBhatt;

public class ProgrammingTest1 {

	void countFirsrThreeDivisible(int n, int m){
		int count = 0;
		for(; n<=m; n++){
			if( n % 3 == 0 && n % 7 == 0){
				count++;
				System.out.println(n);
			}
			if(count == 3) {
				break;
			}
		}
	}

	public static void main(String[] args){
		new ProgrammingTest1().countFirsrThreeDivisible(20,100);
	}
}
