package daily.coding.n106;

public class Solution {

	private boolean isReachable(int[] nums) {
		if (nums == null || nums.length == 0) {
			return false;
		}
		int right = nums.length - 1;

		while (right >= 0) {
			int left = right - 1;
			while (left >= 0 && nums[left] < right - left) {
				left--;
			}
			right = left;
			if (right == 0) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().isReachable(new int[] { 2, 0, 1, 0 }));
		System.out.println(new Solution().isReachable(new int[] { 1, 1, 0, 1 }));
	}

}
