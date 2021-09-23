package com.string;

public class ShortenString {
	
	public static void main(String[] args) {
		String str="aaabbbbcccczz"; //a3b4c2
		System.out.println("Original : "+str+"\n");
		System.out.println("Shorten version : "+getShortenString(str));
	}
	static String getShortenString(String str)
	{
		String newStr="";
		//int length=str.length();
		char[] string=str.toCharArray();
		int count;		
		for (int i = 0; i < string.length; i++) {
		count=1;
			for (int j = i+1; j < string.length; j++) {
				if(string[i]==string[j] && string[j]!=0) {
				 count++;
				 string[j]=0;	
				}
				
			}
			
			if(count>1)
			newStr=newStr+string[i]+count;
				//System.out.println(string[i] +"  : "+count);
			
		}		
			
		
		return newStr;
	}
}
