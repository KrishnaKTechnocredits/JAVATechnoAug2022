package shraddhaRekhate.Assignment25;

public class RepeatedWordInString {
	
		void assignment25(String str) {
	       String[] arr=str.split(" ");
	       for(int index=0;index<arr.length;index++){
	    	   int count=1;
		       for(int j=1;j<arr.length;j++) {
		    	   if(arr[index].equalsIgnoreCase(arr[j]) && arr[index]!=arr[j]) {
		    		   count++;
		    		   arr[j]="";
		        }
		       }
		       if(count>1) {
	    		   System.out.println(arr[index]);
	    	   }
			 }
	       
		}
		public static void main(String[] args) {
			RepeatedWordInString obj=new RepeatedWordInString();
			String str="Maulik Puja Hindavi Shubham Puja Hindavi";
			System.out.println("Repeated words in the given string are:");
			obj.assignment25(str);
		}
}
