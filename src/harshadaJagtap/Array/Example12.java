package harshadaJagtap.Array;

public class Example12 {

	
	String getNameMaxLength(String[] input) {
		int maxLength=input[0].length();
		String maxLengthName=input[0];
		for(int index=0;index<input.length;index++) {
			if(maxLength<=input[index].length()) {
				maxLength=input[index].length();
				maxLengthName=input[index];
			}
		}
			return maxLengthName;
	}
	
	public static void main(String[] args) {
		Example12 example12=new Example12();
		String[] arr= {"Ashish","Aditty","Manjiri","Ankita","Harshad"};
		String s=example12.getNameMaxLength(arr);
		System.out.println(s);
	}
	
}
