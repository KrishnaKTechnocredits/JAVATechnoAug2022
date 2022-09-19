package hemanshi;

public class MiddleName {
	int i;

	char getMiddlechar(String name) {
		 if(name.length()%2==0)
			 i=name.length()/2-1;
		 else
			 i=name.length()/2;

		 return name.charAt(i);
	}

	public static void main(String[] args) {
		MiddleName middleName=new MiddleName();
		System.out.println(middleName.getMiddlechar("Maulik"));
		System.out.println(middleName.getMiddlechar("Technocredits"));
		System.out.println(middleName.getMiddlechar("Hemanshi"));
	}

}

