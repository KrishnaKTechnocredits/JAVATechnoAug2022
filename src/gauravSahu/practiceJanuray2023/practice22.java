package gauravSahu.practiceJanuray2023;

public class practice22 {
	
	public static void main(String[] args) {
		
		
		int[] arr = {153,123};
		
		
		int remain = 0;
		
		int cube = 0;
		
		
		for(int num : arr) {
			int tempnum  = num ;
			while(num>0) {
				
				remain = num%10;
				num = num/10;
				cube = cube + (remain * remain * remain);
			}if(cube == tempnum ) {
				System.out.println("It is armtrong num  : " + tempnum);
			}else {
				System.out.println("It is not a armstrong num : " + tempnum);
			}
		}
		
		int num3 = 123;
		String revNum = " ";
		while(num3>0) {
			
			int remain3 = 0;
			
			remain3 = num3%10;
			num3 = num3/10;
			revNum = revNum  + remain3;
			
		
		}
		System.out.println(revNum);
		
	}

}
