
public class ReverseBits {
	public static void main(String[] args) {
		// Input: n = 11111111111111111111111111111101
		// Output: 3221225471 (10111111111111111111111111111111)
		System.out.println(reverseBits(1));
	}

	public static int reverseBits(int n) {
		StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));
		sb.reverse();
		while (sb.length() < 32) {
			sb.append("0");
		}

		return Integer.parseUnsignedInt(sb.toString(), 2);
		
	}
}
