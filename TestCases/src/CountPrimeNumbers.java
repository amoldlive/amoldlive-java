public class CountPrimeNumbers {
	public static void main(String[] args) {
		System.out.println(countPrimes(12));
	}

	public static int countPrimes(int n) {
		int ans = 0;
		for (int i = 2; i < n; i++) {
			if (isPrime(i)) {
				ans++;
			}
		}
		return ans;
	}

	public static boolean isPrime(int n) {
		boolean ans = true;
		int count=0;
		int i=2;	
		while(i<n) {
			if(n%i==0) {
				count++;
			}
			i++;
		}
		if(count>0)
			return false;
		
		return ans;
	}
}
