package gauravSahu.practiceJanuray2023;

public class practice21 {
	
	public static void main(String[] args) {
		String[] num = { "11211211", "12221", "141", "1321" };
		
		for(String number : num) {		
			String num1 = String.valueOf(number);
			boolean flag =  true; 
			for(int i = 0 , j = num1.length()-1; i<j ; i++, j--) {
				if(num1.charAt(i)!=num1.charAt(j)) {
					flag = false;
				}
			}if(flag) {
				System.out.println("It is pallindrome" + number);
			}
		}
	}

}
