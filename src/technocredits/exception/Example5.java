package technocredits.exception;

public class Example5 {

	void processData() {
		String str = "";
		try {
			System.out.println(1);
			str = "10" + "20";
			int num = Integer.parseInt(str);
			String[] arr = { "Maulik", "Techno" };
			System.out.println(arr[num]);
			System.out.println(arr[0]);
		} catch (StringIndexOutOfBoundsException siob) {
			System.out.println(2);
			System.out.println(str);
		}
		catch(IndexOutOfBoundsException ie) {
			System.out.println(5);
		}catch (Exception e) {
			System.out.println(3);
		}
		System.out.println(33);
		System.out.println(4);
	}
	
	public static void main(String[] args) {
		new Example5().processData();
	}
	
}
