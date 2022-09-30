package chaitanyaMankar.SwitchCase;

/*Assignment - 28 : 25th Sep'2022

**********************************************************************************
Program 1 : [10 mins - 13 mins]
Return count of vowels in a given String using switch case.

input : TechnOcredits
output : 4

**********************************************************************************
Program 2 : [10 mins]
Return first vowel from given String.

input : technocredits
outout : e

**********************************************************************************
Program 3: [15 mins]
Print count of each vowels in a given String using switch case.

input : technocredits
output : e -> 2
         o -> 1
		 i -> 1
		 
**********************************************************************************	 
Program 4: [15 mins]
Print count of each vowels in a given String Array using switch case.

input : {"technocredits", "swati", "aashvi"}
output : vowel count in technocredits:
		 e -> 2
         o -> 1
		 i -> 1
		 vowel count in swati:
		 a -> 1
         i -> 1
		 vowel count in aashvi:
		 a -> 2
         i -> 1*/
public class SwtchCse 
{
	int Prgm1(String Name)
	{
		int count=0;
		for(int index = 0;index<Name.length();index++)
		{
			char ch = Name.charAt(index);
			switch(ch)
			{
			case 'a':
				count++;
				break;
			case 'A':
				count++;
				break;
			case 'e':
				count++;
				break;
			case 'E':
				count++;
				break;
			case 'i':
				count++;
				break;
			case 'I':
				count++;
				break;
			case 'o':
				count++;
				break;
			case 'O':
				count++;
				break;
			case 'u':
				count++;
				break;
			case 'U':
				count++;
				break;
			}
		}
		return count;
	}
	
	char Prgm2(String Name)
	{
		int count=0;
		for(int index = 0;index<Name.length();index++)
		{
			char ch = Name.charAt(index);
			switch(ch)
			{
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				return ch;
			}
		}
		return 0;
	}
	void Prgm3(String Name)
	{
		int a=0, e=0, i=0, o=0, u=0;
		for(int index = 0;index<Name.length();index++)
		{
			char ch = Name.charAt(index);
			switch(ch)
			{
			case 'a':
				a++;
				break;
			case 'A':
				a++;
				break;
			case 'e':
				e++;
				break;
			case 'E':
				e++;
				break;
			case 'i':
				i++;
				break;
			case 'I':
				i++;
				break;
			case 'o':
				o++;
				break;
			case 'O':
				o++;
				break;
			case 'u':
				u++;
				break;
			case 'U':
				u++;
				break;
			}
		}
		System.out.println("a: "+a);
		System.out.println("e: "+e);
		System.out.println("i: "+i);
		System.out.println("o: "+o);
		System.out.println("u: "+u);
	}
	
	void Prgm4(String[] Arr)
	{
		int a=0, e=0, i=0, o=0, u=0;
		
		for(int index = 0;index<Arr.length;index++)
		{
			String ind = Arr[index];
			for(int jindex=0;jindex<ind.length();jindex++)
			{
			char ch = ind.charAt(jindex);
			
			switch(ch)
			{
			case 'a':
				a++;
				break;
			case 'A':
				a++;
				break;
			case 'e':
				e++;
				break;
			case 'E':
				e++;
				break;
			case 'i':
				i++;
				break;
			case 'I':
				i++;
				break;
			case 'o':
				o++;
				break;
			case 'O':
				o++;
				break;
			case 'u':
				u++;
				break;
			case 'U':
				u++;
				break;
			}
			}
			System.out.println("String Name: "+ind);
		
		
		System.out.println("a: "+a);
		System.out.println("e: "+e);
		System.out.println("i: "+i);
		System.out.println("o: "+o);
		System.out.println("u: "+u);
	}
	}
	
	
	public static void main(String[] args)
	{
		SwtchCse sc = new SwtchCse();
		/*int num = sc.Prgm1("TechnOcredits");
		System.out.println("Number of Vowels: "+num);
		char ch = sc.Prgm2("TechnOcredits");
		System.out.println("First Vowel: "+ch);
		sc.Prgm3("technocredits");*/
		String[] arr = {"technocredits", "swati", "aashvi"};
		sc.Prgm4(arr);
	}
}
