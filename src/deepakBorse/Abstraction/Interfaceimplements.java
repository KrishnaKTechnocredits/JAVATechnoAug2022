package deepakBorse.Abstraction;

public class Interfaceimplements implements Interfaceexample {

	@Override
	public void print() {
		System.out.println("Hello");
		
	}
	public static void main(String[] args) {
	Interfaceimplements interfaceimple=new Interfaceimplements();
	
	interfaceimple.print();
	interfaceimple.getsthedetail(100);
	}
	@Override
	public void getsthedetail(){
		System.out.println("This is get details method");
		
	}
	
	public void getsthedetail(int x){
		System.out.println("This is with integer parameter method "+x);
		
	}
}
