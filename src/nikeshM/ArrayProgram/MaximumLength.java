package nikeshM.ArrayProgram;

public class MaximumLength {
		String getMaxLength (String [] name) {
			int maxLength = name[0].length();
			String maxLengthName = name[0];
			for (int index = 1 ; index<name.length; index++) {
				if (maxLength<= name[index].length()) {
					maxLength = name[index].length();
					maxLengthName = name[index]; 
				}
			
			}
			System.out.println("maximum Length Input is " + maxLengthName );
			return maxLengthName ;
		}
		public static void main(String[] args) {
			String [] name = {"Ashish","Aditty","Manjiri","Ankita","Credits"};
			new MaximumLength().getMaxLength(name);
		}
}
