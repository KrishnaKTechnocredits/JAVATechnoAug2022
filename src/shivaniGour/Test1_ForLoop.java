package shivaniGour;
public class Test1_ForLoop {
	void processData(int startrange, int endrange){
		int count=0;
		System.out.println("First 3 Nos. divisible by 3 and 7: ");
		 for(int i=startrange;i<=endrange;i++){
			 if(i%3==0 && i%7==0){
				 System.out.println(i);
				 count++;
				 }
			 if(count==3)
				 break;	 
		 }
	 }
	public static void main(String[] args) {
		new Test1_ForLoop().processData(20, 100);
	}
}
