package gauravSahu;



class Calci{
	int n1=100;
	int n2=50;
	int ans=0;
	
	
	void add(){
		ans=n1+n2;
		System.out.println("Addition is "+ans);
	}
	void mul(){
		ans=n1*n2;
		System.out.println("Multiplication is "+ans);
	}
	void sub(){
		ans=n1-n2;
		System.out.println("Subtraction is "+ans);
	}
	void div(){
		ans=n1/n2;
		System.out.println("Division is "+ans);
	}
	
public static void main(String[] args){
	Calci Cal =new Calci();
	Cal.add();
	Cal.mul();
	Cal.sub();
	Cal.div();
   }
}
	