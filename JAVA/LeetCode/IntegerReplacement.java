package leetCode;

import java.util.HashMap;

public class IntegerReplacement {

	HashMap<String, Integer> mHashMap = new HashMap<String, Integer>(32);

	public static void main(String args[]) {
		IntegerReplacement object = new IntegerReplacement();
		int value = 2147483645;
		System.out.println("Result : " + object.integerReplacement(value));
	}

	private int min(int a, int b) {
		return (a < b) ? a : b;
	}

	public int integerReplacement(int n) {

		int value = 0;
		String str = "" + n;

		if (mHashMap.containsKey(str))
			return mHashMap.get("" + n).intValue();

		if (n == 1)
			return 0;
		if (n == 2)
			return 1;
		if (n % 2 == 0) {
			value = integerReplacement(n / 2) + 1;
			mHashMap.put(new String("" + n), new Integer(value));
			return value;
		} else {
			if (n != 2147483647) {
				int lhs = integerReplacement(n - 1) + 1;
				int rhs = integerReplacement(n + 1) + 1;
				value = min(lhs, rhs);
			} else
				value = 32;
			mHashMap.put(new String("" + n), new Integer(value));
			return value;
		}
	}
}
