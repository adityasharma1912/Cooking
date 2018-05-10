/*
 * Naive approach with n*n complexity
 */

import java.util.Scanner;

public class WaterHarvest {

	public static int findMax(int arr[]) {
		int max = -1;
		for (int i : arr) {
			if (i > max)
				max = i;
		}
		return max;
	}

	public static void main(String args[]) {
		int n;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		int max = findMax(arr);
		int matrix[][] = new int[max][n];

		// Filling matrix with given array
		for (int row = 0; row < max; row++) {
			for (int column = 0; column < n; column++) {
				if (arr[column] - (row) > 0)
					matrix[row][column] = 1;
			}
		}

		int capacity = 0;

		for (int row = 0; row < max; row++) {
			int k = -1;
			for (int column = 0; column < n; column++) {
				if (matrix[row][column] == 1) {
					if (k == -1) {
						k = column;
					} else {
						capacity = capacity + column - k - 1;
						k = column;
					}
				}
			}
		}

		System.out.println("Total water harvested = " + capacity);
		scanner.close();

	}
}