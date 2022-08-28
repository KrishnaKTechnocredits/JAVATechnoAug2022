package pankajBhatt;

//print first three numbers, divisible by 3 & 7 between 20-100 
public class Assignment10DivisibeBy3and7 {
	
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
			new Assignment10DivisibeBy3and7().countFirsrThreeDivisible(20,100);
		}
	}
