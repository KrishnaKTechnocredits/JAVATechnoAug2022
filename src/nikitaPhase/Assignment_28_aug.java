package nikitaPhase;

public class Assignment_28_aug {
		int index;
		int count = 0;
		void ProcessData(int startIndex,int endIndex) 
		{
			
			for( index= startIndex; index<endIndex; index++) 
			{
				if(index % 3 == 0 && index % 7 == 0) 
					{
					System.out.println("Number "+ index + " id divisible by 3 and 7");
				    count++;
					}
			if(count == 3) 
			     break;
			}
		}
		public static void main(String[] args) {
			Assignment_28_aug assignment_28_aug = new Assignment_28_aug ();
			assignment_28_aug.ProcessData(20,100);
		}
}