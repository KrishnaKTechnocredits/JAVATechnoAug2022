package priyankaD;

public class ParameterizedMethods {
	void processData(int p, int T, int R ) {
		//p=principle T=time R=Rate
		int i=0;
		i=(p*T*R)/100; //i=simple interest
		System.out.println(i);
	}
	void processData(double f) {
		double c=0;
		c=((f-32)*5)/9;
		System.out.println(c);
	}
	public static void main(String[]args) {
		ParameterizedMethods pm=new ParameterizedMethods();
		pm.processData(1000,2,5);
		pm.processData(98.6);
	}
}
