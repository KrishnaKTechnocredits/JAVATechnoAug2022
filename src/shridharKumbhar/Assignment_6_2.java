//Find total count for no divisible 3 and 7 bet user define range
package shridharKumbhar;

class RangeDivisibleBy3_7{

	void DivisionBy3_7(int startIndex , int endIndex){
		int count = 0;
		for(int n = startIndex ; n <= endIndex; n++ ){
			if (n%3==0 && n%7==0)
				count++;
		}
		System.out.println("total count for no divisible 3 and 7 bet "+startIndex+ " & " + endIndex + " : "+ count);
	}
	
	public static void main(String[] a){
		RangeDivisibleBy3_7 rangedivisibleby3_7 = new RangeDivisibleBy3_7();
		rangedivisibleby3_7.DivisionBy3_7(1,100);
	}
}
  