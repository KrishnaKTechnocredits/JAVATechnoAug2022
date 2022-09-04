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
