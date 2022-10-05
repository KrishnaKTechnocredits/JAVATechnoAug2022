package priyankaD.assignments_20_30;

public class Assignment_26 {
	//find out frequency of each character from given input using single while loop.
		//String str = "technocreditst";
		void getFrequencyOfEachLetterInString(String str) {
			int index=0;
			while(index<str.length()) {
				int originalLength=str.length();
				char ch=str.charAt(0);
				String s=Character.toString(ch);
			    str=str.replace(s,"");
			    int newLength=str.length();
			    System.out.println(ch+"-->"+(originalLength-newLength));
			    }
			}
		
		public static void main(String[]args) {
			Assignment_26 assignment=new Assignment_26();
			assignment.getFrequencyOfEachLetterInString("technocreditst");
		}
}
