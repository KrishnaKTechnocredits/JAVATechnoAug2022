package gauravSahu.practiceJanuray2023;

public class practice19 {

	
	public static void main(String[] args) {
		String str = "technocreditst";
		
		while(str.length()>=1) {
			char ch = str.charAt(0);
			String str1 = Character.toString(ch);
			int length = str.length();
			str = str.replace(str1, "");
			int newLength  = str.length();
			System.out.println(str1 +  "  "  + (length-newLength));
		}
		
		String[] arr = {"Maulik", "Kanani","Mahesh", "Kanani"};
		
		for(String name : arr ) {
			for(int index = 0 ; index<name.length();index++) {
				char ch = name.charAt(index);
				int a = name.indexOf(ch);
				int b = name.lastIndexOf(ch);
				if(a==b) {
					System.out.println(ch);
				}
			}
		}
	}
}
