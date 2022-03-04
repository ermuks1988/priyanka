package com.java.priyanka;


public class stringdemo {

	public static void main(String[] args) {
		//concatenation
/*		String s1= "my name is ";
		String s2 ="priyanka";
		System.out.println(s1.concat(s2));*/ 
		
		//adding numbers and string
		/*String s3 = "4";
		int x =2;
		String z=x+s3;
		System.out.println(z);*/
		
		// finding character in a string
		/*
		 * String s1= "i am working in HCL "; System.out.println(s1.indexOf("working"));
		 */
		//reverse string
		/*
		 * String str= "priyanka"; String rev =""; for(int i =str.length()-1;i>=0;i--) {
		 * rev=rev+str.charAt(i); } System.out.println(rev);
		 */

		
		String str ="my name is priyanka";
		String words[] = str.split("\\s");
	    String reversedString = "";
	 
	    for (int i = 0; i < words.length; i++) 
	    {
	      String word = words[i];
	      String reverseWord = "";
	      for (int j = word.length() - 1; j >= 0; j--) {
	        reverseWord = reverseWord + word.charAt(j);
	      }
	      reversedString = reversedString + reverseWord + " ";
	    }
	 
	    // Displaying the string after reverse
	    System.out.print("Reversed string : " + reversedString);
	
	}
	

}
