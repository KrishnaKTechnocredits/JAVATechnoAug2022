package priyankaD.stringType;
//Assignment_18_3 Find frequency of given character from given String. 
//String str = "TechnoTtcredits";
//char targetChar = 't';
//output : 4
public class GetFrequencyOfLetter {
       int getFrequencyOfLetter(String input,char ch) {
    	   input=input.toLowerCase();
    	   int count=0;
    	   for(int index=0;index<input.length();index++) {
    		   char c=input.charAt(index);
    		   if(c==ch) {
    			   count++;
    		   }
    	   }
    		   return count;
       }
       public static void main(String[]args) {
    	   int output=new GetFrequencyOfLetter().getFrequencyOfLetter("TechnoTtcredits",'t');
    	   System.out.println(output);
       }
}
