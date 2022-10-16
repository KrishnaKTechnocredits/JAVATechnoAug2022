package nikeshM.Assignment35;

//Program 1 : return sum of all the numbers from given String.
//input : i have 15 years and 3 months of experience.
//output : 18

public class Assignment35ExceptionProgram1 {
	int returnSumOfAllNumber(String input ) {
		String [] Arr = input.split(" ");
		int sum = 0;
		int num = 0;
		
		for(int index = 0; index<Arr.length ; index++) {
			try {
				num = Integer.parseInt(Arr[index]);
				System.out.println("\"" + num + "\"" + "");
				sum = sum + num;	
			}catch (NumberFormatException ne) {			
			}
		}
		System.out.println(" Sum Of All No  Are " + sum);
		return sum;
	}
		public static void main(String[] args) {
			Assignment35ExceptionProgram1 excp = new Assignment35ExceptionProgram1();
			String input =  "i have 15 years and 3 months of experience";
			System.out.println("Input String is " + input);
			excp.returnSumOfAllNumber(input);
		}
}
