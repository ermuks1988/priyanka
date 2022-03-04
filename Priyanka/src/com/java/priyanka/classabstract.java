package com.java.priyanka;


public class classabstract {

	public static void main(String[] args) {
		phone obj = new brand();
		obj.oneplus();
		brand bd = new brand();
		bd.display();

	}
}

abstract class phone {
	abstract void oneplus();

}

class brand extends phone {
	public void display()

	{
		System.out.println("iphone");
	}

	public void oneplus()
	{
		System.out.println("oneplus");
	}
}
