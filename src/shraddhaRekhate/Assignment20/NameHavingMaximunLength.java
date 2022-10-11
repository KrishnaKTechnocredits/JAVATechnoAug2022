package shraddhaRekhate.Assignment20;

public class NameHavingMaximunLength {
  String maxLengthName(String[] arr) {
	  int max=0;
	  String maxLengthWord="";
	    	 for(int index=0;index<arr.length;index++) {
	    		 if(arr[index].length()>max) {
	    			 maxLengthWord=arr[index];
	    		 }
	    	 }
	    	 return maxLengthWord;
	     }
		
		public static void main(String[] args) {
			NameHavingMaximunLength maximum=new NameHavingMaximunLength();
			String[] str= {"Ashish","Aditty","Manjiri","Ankita","Credits"};
		    System.out.println("Maximumlength string is: "+maximum.maxLengthName(str));
  }
}
