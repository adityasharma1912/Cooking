package sorts;

import java.util.Scanner;

public class HeapSortRevived {

	public static int size = 0;

	public static int getLeftChildIndex(int index) {
		return index * 2 + 1;
	}

	public static int getRightChildIndex(int index) {
		return index * 2 + 2;
	}

	public static void swap(int arr[], int parentIndex, int index) {
	    System.out.println("Swap "+parentIndex+" and "+index);
		int temp = arr[parentIndex];
		arr[parentIndex] = arr[index];
		arr[index] = temp;
	}
	
	public static void minHeapify(int arr[], int index) {
	    int leftChildIndex = getLeftChildIndex(index);
	    int rightChildIndex = getRightChildIndex(index);
	    int smallestIndex = index;
//	    System.out.println("index: "+index+" leftChildIndex: "+leftChildIndex+" rightChildIndex: "+rightChildIndex);
	    
	    if(leftChildIndex < size && arr[leftChildIndex] < arr[index])
	        smallestIndex = leftChildIndex;
	    if(rightChildIndex < size && arr[rightChildIndex] < arr[smallestIndex])
	        smallestIndex = rightChildIndex;
	    if(smallestIndex != index){
	        swap(arr, smallestIndex, index);
	        minHeapify(arr, smallestIndex);
	    }
	}
	
	public static void buildHeap(int arr[]){
	    int i = (size/2 - 1); 
	    for (; i >= 0; i--)
			minHeapify(arr, i);
		printArray(arr);
	}

	public static void printArray(int arr[]) {
    	System.out.println("");
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println("");
	}

	public static void heapSort(int arr[]) {
		buildHeap(arr);
		for(int i = size-1; i>0; i--){
		    swap(arr,i,0);
		    size = size - 1;
		    minHeapify(arr, 0);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter length of array to be sorted");
		Scanner scanner = new Scanner(System.in);
		size = scanner.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}

		heapSort(arr);
		System.out.println("Sorted array is:");
		
		printArray(arr);

		scanner.close();
	}
}
