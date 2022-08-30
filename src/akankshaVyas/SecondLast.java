package akankshaVyas;

public class SecondLast {
	
	void printSecondLast(int startIndex, int endIndex){
		int count=0;
		for(int index = endIndex; index >= startIndex; index--){
			if(index %3 == 0 && index%7 == 0){
				count++;
				if(count==2){
					System.out.println("The second last number which is divisible by 3 and 7 is " +index);
					break;
				}
			}
		}
	}	

	public static void main(String[] args){
		new SecondLast(). printSecondLast(20,100);
	}
}
