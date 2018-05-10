package leetCode;

public class ReverseString344 {

	public static void main(String args[]) {
		System.out.println("Aditya = "
				+ ReverseString344.reverseString("Aditya"));
	}

	private static String reverseString(String s) {
		int strlen = s.length();
		char tempString[] = s.toCharArray();
		int mid = (strlen % 2 == 0) ? (strlen / 2) - 1 : (strlen / 2);
		for (int i = 0; i <= mid; i++) {
			char temp = tempString[i];
			tempString[i] = tempString[strlen - i - 1];
			tempString[strlen - i - 1] = temp;
		}
		return new String(tempString);
	}
}