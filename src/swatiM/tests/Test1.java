package swatiM.tests;

public class Test1 {

	void divisibleThreeAndSeven(int startIndex,int endIndex) {
		int count=0;
		for(int intdex=startIndex;intdex<=endIndex;intdex++) {
			if(intdex%3==0 && intdex%7==0) {
				count++;
				System.out.println(intdex);
				if(count==3) {
					break;
				}
			}
			
		}
	}
	public static void main(String[] args) {
		new Test1().divisibleThreeAndSeven(20,100);
	}

}
