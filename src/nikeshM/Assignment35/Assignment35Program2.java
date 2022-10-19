package nikeshM.Assignment35;

//Program 2: return sum of all the digits from given String.
//input : i have 15 years and 3 months of experience.
//output : 9

public class Assignment35Program2 {

	int SumOfAllDigit(String input) {
		String[] Arr = input.split(" ");
		int sum = 0;
		int num = 0;

		for (int index = 0; index < Arr.length; index++) {
			for (int innerindex = 0; innerindex < Arr[index].length(); innerindex++) {

				try {
					char ch = Arr[index].charAt(innerindex);
					num = Integer.parseInt(String.valueOf(ch));
					System.out.println("\"" + num + "\"" + "");
					sum = sum + num;
				} catch (NumberFormatException ne) {
				}
			}
		}
		System.out.println(" Sum Of All No  Are " + sum);
		return sum;
	}
		public static void main(String[] args) {
			Assignment35Program2 p2 = new Assignment35Program2();
			String input =  "i have 15 years and 3 months of experience";
			System.out.println("Input String is " + input);
			p2.SumOfAllDigit(input);
		}
}