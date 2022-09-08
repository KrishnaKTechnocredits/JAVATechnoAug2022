/*Assignment - 10 : 30th Aug'2022
Find last 3 numbers divisible by 3 and 7.

Input : 10 to 200
Output : 189
              168
              147*/

package rashmiG;

class Last3NosDivisibleBy3And7{
	
	void findLast3NosDivisibleBy3And7(int startNum, int endNum){
		int count=0;
		for(int index= endNum; index>=startNum; index--){
			if(index%3==0 && index%7==0){
				System.out.println(index);
				count++;
			
				if(count>=3)
					break;
			}
			
		}
	}
	
	public static void main(String[] args){
		new Last3NosDivisibleBy3And7().findLast3NosDivisibleBy3And7(10,200);
	}
}
			