import java.math.BigInteger;
import java.util.Scanner;

public class AlterGame {

	private static String turn = "Louise";

	public static void changeTurn() {
		if (turn.equals("Louise"))
			turn = "Richard";
		else
			turn = "Louise";
	}

	private static BigInteger processN(BigInteger N) {
		if (((N.mod(new BigInteger("2")).compareTo(new BigInteger("0")))) == 0)
			return N.divide(new BigInteger("2"));
		else {
			int count = 0;
			BigInteger P = N;
			while ((N.compareTo(new BigInteger("0")) == 1)) {
				N = N.divide(new BigInteger("2"));
				count++;
			}

			BigInteger two = new BigInteger("2");
			two = two.pow(count - 1);
			return P.subtract(two);
		}
	}

	public static String getWinnerName(BigInteger N) {
		if (N.equals(1))
			return "Richard";

		while (true) {
			N = processN(N);
			if ((N.compareTo(new BigInteger("1"))) == 0)
				return turn;
			else
				changeTurn();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = Integer.parseInt(scanner.next());
		BigInteger arr[] = new BigInteger[testCases];
		for (int i = 0; i < testCases; i++)
			arr[i] = scanner.nextBigInteger();

		for (BigInteger i : arr) {
			turn = "Louise";
			System.out.println(getWinnerName(i));
		}

		scanner.close();
	}
}
