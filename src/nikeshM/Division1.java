package nikeshM;

public class Division1 {
		void processData (int startData, int endData){
			int count = 0;
			for (int index= endData; endData>=startData ; index --){
				if (index%3==0 && index%7==0){
					System.out.println (index + "");
					count++;
				
				if (count ==3)
					break;
				}
			}
		}
	
		public static void main (String [] args){
			Division1 data = new Division1();
			data.processData(10, 200);
			
		}

}



