import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class SparseArrays {

	public static void main(String args[]) {
		InputStreamReader cin = new InputStreamReader(System.in);
		Scanner mScanner = new Scanner(cin);
		int inputArrayLength = Integer.parseInt(mScanner.nextLine());
		String inputArray[] = new String[inputArrayLength];

		HashMap<String, Integer> hmap = new HashMap<String, Integer>();

		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = mScanner.nextLine();
			if (hmap.containsKey(inputArray[i])) {
				Integer value = hmap.get(inputArray[i]);
				value = value + 1;
				hmap.put(inputArray[i], value);
			} else {
				hmap.put(inputArray[i], 1);
			}
		}

		int queryLength = Integer.parseInt(mScanner.nextLine());
		String queryArray[] = new String[queryLength];

		for (int i = 0; i < queryArray.length; i++) {
			queryArray[i] = mScanner.nextLine();
		}

		for (int i = 0; i < queryArray.length; i++) {
			if (hmap.containsKey(queryArray[i])) {
				System.out.println("" + hmap.get(queryArray[i]));
			} else {
				System.out.println("0");
			}
		}
		mScanner.close();
	}
}
