package shraddhaRekhate.Assignments;

public class StringAssignment {
	    int getNameLength(String name) {
	    	int length=name.length();
	    	return length;
	    }
	    
	    char getMiddleChar(String name) {
	    	int length=name.length();
	    	int index=0;
	    	if(length%2==0) {
	    		index=length/2-1;
	    	}else {
	    		index=length/2;
	    	}
	    	return name.charAt(index);
	    }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			StringAssignment stringAssignment= new StringAssignment();
			int length=stringAssignment.getNameLength("Shraddha");
			System.out.println("Length of the string is: " + length);
			
			char String=stringAssignment.getMiddleChar("Shraddha");
			System.out.println("Middle chracter of string is: " + String);
		}
}

