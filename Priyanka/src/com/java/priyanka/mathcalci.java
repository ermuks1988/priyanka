package com.java.priyanka;

import java.util.Scanner;

public class mathcalci {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	    System.out.println("Enter 1st number");
	   int num1 =sc.nextInt();
	    System.out.println("Enter 2nd number");
	    int num2 =sc.nextInt();
//		mathcalci obj=new mathcalci();
//		obj.add(7,8);
//		obj.sub(15, 8);
//		obj.div(48, 4);
//		obj.mul(5, 6);
		int sum = num1+num2;
		
		System.out.println("Sum " +sum );
    
	}
//	public void add (int a, int b)
//	{
//		System.out.println(a+b);
//	}
//
//	public void sub (int q, int w)
//	{
//		System.out.println(q-w);
//	}
//	public void mul (int s, int t)
//	{
//		System.out.println(s*t);
//	}
//	public void div (int c, int d)
//	{
//		System.out.println(c/d);
//	}
}
