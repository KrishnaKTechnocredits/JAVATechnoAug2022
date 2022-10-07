//Program 1: print duplicate numbers from given array. 
//input : {10,20,10,44,33,55,33};
//output : 10
		// 33



package titikshaG;

public class Assignmnet_33{ 
	void getduplicateNumber(int[] arr) {
		for(int index=0;index<arr.length;index++) {
			for(int innerLoop=index+1;innerLoop<arr.length;innerLoop++) {
				if(arr[index]==(arr[innerLoop])) {
					System.out.println("The duplicate values are:"+" "+arr[index]); }
			}
		}
	}
		
//Second method to find duplicate number by replacing non-duplicate numbers with zero
		
	int getsecondMethofToFindZeoValue(int[] num) {//finding zeros in array
		int count=0;
		for(int index=0;index<num.length;index++){
			if(num[index]==0) {
			count++;}
		}
		return count;
	}
	
	void getsecondMethofToFindDuplicate(int[] number) {
	int countOfZero=getsecondMethofToFindZeoValue(number);
	if(countOfZero==0);
		for(int index=0;index<number.length;index++) {
			boolean flag=false;
			for(int innerIndex=index+1;innerIndex<number.length;innerIndex++) {
				if(number[index]==number[innerIndex]){
					number[innerIndex]=0;
					flag=true;}
				}
				if(flag) {
					System.out.println("The duplicate numbers are:"+" "+ number[index]);}
			}
	}
	
//Program 3 : print unique numbers from given array . 
//input : {10,20,10,44,33,55,33};
//output : 10
	//20
	//44
	//35
	//55
	
	void getUniqueNumbers(int[] uniNumber) {
		for(int index=0;index<uniNumber.length;index++) {
		for(int innerLoop=index+1;innerLoop<uniNumber.length;innerLoop++) {
				if(uniNumber[index]==(uniNumber[innerLoop]) && index!=innerLoop) {
					uniNumber[innerLoop]=0;	}
		}	
				if(uniNumber[index]!=0) {
					System.out.println("The unique values are:"+" "+uniNumber[index]); }
			}
		}
	
//Program 4 : print unique numbers from given array (frequency 1) . 
	//input : {10,20,10,44,33,55,33};
	//output : //20
				//44
				//55
		
		
	void getUniqueNumbersOfFrequency1(int[] uniNumber) {
		for(int index=0;index<uniNumber.length;index++) {
		int count=0;
			for(int innerLoop=0;innerLoop<uniNumber.length;innerLoop++) {
				if(uniNumber[index]==uniNumber[innerLoop] && index!=innerLoop) {
					count++;}
			}	
				if(count==0 && index!=0) {
					System.out.println("The unique values are:"+" "+uniNumber[index]); }
		}
	}
//program 5 : print missing numbers from given array from range 1 to 10. 
//input : {1,3,9,5,6,10}
//output : 2
			 //4
			 //7
			 //8

	void getMissingNumbersOfFrequency1(int[] numbers, int startRange, int endRange) {
		for (int index = startRange; index < endRange; index++) {
			boolean flag = true;
			for (int innerIndex = 0; innerIndex < numbers.length; innerIndex++) {
				if (index == numbers[innerIndex]) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.println("The missing number are:"+" "+index);
		}
	}
	public static void main(String[] args) {
		Assignmnet_33 assignmnet_33=new Assignmnet_33();
		System.out.println("-------------Program 1-------------");
		int[] input={10,20,10,44,33,55,33};
		assignmnet_33.getduplicateNumber(input);
		System.out.println();
		
		System.out.println("-------------Program 2-------------");
		assignmnet_33.getsecondMethofToFindDuplicate(input);
		System.out.println();
		
		System.out.println("-------------Program 3-------------");
		assignmnet_33.getUniqueNumbers(input);
		System.out.println();
		
		Assignmnet_33 assignmnet_331=new Assignmnet_33();
		int[] input2={10,20,10,44,33,55,33};
		System.out.println("-------------Program 4-------------");
		assignmnet_331.getUniqueNumbersOfFrequency1(input2);
		System.out.println();
		
		
		Assignmnet_33 assignmnet_332=new Assignmnet_33();
		int[] input3={1,3,9,5,6,10};
		System.out.println("-------------Program 5-------------");
		assignmnet_332.getMissingNumbersOfFrequency1(input3,1,10);
		
	}
	
	
}
		