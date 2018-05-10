import java.io.InputStreamReader;
import java.util.Scanner;

public class JumpArrayGame {

	static void print(String str) {
		System.out.println(str);
	}

	public static void main(String args[]) {
		InputStreamReader cin = new InputStreamReader(System.in);
		Scanner input = new Scanner(cin);
		int testCases = input.nextInt();
		int n, m;

		while (testCases-- > 0) {
			n = input.nextInt();
			m = input.nextInt();
			int arr[] = new int[n];
			int i = 0;

			for (i = 0; i < n; i++) {
				arr[i] = input.nextInt();
			}

			for (i = 0; i < n;) {
				if (i + m > n - 1) {
					print("YES");
					break;
				}

				if (arr[i + m] == 0) {
					i = i + m;
					continue;
				}
				if (i != 0 && arr[i - 1] == 0 && arr[i + m - 1] == 0) {
					i = i + m - 1;
					continue;
				}
				if (arr[i + 1] == 0) {
					i = i + 1;
					continue;
				}
				print("NO");
				break;
			}

		}
		input.close();
	}
}
