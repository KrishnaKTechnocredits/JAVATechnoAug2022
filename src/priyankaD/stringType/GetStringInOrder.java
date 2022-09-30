package priyankaD.stringType;
//Assignment18_2
//Write a program to rearrange String in given format. 
//input = "t8EcHNo5Cred3iTs";
//output : EHNCT853tcoredis
public class GetStringInOrder {
	String getStringInOrder(String input) {
	    	  String getUpperCase="";
	    	  String getDigits="";
	    	  String getLowerCase="";
	    	  String out="";
	    	  for(int index=0;index<input.length();index++) {
	    		  char ch=input.charAt(index);
	    		  if(Character.isUpperCase(ch)) {
	    			  getUpperCase=getUpperCase+ch;
	    		  }else if(Character.isDigit(ch)) {
	    			  getDigits=getDigits+ch;
	    		  }else if(Character.isLowerCase(ch)) {
	    			  getLowerCase=getLowerCase+ch;
	    		  }
	    	  }
	    	  out=getUpperCase+getDigits+getLowerCase;
	    	 return out;
	    	}
	    public static void main(String[]args) {
	    	String out=new GetStringInOrder().getStringInOrder("t8EcHNo5Cred3iTs");
	    	System.out.println(out);
	    }
	}

