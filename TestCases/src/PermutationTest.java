
public class PermutationTest {
	public static void main(String[] args) {

		String str = "ABC";
		String newStr = "";
		permute(str, newStr);
		System.out.println("********************************");
		SubSet(str);

	}

	private static void SubSet(String str) {
		String subString;
		for (int i = 0; i < str.length(); i++) {
			subString="";
			for (int j = i; j < str.length(); j++) {
				System.out.println(str.substring(i,j+1));
			}
		}  
		
	}

	private static void permute(String str, String newStr) {

		if (str.length() == 0) {
			System.out.println(newStr);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String lPart = str.substring(0, i);
			String rPart = str.substring(i + 1);
			String rop = lPart + rPart;

			permute(rop, newStr + ch);

		}

	}
}
