import java.util.HashMap;

public class Solution {
	public static void main(String[] args) {
		int[] nums= {3,2,3};
		int target=6;
		int[] a=twoSum(nums, target);
		for(int i:a) {
			System.out.print(i+" ");
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		int[] arr = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(target-nums[i])) {
				return new int[] {map.get(target-nums[i]),i};
			}
			map.put(nums[i], i);	
		}
		
		//System.out.println(map);
		return arr;
	}
}