
//Program 3 : Write a method to return even position characters from given String in reverse.
//input : technocredits
//output : tdrohe


package sohail.stringprograms;

public class EvenCharReverse {
	String rev="";
	String getEvenCharReverse(String str) {
		for(int index=str.length(); index>=0;index--) {
			if(index%2==0) {
				char evenstr=str.charAt(index);
				System.out.print(evenstr);
				for (int index1=str.length()-1; index1>=0 ; index1 --) {
					rev=rev+str.charAt(index);	
					
				}	
			}				
		}
		//System.out.print(rev);
		return str;		
	}
	public static void main(String[] args) {
		EvenCharReverse evencharreverse=new EvenCharReverse();
		evencharreverse.getEvenCharReverse("technocredits");
	}

}
