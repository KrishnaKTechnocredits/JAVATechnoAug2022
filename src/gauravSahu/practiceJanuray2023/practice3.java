package gauravSahu.practiceJanuray2023;

public class practice3 {
	
	void evenNum(int startNum, int endNum) {
		for(int index=startNum; index<=endNum;index++) {
			if(index%2==0) {
				System.out.println("Even num : " + index);
			}
		}
	}
	
	void divBy5(int startNum, int endNum) {
		for(int index=startNum;index<=endNum;index++) {
			if(index%5==0) {
				System.out.println("Num is div by : " + index);
			}
		}
	}
	
	void divBy35 (int startNum, int endNum){
		for(int index = startNum;index<=endNum;index++) {
			if(index%3==0 && index%5==0) {
				System.out.println("Num is div by 3 & 5 : " + index);
			}
		}
	}
	
	int sumOfOddEven(int startNum, int endNum){
		int sumOfOdd = 0;
		int sumOfEven = 0;
		int total = 0;
		for(int index=startNum;index<=endNum;index++) {
			if(index%2==0) {
				sumOfEven = sumOfEven + index;
			}else {
				sumOfOdd = sumOfOdd + index ; 
			}
		}
		return sumOfEven - sumOfOdd;
	}
	
	void revOrder(int startNum, int endNum) {
		for(int index = endNum; index>=startNum;index--) {
			if(index%2!=0){
				System.out.println(index);
			}
			}
	}
	
	public static void main(String[] args) {
		practice3 p3 = new practice3();
		p3.evenNum(10,400);
		p3.divBy5(10, 150);
		p3.divBy35(3, 500);
		int sum = p3.sumOfOddEven(1, 100);
		System.out.println(sum);
		p3.revOrder(1, 10);
	}

}
