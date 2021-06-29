import java.util.HashMap;
import java.util.HashSet;

public class SumOfSubArray {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 5, 7, 1, 2, 4, 7, 10, -3 };
		int target = 7;

		findSubArray(arr, target);

	}

	private static void findSubArray(int[] arr, int target) {
		
		
		HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
		int sum = 0;
		HashSet<Integer> firstset = new HashSet<Integer>();
		firstset.add(-1);
		map.put(sum, firstset);

		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];

			if (map.containsKey(sum - target)) {
				HashSet<Integer> set=map.get(sum - target);
				for(int startPt:set)
				System.out.println(startPt+1+" "+i );
			}

			HashSet<Integer> set = new HashSet<Integer>();
			set.add(i);
			map.put(sum, set);
		}
		
		//System.out.println(map);
	}
}
