package twosum;

import java.util.Arrays;
import java.util.List;

//convert to using a hash map
public class Solution {
	public int[] twoSum(List<Integer> nums, int target) {
		int firstIndex = 0;
		int secondIndex = 0;
		for (int i = 0;  i < nums.size(); i++) {
			int diff = target - nums.get(i);
			firstIndex = i;
			secondIndex = nums.indexOf(diff);
			if (secondIndex != -1) {
				break;
			}
		}
		int[] indices = {firstIndex, secondIndex};
		return indices;
	}
	
	public static void main(String args[]) {
		Solution s = new Solution();
		List<Integer> nums = Arrays.asList(1, 2, 4, 8, 6);
		int target = 7;
		int[] indices = s.twoSum(nums, target);
		System.out.println(indices[0] + "    " + indices[1]);
	}

}
