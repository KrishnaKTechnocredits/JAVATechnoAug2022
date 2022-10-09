package technocredits.exception;

import java.util.Scanner;

public class Example6 {

	void m1() {
		Scanner sc = new Scanner(System.in);
		try {
			// DB Code
			System.out.println(1);
			String[] arr = {"Hi","Hello"};
			int num = sc.nextInt(); // 5
			int ans = 10/num;
			System.out.println(ans);
			System.out.println(arr[ans]);
			ans = Integer.parseInt(arr[0]);
			System.out.println(ans);
			System.out.println(6);
		}finally {
			System.out.println(2);
			sc.close();
		}
		System.out.println(7);
	}
	
	public static void main(String[] args) {
		new Example6().m1();
	}
}
