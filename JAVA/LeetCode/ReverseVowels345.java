package leetCode;

public class ReverseVowels345 {

	public static void main(String args[]) {
		ReverseVowels345 object = new ReverseVowels345();
		System.out.println("Aditya = " + object.reverseVowels("Aditya"));
	}

	private boolean isVowel(char c) {
		return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
				|| c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
	}

	private String reverseVowels(String s) {
		int strlen = s.length();
		char input[] = s.toCharArray();
		boolean ivf = false, jvf = false;
		for (int i = 0, j = strlen - 1; i < j;) {
			if (isVowel(input[i]))
				ivf = true;
			else
				i++;
			if (isVowel(input[j]))
				jvf = true;
			else
				j--;

			if ((ivf == true) && (jvf == true)) {
				char temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				ivf = false;
				jvf = false;
				i++;
				j--;
			}

		}
		return new String(input);
	}
}