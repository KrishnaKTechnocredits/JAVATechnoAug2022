package shraddhaRekhate.Assignment25;

public class NonRepeatedWords {
	void assignment25b(String str) {
	       String[] arr=str.split(" ");
	       for(int index=0;index<arr.length;index++){
	    	   int count=1;
		       for(int j=1;j<arr.length;j++) {
		    	   if(arr[index].equalsIgnoreCase(arr[j]) && arr[index]!=arr[j]) {
		    		   count++;
		    		   arr[j]="";
		        }
		       }
		       if(count==1) {
	    		   System.out.println(arr[index]);
	    	   }
			 }
	       
		}

	public static void main(String[] args) {
		NonRepeatedWords obj2=new NonRepeatedWords();
		String str="Maulik Puja Hindavi Shubham Puja Hindavi";
		System.out.println("Non repeated words in the given string are:");
		obj2.assignment25b(str);

	}

}
