package leetCode;

/*
 * Author : Aditya Sharma
 * Problem : code to find second largest and second smallest element
 * of the array in single iteration.
 */

public class SecondLargestSecondSmallest {

	public static void main(String[] args) {
		int[] nums = { 11, 12 };
		SecondLargestSecondSmallest object = new SecondLargestSecondSmallest();
		object.secondLargestSecondSmallest(nums);
	}

	private void secondLargestSecondSmallest(int[] arr) {

		if (arr.length <= 1) {
			System.out
					.println("Can't find second largest or second smallest element in array of single item");
			return;
		}

		int largest, second_largest, smallest, second_smallest;
		largest = second_largest = Integer.MIN_VALUE;
		smallest = second_smallest = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) {
				second_smallest = smallest;
				smallest = arr[i];
			} else if (arr[i] < second_smallest) {
				second_smallest = arr[i];
			}

			if (arr[i] > largest) {
				second_largest = largest;
				largest = arr[i];
			} else if (arr[i] < second_largest) {
				second_largest = arr[i];
			}
		}

		System.out.println("Second Largest : " + second_largest
				+ " Second Smallest : " + second_smallest);
	}
}
