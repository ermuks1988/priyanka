package com.java.priyanka;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);   //taking user input
	int i=sc.nextInt();// storing input values in i
	//System.out.println("Enter the number");
		if(i%2==0) 
		{
			System.out.println("even number");
		}
		else
			System.out.println("odd number");
	}

}
