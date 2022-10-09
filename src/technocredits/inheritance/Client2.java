package technocredits.inheritance;

public class Client2 extends Client1{

	Client2(){
		super();
		processData();
	}
	
	void display() {
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Client2 client2 = new Client2();
		client2.display();
	}
	
}
