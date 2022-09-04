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
output : 6

1+2+3+4+5+6+7+8+9+10 = 55*/

package pranjaliV.Test2;

public class RequiredNumbers {
	
	void findRequiredNumbers(int num) {
		int count=0;
		int sum=0;
		int index=1;
		while(sum<num) {
			sum=sum + index;
			index++;
			count++;
		}
		System.out.println("Input = "+ num);
		System.out.println("Output = "+ count);
	}

	public static void main(String[] args) {
		RequiredNumbers requiredNumbers = new RequiredNumbers();
		requiredNumbers.findRequiredNumbers(50);
	}

}
