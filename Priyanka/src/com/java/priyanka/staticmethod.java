package com.java.priyanka;


class employee{
	int empid;
	 String empname;
	int salary;
	static String companyname = "IBM";
	
	
	  static void change() { companyname = "CGI";
	  
	  }
	 
	
	employee(int id, String n, int s) {
		empid = id;
		empname = n;
		salary =s;
	}

	void display() {
		System.out.println(empid + " " + empname + " " + salary+ " " +companyname);
	}
}


public class staticmethod {

	public static void main(String[] args) {
          employee.change();
          employee E1 =new employee(123, "priyanka", 60000);
E1.display();
	}

}
