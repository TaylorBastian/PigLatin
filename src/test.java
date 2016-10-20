import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence:");

		String x = sc.nextLine();
		String[] pigLatin;
		String[] splitX = x.split(" ");
		pigLatin = new String[splitX.length];
		// break up into words
		for (int i = 0; i < splitX.length; i++) {
			pigLatin[i] = "";
			// remove spaces
			splitX[i] = splitX[i].replaceAll("\\s", "");

			// first letter to char
			char z = splitX[i].charAt(0);

			// If word starts with vowel
			if (z == 'a' || z == 'e' || z == 'i' || z == 'o' || z == 'u') {
				pigLatin[i] = splitX[i] + "yay";
			}

			// If it starts with a consante
			else {
				int num = 0;
				for (int g = 0; g < splitX[i].length(); g++) {
					char r = splitX[i].charAt(g);
					// finds when a vowel exists
					if (r == 'a' || r == 'e' || r == 'i' || r == 'o' || r == 'u') {
						num = g;
						break;
					}
				}

				for (int g = num; g < splitX[i].length(); g++) {
					pigLatin[i] = pigLatin[i] + splitX[i].substring(g, g + 1);
				}

				for (int g = 0; g < num; g++) {
					pigLatin[i] = pigLatin[i] + splitX[i].substring(g, g + 1) + "ay";
				}
				pigLatin[i]=pigLatin[i].toLowerCase();

			}
		}
		for(int i=0;i<pigLatin.length;i++){
			System.out.print(pigLatin[i]+" ");
		}
	}

}
