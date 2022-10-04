package pranjaliV;

public class Assignment10Pranjali {
	
	void divisibleBy3And7(int start,int end){
		int count=0;
		System.out.println("Last 3 numbers divisible by 3 and 7 between "+start +" and "+ end +" are:");
		for(int index=end; index>=start; index--) {
			if(index%3==0 && index%7==0) {
				System.out.println(index);
				count++;
				if(count==3) {
					break;
				}
			}
		}
	}
	
	public static void main(String[] agrs) {
		Assignment10Pranjali assignment10 = new Assignment10Pranjali();
		assignment10.divisibleBy3And7(10,200);
	}
}
