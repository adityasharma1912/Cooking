/*
This is a divide and conquer algorithm to find second smalles number in n+ceil(log(n))-2 comparisons.
*/

import java.util.*;

public class SecondSmallest{

	/* HashMap with winner as key and values as list of losers against this particular winner*/
	private static HashMap<Integer,ArrayList<Integer>> map = new HashMap();
	private static int comparisons = 0;

	public static int findSmallest(int arr[]){
		if(arr.length<2)
			return arr[0];
		int localComparisons = 0;

		int length = arr.length;
		int winners[] = new int[(length+1)/2];
		int j = 0;
		int i = 0;

		for(i = 0; i < length-1; i+=2){
			localComparisons++;
			int smaller,larger;
			if(arr[i] < arr[i+1]){
				smaller = i;
				larger = i+1;
			}else{
				smaller = i+1;
				larger = i;
			}
			winners[j++] = arr[smaller];
			if(map.containsKey(arr[smaller])){
				map.get(arr[smaller]).add(arr[larger]);
			}else{
				ArrayList losers = new ArrayList<Integer>();
				losers.add(arr[larger]);
				map.put(arr[smaller],losers);
			}
		}

		if(i!=length){//one element left to add/ odd numbers in array...
			winners[j] = arr[length-1];
		}
		System.out.println("localComparisons = "+localComparisons);
		comparisons = comparisons+localComparisons;
		return findSmallest(winners);
	}

	public static void main(String args[]){
		int arr[] = new int[100];
		for(int i=0; i< 100; i++)
			arr[i] = i+1;
		int smallest = findSmallest(arr);

		if(map.containsKey(smallest)){
			ArrayList<Integer> smlstLosers = map.get(smallest);
			// int smlstLosersArr[] = (int[])smlstLosers.toArray();
			int[] smlstLosersArr = smlstLosers.stream().mapToInt(i -> i).toArray();
			int secondSmallest = findSmallest(smlstLosersArr);
			System.out.println("ArrayLength = "+arr.length+"\nSecond Smallest Number = "
				+secondSmallest+"\ncomparisons =  "+comparisons);
		}else{
			System.out.println("Insuffiecient Array Size with smallest: "+smallest);
		}
	}
}