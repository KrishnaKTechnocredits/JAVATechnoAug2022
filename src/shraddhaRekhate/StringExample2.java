package shraddhaRekhate;

public class StringExample2 {
    String getReverseString(String name) {
        String rev="";
        for(int index=name.length()-1;index>=0;index--) {
        	rev=rev+name.charAt(index);
        	
        }
    	return rev;
    }
    
    String getEvenPositionChar(String name) {
    	 String evenPositionChar="";
    	for(int index =0;index<=name.length()-1;index++) {
    		if(index%2!=0) {
    			evenPositionChar=evenPositionChar+name.charAt(index);
    		}
    	}
    	return evenPositionChar;
    }
    
    int getCountOfTheDigits(String name) {
    	int getCount=0;
    	for(int i=0;i<name.length();i++) {
    	char ch=name.charAt(i);
    	if(Character.isDigit(ch)) {
    		getCount++;
    	}
    }
    	return getCount;
    }
    
    int getSumOfDigits(String name) {
    	int getSum=0;
    	for(int i=0;i<name.length();i++) {
        	char ch=name.charAt(i);
        	if(Character.isDigit(ch)) {
        		getSum=getSum+Character.getNumericValue(ch);
        	}
        }
    	return getSum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringExample2 obj= new  StringExample2();
		String temp1= obj.getReverseString("Shraddha");
		System.out.println(temp1);
		
		String temp2=obj.getEvenPositionChar("Shraddha");
		System.out.println(temp2);
		
		String temp3=obj.getReverseString(temp2);
		System.out.println(temp3);
		
		int temp4=obj.getCountOfTheDigits("Shr12a4d7dha");
		System.out.println(temp4);
		
		int temp5=obj.getSumOfDigits("Shr12a4d7dha");
		System.out.println(temp5);
		
		
		
	}

}
