package gauravSahu.practiceJanuray2023;

public class practice7 {
	
	
	
	void secondMaxNum(int[] arr) {
		int maxNum = 0;
		int secMaxNum = 0;
		if(arr[0]>arr[1]) {
			maxNum = arr[0];
			secMaxNum = arr[1];
		}else if(arr[0]<arr[1]) {
			maxNum = arr[1];
			secMaxNum = arr[0];
		}
		for(int index = 2; index<arr.length-1;index++) {
			if(arr[index]>maxNum) {
				maxNum = arr[index];
			}else if(arr[index]>secMaxNum){
				secMaxNum = arr[index];
			}
		}
		System.out.println(secMaxNum);
	}
	
	public static void main(String [] args) {
		
		practice7 p7 = new practice7();
		int[] array = {10, 99, 33, 44, 89, 76};
		p7.secondMaxNum(array);
	}

}
