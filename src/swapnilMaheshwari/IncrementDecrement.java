package swapnilMaheshwari;

public class IncrementDecrement {

	public static void main(String[] args) {
		int i = 11;
		i = i++ + ++i;
		System.out.println(i);
		System.out.println("----------------------");
		int m = 1010;
		int n = 1010;
		System.out.println(m++ / ++n * n-- / --m);
		int x = 10;
		int y = x++ + x++;
		System.out.println(y);
		System.out.println(x);

	}

}
