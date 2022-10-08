package technocredits.exception;

public class Example9 {

	void m1(int[] arr){
		try{
			System.out.println(arr[2]);
			System.out.println("techno");
			System.exit(0);
		}catch(ArrayIndexOutOfBoundsException ae){
			System.out.println(ae.getMessage());
			System.exit(0);
		}finally {
			System.out.println("Hello");
		}
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		int[] num = new int[]{10,20,30};
		new Example9().m1(num);
	}
}
