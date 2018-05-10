/*
 * Simple code to find duplicates in an array.
 * Aditya Sharma.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArralElementFrequency {

	public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> duplicateList = new ArrayList<Integer>();
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		int i = 0;

		for (i = 0; i < nums.length; i++) {
			if (hmap.containsKey(nums[i])) {
				int value = hmap.get(nums[i]);
				hmap.put(nums[i], value + 1);
			} else {
				hmap.put(nums[i], 1);
			}
		}

		for (Integer k : hmap.keySet()) {
			if (hmap.get(k) == 2) {
				duplicateList.add(k);
			}
		}

		return duplicateList;

	}

	public static void main(String args[]) {
		int arr[] = { 4, 3, 2, 7, 8, 2, 3, 1, 1 };
		List<Integer> duplicateList = findDuplicates(arr);
		System.out.println("List Size = " + duplicateList.size());
		for (Integer i : duplicateList) {
			System.out.print(i + " ");
		}
	}
}
