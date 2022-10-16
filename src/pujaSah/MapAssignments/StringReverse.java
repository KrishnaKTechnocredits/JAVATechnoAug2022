/*Assignment 40 : 16th Oct'2022
Program 4 : Return a reverse String [Use : StringBuilder].
input: "Technocredits";
output: stiderconhceT
 */

package pujaSah.MapAssignments;

class StringReverse {

	// method to return a reverse String [Use : StringBuilder]
	String getReversedStringUsingStringBuilder(String str) {
		StringBuilder name = new StringBuilder(str);
		return name.reverse().toString();
	}

	// method to return a reverse String [Use : StringBuffer]
	String getReversedStringUsingStringBuffer(String str) {
		StringBuffer name = new StringBuffer(str);
		return name.reverse().toString();
	}

	public static void main(String[] args) {
		String str = "Technocredits";
		System.out.println("Input String : " + str);
		System.out.println("Reversed string using StringBuffer is : "
				+ new StringReverse().getReversedStringUsingStringBuffer(str));
		System.out.println("Reversed string using StringBuilder is : "
				+ new StringReverse().getReversedStringUsingStringBuffer(str));
	}
}
