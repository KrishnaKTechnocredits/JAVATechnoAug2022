package deepakBorse.Assignments;

public class Palendrome {
	boolean isPalendrome(String str) {
		boolean ispalendrome=false;
		String str2="";
		for(int index=str.length()-1;index>=0;index--) {
			str2=str2+str.charAt(index);
		
		}
		if(str2.equals(str)) {
			ispalendrome=true;
		}
		return ispalendrome;
	}

	void printpalendrome(String str) {
		boolean ispalendrome=isPalendrome(str);
		if(ispalendrome==true) {
			System.out.println("String '"+str+"' is Palendrome");
		}
		else 
			System.out.println("String '"+str+"' is not Palendrome");
				
	}
	
	public static void main(String[] args) {
		Palendrome palendrome=new Palendrome();
		
		palendrome.printpalendrome("radar");
		
	}
}


