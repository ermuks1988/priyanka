package com.java.priyanka;

abstract class byke{
	abstract void display();
	
}
 class pulser extends byke{
	void display() {
		System.out.println("Pulser 180cc");
	}
}


public class demoabstractclass {

	public static void main(String[] args) {
		
pulser p = new pulser();
p.display();
	}

}
