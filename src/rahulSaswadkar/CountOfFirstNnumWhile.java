/*
 * Test - 2: 4th Sep'2022

void findRequiredNumbers(int targetNum){
	int count = 0;
	while(sum<targetNum){		
		count++;
	}
	sop(count);
}

-------

findRequiredNumbers(50);

input : 50
output : 10

input : 17
output : 6

1+2+3+4+5+6+7+8+9+10 = 55
 */

package rahulSaswadkar;

public class CountOfFirstNnumWhile {
	public static void main(String[] args){
		CountOfFirstNnumWhile countOfFirstNnumWhile = new CountOfFirstNnumWhile();
		countOfFirstNnumWhile.findRequiredNumbers(50);
		countOfFirstNnumWhile.findRequiredNumbers(17);
  }
  
  void findRequiredNumbers(int targetNum){
		int startIndex = 1;
		int sum = 0;
		int count = 0;
		while(sum<targetNum){
		  sum = sum + startIndex;
		  startIndex++;
		  count++;
		}
		System.out.println("Minimum numbers needed to get count " + targetNum + " or greater is : " + count );
  }

}
