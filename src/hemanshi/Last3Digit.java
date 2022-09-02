package hemanshi;
 
public class Last3Digit {
	void Divisible3_7(int startIndex, int finalIndex) {
    int result = 0;
		
		System.out.println("Last 3 numbers divisible by 3 and 7 from "+startIndex+" and "+finalIndex+" are: ");
		for(int index=finalIndex;index>=startIndex;index--){
			if(index%3==0 && index%7==0) {
				System.out.println(index);
				result++;
			}
			if(result==3)
				break;
		}		
	}
	public static void main(String[] args) {
		Last3Digit last3Digit = new Last3Digit();
		last3Digit.Divisible3_7(10,200);
	}
}

