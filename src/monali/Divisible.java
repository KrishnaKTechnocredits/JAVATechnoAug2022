package monali;

class Divisible
{
	int count=0;
	
 void ProcessData (int Start_index,int end_index) {
	
	for(int i=Start_index;i<end_index;i++)
	{
		if(i%3==0 && i%7==0) {
			System.out.println("The first three numbers divisble by 3 and 7 are:"+i);
			count++;
		}
		if(count==3)
			break;
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Divisible divisble=new Divisible();
divisble.ProcessData(20,100);
	}

}
