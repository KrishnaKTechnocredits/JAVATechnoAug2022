/*Program 3 : Return a reverse String [Method : inplace reverse].
input: technocredits
output: stiderconhcet
*/

package swapnilMaheshwari.collection.MAPprograms;

public class ReverseString {
	String getReverseStringWithReverseLoop(String str) {
		String concate=" ";
		for(int index=str.length()-1;index>=0;index--) {
			char ch=str.charAt(index);
			concate=concate+ch;
		}
		return concate;
	}
	String getReverseStringUsingInplaceReplacment(String str) {
		String reverseString=" ";
		for (int i=0,j=str.length()-1;i<j;i++,j--) {
			char ch1=str.charAt(i);
			char ch2=str.charAt(j);
			if(i==0) {
				reverseString=ch2+str.substring(i+1,j) +ch1;
			}
			else
				reverseString=reverseString.substring(0,i)+ch2 +str.substring(i+1,j)+ch1 +reverseString.substring(j+1);

		}
		return reverseString;
	}
	public static void main(String[] args) {
		String input="technocredits";
		System.out.println("Input :"+input);
		String output=new ReverseString().getReverseStringWithReverseLoop(input);
		String output1=new ReverseString().getReverseStringUsingInplaceReplacment(input);
		System.out.println("Output :"+output);
		System.out.println("Output :"+output1);

	}
}
