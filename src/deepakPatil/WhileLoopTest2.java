/*Test - 2: 4th Sep'2022

void findRequiredNumbers(int targetNum){
	int count = 0;
	while(sum<targetNum){		
		count++;
	}
	sop(count);
}

-----------------------------

findRequiredNumbers(50);

input : 50
output : 10

input : 17
output : 6*/

package deepakPatil;

public class WhileLoopTest2 {
	
	void findRequiredNumbers(int targetValue) {
		
		int sum=0;
		int num=1;
		int count=0;
		while(sum<targetValue) {
			sum=sum+num;
			num++;
			count++;
		}
		
		System.out.println(count);
	}
	
	public static void main(String[]args) {
		new WhileLoopTest2().findRequiredNumbers(50);
		
	}

}
