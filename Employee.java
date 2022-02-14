package org.sample;

import java.util.Scanner;

public class Employee {

	// Method creation
	private void empId() {
		System.out.println("Employee id is: 12345");

	}

	private void empName() {
		System.out.println("Arivu");

	}

	// Main method Creation
	// To execute the program
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// Object Creation
		// ClassName objectRef = new ClassName();
		Employee e = new Employee();
		// Method calling
		// objectRef.methodName();
		e.empId();
		e.empName();

	}

}
