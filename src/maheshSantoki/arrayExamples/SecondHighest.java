//Return second highest from given array.
//input : {10,99,33,44,89,76}
//output : 89
package maheshSantoki.arrayExamples;

public class SecondHighest {
	
	int getSecondHighest(int[] arr) {
		int secHighnum=0;
		int maxNum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxNum) {
				secHighnum=maxNum;
				maxNum=arr[i];
			}
			else if(secHighnum<arr[i]){
				secHighnum=arr[i];
			}
		}
		return secHighnum;
	}
	
	public static void main(String[] args) {
	SecondHighest secondhighest=new SecondHighest();	
	
    int input[]= {10,99,33,44,89,76}; 
	System.out.println("Second Highest Number : "+secondhighest.getSecondHighest(input));
	}
}
