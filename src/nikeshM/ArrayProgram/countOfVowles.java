package nikeshM.ArrayProgram;

public class countOfVowles {
	
	int getVowles(String str) {
		int count = 0;
		str = str.toLowerCase();
		for (int index = 0 ; index<str.length(); index++) {
			if (str.charAt(index)=='a' || str.charAt(index)=='u' || str.charAt(index)=='i' ) {
				count++;
			}
			else {
				
			}
		}
		System.out.print("Voweles Count Are "+count);
		return count;
	}
		public static void main(String[] args) {
			countOfVowles counts = new countOfVowles();
			counts.getVowles("Maulik");
		}
}
