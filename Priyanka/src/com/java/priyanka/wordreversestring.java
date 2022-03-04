package com.java.priyanka;


public class wordreversestring {

	public static void main(String[] args) {
		String str ="am working in HCL ";
		String words[]= str.split("\\s");
		String reversestring ="";
		for(int i=0;i<words.length;i++)
		{
			String word =words[i];
			String reverseword ="";
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseword =reverseword+ word.charAt(j) ;
				
			}
			reversestring =reversestring+ reverseword + " ";
		}
 System.out.println(reversestring);
	}

}
