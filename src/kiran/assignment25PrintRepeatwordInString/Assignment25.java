package kiran.assignment25PrintRepeatwordInString;

public class Assignment25 {
	/*Program 1: Print all the repeated word in given string.
String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
output : Hindavi 
         Shubham 
 */
	void printRepeatedWordInString(String input) {
		String[] arr=input.split(" ");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					System.out.println(arr[i]);
				}
			}
		}
	}
	
	void printNonRepeatedWordInString(String input) {
		String[] arr=input.split(" ");
		for(int i=0;i<arr.length;i++) {
			boolean flag=true;
			for(int j=1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])&& (i!=j)) {
					flag=false;
				}
			}
				if(flag)
					System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		Assignment25 obj=new Assignment25();
		String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
		System.out.println(str);
		obj.printRepeatedWordInString(str);
		System.out.println();
		System.out.println(str);
		obj.printNonRepeatedWordInString(str);

	}

}
