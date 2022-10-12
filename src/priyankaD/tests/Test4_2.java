package priyankaD.tests;
//Program 2 : Return count of visible trees.
//input : {3,5,11,9,10,13}
//output : 4
public class Test4_2 {
	     int totalTreeVisible(int[] arr) {
	    	 int max=0;
	    	 int count=0;
	    	 for(int index=0;index<arr.length;index++) {
	    		 if(max<arr[index]) {
	    			 max=arr[index];
	    			 count++;
	    		 }
	    	 }return count;
	     }
	     public static void main(String[] args) {
	    	 int[] arr= {3,5,11,9,10,13};
	    	 int out=new Test4_2().totalTreeVisible(arr);
	    	 System.out.println("Total trees visible-->"+out);
	     }
}
