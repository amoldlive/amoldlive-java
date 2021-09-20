import java.util.ArrayList;
import java.util.List;

public class Result2 {

	public static void main(String[] args) {
		List<Integer> numbers=List.of(2,-5,0,2,3);
			
		
		List<List<Integer>> queries=new ArrayList<List<Integer>>();
		List<Integer> a=List.of(2,2,20);
		queries.add(a);
		
		List<Long> result=findSum(numbers, queries);
		System.out.println(result);
		
		
	}

	public static List<Long> findSum(List<Integer> numbers, List<List<Integer>> queries) {

		List<Integer> numList=new ArrayList<Integer>();
		int sum=0;
		List<Long> result=new ArrayList<Long>();
			
			for(List<Integer> query :queries) {
				sum=0;
				int start=query.get(0);
				int end=query.get(1);
				int X=query.get(2);
				
				for (int i = start; i <= end; i++) {
					numList.add(numbers.get(i));
				}
				
				for(int num:numList) {
					sum+=num;
				}
				
				if(numList.contains(0)) {
					sum=sum+X;
				}
				
				result.add((long) sum);
			}
			
		
		return result;
	}

}
