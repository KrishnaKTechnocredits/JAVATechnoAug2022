package monali;

public class Modular {

	
		int count=0;
		@SuppressWarnings("unused")
		void ProcessDataInfo( int Start_Index,  int End_Index)
		{
			for (int i=End_Index;i>=Start_Index;i--)
			{
				if(i%3==0 && i%7==0) {
					System.out.println("The last number divisble by 3 & 7 are:"+i);
				count++;
				}
				if(count==3)
				break;
			}
		}
		public static void main(String[] args) {
		
			Modular modular=new Modular();
			modular.ProcessDataInfo(10, 200);
			
	}

}
