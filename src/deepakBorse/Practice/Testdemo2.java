package deepakBorse.Practice;

public class Testdemo2 {
	String getstringop(String inputstring){
		String alldigit="",uppercase="",lowcase="",remainch="";
		char ch; 
		for (int i=0;i<inputstring.length(); i++){
			ch=inputstring.charAt(i);
		    if( Character.isDigit(ch)){			
				alldigit=alldigit+ch;
			}
			if(Character.isUpperCase(ch)){
				uppercase=uppercase+ch;
			}
			if(Character.isLowerCase(ch)){
				lowcase=lowcase+ch;
			}	
			if(!Character.isDigit(ch) && !Character.isLetter(ch)) {
				remainch=remainch+ch;
			}
			
		}
		return(alldigit+uppercase+lowcase+remainch);
	}

	public static void main(String[] args){
		Testdemo2 Testdemo2=new Testdemo2();
		
		String output=Testdemo2.getstringop("TeCh@12cRe!13dits&#");
		System.out.println(output);
	}

}
