/*Program 3 : Return a reverse String [Method : inplace reverse].*/

package ankitaBarwad;

public class A40_ReverseStringInplaceReplace {
	
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
		System.out.println("Program 3 : Return a reverse String [Method : inplace reverse]");
		String name = "technocredits";
		System.out.println("Input String is: " + name);
		String reversename = new A40_ReverseStringInplaceReplace().getReverseString(name);
		System.out.println("Reverse String is: " + reversename);
	}
}
