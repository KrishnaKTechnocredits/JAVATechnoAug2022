package harshalRane.practise;

public class HappyTeachersDay {

	static String teacher(String str) {
		if (str == "Maulik") {
			System.out.println("Happy Teacher's Day ");
			System.out.println("-------------------");
		}else if(str == "Krishna") {
			return str;
		}else if(str == "Harsh") {
			return str;
		}
		return str;
	}

	public static void main(String[] args) {
		String value = teacher("Maulik");
		String value1 = teacher("Krishna");
		String value2 = teacher("Krishna");
		System.out.println(value);
		System.out.println(value1);
		System.out.println(value2);
	}
}
