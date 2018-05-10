package sorts;

/*
 * Implementation of Merge Sort
 * algorithm using recursion.
 */

import java.util.Scanner;

public class MergeSort {

	public static void mergeSort(int arr[]) {
		int leftStart = 0;
		int rightEnd = arr.length - 1;
		int temp[] = new int[arr.length];
		mergeSort(arr, temp, leftStart, rightEnd);
	}

	public static void mergeSort(int[] arr, int[] temp, int leftStart, int rightEnd) {

		if (leftStart >= rightEnd)
			return;

		int middle = (leftStart + rightEnd) / 2;
		mergeSort(arr, temp, leftStart, middle);
		mergeSort(arr, temp, middle + 1, rightEnd);
		mergeHalves(arr, temp, leftStart, rightEnd);

	}

	public static void mergeHalves(int[] arr, int[] temp, int leftStart, int rightEnd) {
		int middle = (leftStart + rightEnd) / 2;
		int left = leftStart;
		int right = middle + 1;
		int leftEnd = middle;
		int index = leftStart;

		while (left <= leftEnd && right <= rightEnd) {
			if (arr[left] < arr[right]) {
				temp[index] = arr[left];
				left++;
			} else {
				temp[index] = arr[right];
				right++;
			}
			index++;
		}

		System.arraycopy(arr, left, temp, index, leftEnd - left + 1);
		System.arraycopy(arr, right, temp, index, rightEnd - right + 1);
		System.arraycopy(temp, leftStart, arr, leftStart, rightEnd - leftStart + 1);
	}

	public static void main(String[] args) {
		System.out.print("Enter number of elements : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = scanner.nextInt();

		mergeSort(arr);

		System.out.println("Sorted Array is : ");
		for (int i : arr)
			System.out.print(i + " ");

		scanner.close();
	}
}