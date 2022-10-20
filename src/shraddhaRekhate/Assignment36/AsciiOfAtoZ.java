package shraddhaRekhate.Assignment36;
//Program 3 : 
//WAP to print ascii value of A->Z.
//
//output : A -> 65
//         B -> 66
//		 .
//		 .
//		 Z -> 90

public class AsciiOfAtoZ {
	void printAsciiVAluesOfAtoZ() {
		System.out.println("Ascii values of 'A' to 'Z' are:");
		for(char ch='A';ch<='Z';ch++) {
			int asciiValue=ch;
			System.out.println(ch+"->"+asciiValue);
		}
	}
public static void main(String[] args) {
	AsciiOfAtoZ asciiValueAtoZ=  new AsciiOfAtoZ();
	asciiValueAtoZ.printAsciiVAluesOfAtoZ();
}
}
