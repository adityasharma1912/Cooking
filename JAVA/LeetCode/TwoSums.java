package leetCode;

public class TwoSums {
	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15, 14, 6, 8, 23, 22 };
		int target = 30;
		TwoSums abc = new TwoSums();
		int ans[] = abc.twoSum(nums, target);
		print("first :" + ans[0] + " second :" + ans[1]);
	}

	public int[] twoSum(int[] nums, int target) {
		int answer[] = new int[2];
		for (int i = 0; i < (nums.length - 1); i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == (target - nums[i])) {
					answer[0] = i;
					answer[1] = j;
					return answer;
				}
			}
		}
		return answer;
	}

	public static void print(String str) {
		System.out.println(str);
	}

}
