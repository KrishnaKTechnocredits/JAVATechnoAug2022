package saroj;

public class DivisibileBy3And7 {
	int count = 0;
	
	void processData(int startRange, int endRange) {
	 if(startRange>0) {
		for(int index = startRange; startRange<=endRange; index++) {
			if(index%3==0 && index%7==0) {
				System.out.println(index);
				count++;
				if(count ==3) {
					break;
				}
			}
		}
	 }else
	 System.out.println("Invalid start range");
	}
	
	public static void main(String[] args) {
		DivisibileBy3And7 divisibileBy3And7 = new DivisibileBy3And7();
		divisibileBy3And7.processData(-22, 45);
		divisibileBy3And7.processData(20, 189);
	}

}
