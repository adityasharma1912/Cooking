
public class RotateFunction {

	public static void main(String args[]) {
		RotateFunction object = new RotateFunction();
		int Arr[] = { 4, 3, 2, 6 };
		System.out.println("Result : " + object.maxRotateFunction(Arr));
	}

	public int maxRotateFunction(int[] A) {
		if (A.length == 0)
			return 0;
		int sum_of_digits = 0;
		int sum_of_given_array = 0;
		int max_sum = 0;

		for (int i = 0; i < A.length; i++) {
			sum_of_digits += A[i];
			sum_of_given_array += i * A[i];
		}

		max_sum = sum_of_given_array;

		for (int i = A.length - 1; i >= 1; i--) {
			sum_of_given_array = sum_of_given_array+sum_of_digits - A.length * A[i];
			if (max_sum < sum_of_given_array)
				max_sum = sum_of_given_array;
		}
		return max_sum;
	}

//	private int sumofArray(int[] A, int shift) {
//		int sum = 0;
//		for (int i = 1; i < A.length; i++) {
//			if (A[(i + shift) % A.length] != 0)
//				sum = sum + (i * A[(i + shift) % A.length]);
//		}
//		return sum;
//	}

	// private int min_index(int[] Arr) {
	// int min_value = 2147483647;
	// int min_index = 0;
	// for (int i = 0; i < (Arr.length - 1); i++) {
	// if (min_value > Arr[i]) {
	// min_value = Arr[i];
	// min_index = i;
	// }
	// }
	// System.out.println(min_index);
	// return min_index;
	// }

	// public int maxRotateFunction(int[] A) {
	//
	// if (A.length == 0)
	// return 0;
	//
	// int sum = 0;
	// int max_sum = -2147483648;
	//
	// for (int i = 0; i < A.length; i++) {
	// sum = sumofAay(A);
	// int tempArr[] = new int[A.length];
	//
	// // Rotating Function
	// for (int j = 0; j < A.length; j++) {
	// tempArr[j] = A[(A.length - 1 + j) % (A.length)];
	// }
	// A = tempArr;
	// if (sum > max_sum)
	// max_sum = sum;
	// }
	// return max_sum;
	// }

}
