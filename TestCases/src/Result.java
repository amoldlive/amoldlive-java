public class Result {

	/*
	 * Complete the 'decryptPassword' function below.
	 *
	 * The function is expected to return a STRING. The function accepts STRING s as
	 * parameter.
	 */
	public static void main(String[] args) {

		decryptPassword("1Bl*Kg*u0");
	}

	public static String decryptPassword(String s) {
		
		
		String sClone=s;
		int k=0;
		StringBuilder sb=new StringBuilder(s);
		
		for(int i = sb.length()-1; i >=0 ; i--)
		{
			if(sb.charAt(i)=='0') {
				sb.setCharAt(i, sb.charAt(k));
				sb.deleteCharAt(k);
			}
					
		}
		
		for(int i = sb.length()-1; i >=0 ; i--)
		{
			if(sb.charAt(i)=='*') {
				char temp=sb.charAt(i-1);
				sb.setCharAt(i-1, sb.charAt(i-2));
				sb.setCharAt(i-2, temp);
				sb.deleteCharAt(i);
			}
		
		}
				
		return sb.toString();
		// Write your code here

	}

}
