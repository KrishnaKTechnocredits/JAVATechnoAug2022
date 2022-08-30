package pankajBhatt;

public class Assignment10_30thAug2022 {

	void countLastThreeDivisible(int n, int m){
		int count = 0;
		for(; m >= n; m--){
			if( m % 3 == 0 && m % 7 == 0){
				count++;
				System.out.println(m);
			}
			if(count == 3) {
				break;
			}
		}
	}

	public static void main(String[] args){
		new Assignment10_30thAug2022().countLastThreeDivisible(10,200);
	}
}