package shraddhaRekhate.Assignment28;
//Program 3: [15 mins]
//Print count of each vowels in a given String using switch case.
//
//input : technocredits
//output : e -> 2
//         o -> 1
//		 i -> 1

	
	
public class CountOfEachVowelInGIvenString {
	int count=0;
	int countOfVowels(String str) {
		for(int index=0;index<str.length();index++) {
		char ch=str.charAt(index);
      switch(ch) {
        case 'A':
		case 'a':
			count++;
			break;
		case 'E':
		case 'e':
			count++;
			break;
		case 'I':
		case 'i':
			count++;
			break;
		case 'O':
		case 'o':
			count++;
			break;
		case 'U':
		case 'u':
			count++;
			break;
      }
 	}
		return count;

	}
	
	public static void main(String[] args) {
		CountOfEachVowelInGIvenString countOfEachVowelInGIvenString=new CountOfEachVowelInGIvenString();
		System.out.println(countOfEachVowelInGIvenString.countOfVowels("technoCredits"));
	}
}
