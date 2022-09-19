package anujaD;

public class Testloop {

	void Processdata(int Start,int end) {
	int count = 0;

	for(int Index=Start;Index<=end;Index++) {
		if(Index % 3 == 0 && Index % 7 == 0) {

			System.out.println("num is divided by 3 and 7: " +Index);
			count++;
		   }
		if(count == 3)
			break;
		}	
	}
	public static void main(String[] args) {
		Testloop testloop = new Testloop();
		testloop.Processdata(20,100);

	}
}