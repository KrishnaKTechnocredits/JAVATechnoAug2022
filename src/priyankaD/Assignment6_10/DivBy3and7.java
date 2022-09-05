package priyankaD.Assignment6_10;

public class DivBy3and7 {
	
    void processData(int startR, int endR) {
		int count=0;
		for(int index=startR;index<=endR;index++) { 
			if(index%3==0 && index%7==0) {
				count++;
				System.out.println(index);
	    } 
		 if(count==3)
			 break;
		 }
	}

		public static void main(String[]args) {
			DivBy3and7 div=new DivBy3and7();
			div.processData(20,100);
		}
	}
