package priyankaD.assignments_31_40;

public class Assignment_35 {
/*Program 1 : return sum of all the numbers from given String.
input : i have 15 years and 3 months of experience.
output : 18*/
	  int processData(String input) {
			String[] input1=input.split(" ");
			int ans=0;
			for(int i=0;i<input1.length;i++) {
		try{
			int out=Integer.parseInt(String.valueOf(input1[i]));
			ans=ans+out;
		}catch(NumberFormatException nfe) {
			
		  }	
		}
		return ans;	
	}
/*Program 2: return sum of all the digits from given String.
input : i have 15 years and 3 months of experience.
output : 9*/
	  int processData1(String input) {
			String[] input1=input.split(" ");
			int ans1=0;
			for(int i=0;i<input1.length;i++) { 
			for(int j=0;j<input1[i].length();j++) {
		try{
			char ch=input1[i].charAt(j);
			int out=Integer.parseInt(String.valueOf(ch));
			ans1=ans1+out;
		}catch(NumberFormatException nfe) {
			
		   }	
		 }
	   }
		return ans1;	
	}
		public static void main(String[]args) {
			Assignment_35 assignment=new Assignment_35();
			String input="i have 15 years and 3 months of experience.";
			System.out.println("input ->"+input);
			int ans=assignment.processData(input);
			System.out.println("output sum of numbers in string input-> "+ans);
			int ans1=assignment.processData1(input);
			System.out.println("output sum of digits in string input-> "+ans1);
		}
}
