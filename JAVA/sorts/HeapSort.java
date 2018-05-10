package sorts;

import java.util.Scanner;

public class HeapSort {

	public static int MAX_INT = Integer.MAX_VALUE;
	public static int size = 0;

	public static void println(String string) {
		System.out.println(string);
	}

	public static void print(String string) {
		System.out.print(string);
	}

	public static int getParentIndex(int index) {
		return (index - 1) / 2;
	}

	public static boolean hasParent(int index) {
		return (index == 0) ? false : true;
	}

	public static int getLeftChildIndex(int index) {
		return index * 2 + 1;
	}

	public static int getRightChildIndex(int index) {
		return index * 2 + 2;
	}

	public static boolean hasLeftChild(int index) {
		return getLeftChildIndex(index) < size;
	}

	public static boolean hasRightChild(int index) {
		return getRightChildIndex(index) < size;
	}

	public static void swap(int arr[], int parentIndex, int index) {
		int temp = arr[parentIndex];
		arr[parentIndex] = arr[index];
		arr[index] = temp;
	}

	public static void minHeapifyUp(int arr[], int index) {
		while (hasParent(index)) {
			if (arr[getParentIndex(index)] > arr[index]) {
				swap(arr, getParentIndex(index), index);
				index = getParentIndex(index);
			}else
				break;
		}
	}

	public static void minHeapifyDown(int arr[]) {
		int index = 0;
		while (hasLeftChild(index)) {
			int smallerChildernIndex = getLeftChildIndex(index);
			if (hasRightChild(index) && arr[getRightChildIndex(index)] < arr[smallerChildernIndex]) {
				smallerChildernIndex = getRightChildIndex(index);
			}

			if (arr[index] < arr[smallerChildernIndex])
				break;
			else {
				swap(arr, smallerChildernIndex, index);
				index = smallerChildernIndex;
			}
		}
	}
	
	public static void buildHeap(int arr[]){
	    for (int i = 0; i < arr.length; i++)
			minHeapifyUp(arr, i);
	}

	public static void printArray(int arr[]) {
		for (int i : arr)
			System.out.print(i + " ");
	}

	public static void heapSort(int arr[]) {
		buildHeap(arr);

		int temp[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[0];
			arr[0] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = MAX_INT;
			minHeapifyDown(arr);
		}

		System.arraycopy(temp, 0, arr, 0, arr.length);
	}

	public static void main(String[] args) {
		println("Enter length of array to be sorted");
		Scanner scanner = new Scanner(System.in);
		size = scanner.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}

		heapSort(arr);
		println("Sorted array is:");

		for (int i : arr)
			print(i + " ");

		scanner.close();
	}
}
