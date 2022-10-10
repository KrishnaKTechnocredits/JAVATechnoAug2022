package nehaniG;

public class Assignment25 {

	
		void getRepeatedWord(String name) {
			String[] input = name.split(" ");
			String repeatedWords = "";
			for (int index = 0; index < input.length; index++) {
				for (int i = index + 1; i < input.length; i++) {
					if (index != i && input[index].equals(input[i])) {
						repeatedWords += input[i] + " ";
						break;
					}
				}
			}
			System.out.println(repeatedWords);
		}

		void getNonRepeatedNames(String str) {
			String[] input = str.split(" ");
			String nonRepeated = "";
			for (int i = 0; i < input.length; i++) {
				boolean isRepeated = false;
				for (int j = 0; j < input.length; j++) {
					if (i != j && input[i].equals(input[j])) {
						isRepeated = true;
						break;
					}
				}
				if (!isRepeated) {
					nonRepeated += input[i] + " ";
				}
			}
			System.out.println(nonRepeated);
		}

		public static void main(String[] args) {
			Assignment25 assignment25 = new Assignment25();
			String input = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
			System.out.println("Repeated Words are : ");
			assignment25.getRepeatedWord(input);
			System.out.println("---------------------------------------------");
			System.out.println("NonRepeated Words are : ");
			assignment25.getNonRepeatedNames(input);
		}
	}
