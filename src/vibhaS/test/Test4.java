package vibhaS.test;

public class Test4 {

	int getSumOfDigitInString(String str){
		int sum=0;
		for(int index=0;index<str.length();index++){
			char ch=str.charAt(index);
			if(Character.isDigit(ch)){
				sum=sum+Character.getNumericValue(ch);
			}
		}
		return sum;
	}
	
	int[] getSumOfDigit(String[] arr){
		int[] num=new int [arr.length];
		int output=0;
		for(int index=0;index<arr.length;index++){
			int ans=getSumOfDigitInString(arr[index]);
			num[output]=ans;
				output++;
		}
		return num;
	}
	
	void getCountOfVisibleTree(int[] num1){
		int count=0;
		int max=0;
		for(int index=0;index<num1.length;index++){
			if(max<num1[index]){
				max=num1[index];
				count++;
			}
		}
		System.out.println("count of Visible tree is => ");
		System.out.println(count);
	}
	
	
	public static void main(String[] args){
		Test4 test4=new Test4();
		String[] ar={"Ma1he4sh","A9ni","P1uj3a5","Harshal","A4d4itty","Rahul"};
		int[] outputans=test4.getSumOfDigit(ar);
		for(int index=0;index<outputans.length;index++){
			System.out.println(ar[index]+" => "+outputans[index]);
		}
		System.out.println("");
		int[] num1={3,7,5};
		test4.getCountOfVisibleTree(num1);
		System.out.println("");
		int[] num2={3,5,11,9,10,13};
		test4.getCountOfVisibleTree(num2);
	}
}
