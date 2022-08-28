package apurvaBabel;

class Test1{
	int count=0;
	void divisibleBy3and7(int startIndex,int endIndex){
		System.out.println("First 3 numbers divisble by 3 and 7 are ");
		for(int index = startIndex;index <= endIndex;index++ ){
			if (index%3==0 && index%7==0){
				System.out.println(index);
				count++;
			}if (count>=3){
				break;
			}	
		}
	}
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.divisibleBy3and7(20,100);
	}
}
