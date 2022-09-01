package shivaniLikhia;

public class SimpleInterest {
	
	void countSimpleInterest(int p,double t,double r){
		double simpleInterest=(p*t*r)/100;
		System.out.println("The Simple Interest for the given Amount is : " + simpleInterest);
	}
	
	public static void main(String[] args){
		new SimpleInterest().countSimpleInterest(10000,2.5,1.5);
	}
}
