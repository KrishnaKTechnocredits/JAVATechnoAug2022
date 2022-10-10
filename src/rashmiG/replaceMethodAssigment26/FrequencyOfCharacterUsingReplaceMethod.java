/*Assignment - 26 : 21st Sep'2022

find out frequency of each character from given input using single while loop.
String str = "technocreditst";*/

package rashmiG.replaceMethodAssigment26;

class FrequencyOfCharacterUsingReplaceMethod{
	void printFrequencyOfEachCharcter(String str){
		 str=str.toLowerCase();
		while(str.length()>0){
			int originalLength=str.length();
			String ch = Character.toString(str.charAt(0));
			str=str.replace(ch,"");
			int newLength=str.length();
			System.out.println(ch+"->"+(originalLength-newLength));
		}
	}
	
	public static void main(String[] args){
		FrequencyOfCharacterUsingReplaceMethod freOfChar = new FrequencyOfCharacterUsingReplaceMethod();
		freOfChar.printFrequencyOfEachCharcter("technocreditst");
		System.out.println("====================================");
		freOfChar.printFrequencyOfEachCharcter("Ra45ShMA))iGrganachari");
	}
}