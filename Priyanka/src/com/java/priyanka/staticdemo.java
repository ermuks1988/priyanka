package com.java.priyanka;


class student {
	int rollno;
	String Name;
	static String Clg = "BCETW";
	static String Area ="Durgapur";

	student(int r, String n) {
		rollno = r;
		Name = n;
	}

	void display() {
		System.out.println(rollno + " " + Name + " " + Clg+ " " +Area);
	}
}

public class staticdemo {

	public static void main(String[] args) {
		student s1 = new student(14, "Priyanka");
		student s2 = new student(11, "Priya");
		s1.display();
		s2.display();
	}

}
