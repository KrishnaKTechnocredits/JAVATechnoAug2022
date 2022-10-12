/*Assignment - 36 : 9th Oct'2022

Program 6 : 
Print all characters having ascii value 91 ot 96.

output : 91 -> [
         92 -> \
         93 -> ]	*/

package rashmiG.Assignment36ASCIIPrograms;

public class FetchAllCharctersWithinAsciiRange {

	void printAllCharctersFromAscii(int startAscii, int endAscii) {

//		for(startAscii=startAscii;startAscii <= endAscii; startAscii++) {
//			char ch = (char) startAscii;
//			System.out.println(startAscii + " --> " + ch);
//	}

		for (int ascii = startAscii; ascii <= endAscii; ascii++) {
			char ch = (char) ascii;
			System.out.println(ascii + " --> " + ch);
		}
	}

	public static void main(String[] args) {
		new FetchAllCharctersWithinAsciiRange().printAllCharctersFromAscii(91, 96);
	}
}