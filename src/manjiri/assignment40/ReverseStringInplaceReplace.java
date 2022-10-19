/*Program 3 : Return a reverse String [Method : inplace reverse].*/

package manjiri.assignment40;

public class ReverseStringInplaceReplace {
	
	String getReverseString(String name){
		String reverseName = "";
		
		for (int index = 0,revIndex = name.length()-1; index < revIndex; index++,revIndex--) {
			char ch1 = name.charAt(index);
			char ch2 = name.charAt(revIndex);
			
			if(index == 0) {
				reverseName = ch2 + name.substring(index+1,revIndex) + ch1;
			}	
			else {
				reverseName = reverseName.substring(0, index) + ch2 + name.substring(index+1,revIndex) + ch1 + reverseName.substring(revIndex+1);
			}
		}
		return reverseName;
	}
	
	
	public static void main(String[] args) {
		String name = "technocredits";
		System.out.println("Input String is: " + name);
		System.out.println("---------------------------------");
		String reversename = new ReverseStringInplaceReplace().getReverseString(name);
		System.out.println("Reverse String is: " + reversename);
	}
}
