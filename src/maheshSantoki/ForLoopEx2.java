//divisble by 3 and 7 userdifined range print first 3 numbers 
//Assignment-10 | 28th August-2022
package maheshSantoki;

class ForLoopEx2 {
	
	void divsible(int startR,int endR) {
		int c=0;
		System.out.println("Between "+ startR + " and " + endR + " first threee numbers are divisible by 3 and 7 are : ");
		for(int i=startR;i<=endR;i++) 
		{
			if(i%3 == 0 && i%7 == 0) 
			{
				System.out.println(" "+ i );
				c++;
			}	
			if(c==3)
			break;
		}
	}
	public static void main(String[] args) {
		ForLoopEx2 forloopex2 = new ForLoopEx2();
		forloopex2.divsible(20,100);
	}
}
