package anujaD;

public class DivisibleNumber {
	
	void Processdata(int Start,int end) {
		int count = 0;
		
		for(int Index=end;Index>=Start;Index--) {
			if(Index % 3 == 0 && Index % 7 == 0) {
				
				System.out.println("num is divided by 3 and 7: " +Index);
				count++;
			   }
			if(count == 3)
				break;
			}	
		}
		public static void main(String[] args) {
			DivisibleNumber divisiblenumber = new DivisibleNumber();
			divisiblenumber.Processdata(10,200);
			
		}
	}
