package com.cts.emp;

public class Employee {
	public void empDetails(int id) {
		System.out.println(id);
	}
	public void empDetails(String name) {
		System.out.println(name);
	}
	public void empDetails(String mail, long phNo) {
		System.out.println(mail);
		System.out.println(phNo);
	}
	public void empDetails(long phNo, String address) {
		System.out.println(address);
		System.out.println(phNo);
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empDetails("Ajith");
		e.empDetails(12345);
		e.empDetails("ajith@gmail.com", 1234567890);
	}
	

}
