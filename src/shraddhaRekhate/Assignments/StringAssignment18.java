package shraddhaRekhate.Assignments;

public class StringAssignment18 {
	
		String getAllDigitAllCharString(String name) {
			String getString="";
			String getAllDigits="";
		    String getAllChar="";
		  for(int i=0;i<name.length();i++) {
			  char ch=name.charAt(i);
			  if(Character.isDigit(ch)) {
				  getAllDigits=getAllDigits+ch;
			  }else {
				  getAllChar=getAllChar+ch;
			  }
		  }
		  return getAllDigits+getAllChar;
		}
		
		String rearrangeStringInGivenFormat(String name) {
			String uppercase="";
			String getAllDigits="";
		    String lowercase="";
		  for(int i=0;i<name.length();i++) {
			  char ch=name.charAt(i);
			  if(Character.isUpperCase(ch)) {
				  uppercase=uppercase+ch;
			  }else if(Character.isLowerCase(ch)) {
				  lowercase=lowercase+ch;
			  }else {
				  getAllDigits=getAllDigits+ch;
			  }
		  }
		  return uppercase+getAllDigits+lowercase;
		}
		
		int getFrequency(String name,char target) {
			name.toLowerCase();
			int count=0;
		  for(int i=0;i<name.length();i++) {
			  char ch=name.charAt(i);
			  if(ch==target) {
				 count++; 
			  }
		  }
		  return count;
		}
		
		public static void main(String[] args) {
			StringAssignment18 obj= new StringAssignment18();
			String temp=obj.getAllDigitAllCharString("Shara6473dd65884ha");
			System.out.println(temp);
			
			String temp2=obj.rearrangeStringInGivenFormat("ShRADD574784ha");
			System.out.println(temp2);
			
			int temp3=obj.getFrequency("Shraddha", 'a');
			System.out.println(temp3);
		}
	}

