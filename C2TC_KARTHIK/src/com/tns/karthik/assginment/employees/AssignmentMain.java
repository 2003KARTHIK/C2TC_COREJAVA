package com.tns.karthik.assginment.employees;
import com.tns.karthik.assginment.employees.Manager;
import com.tns.karthik.assginment.employees.Developer;
import com.tns.karthik.assginment.employees.EmployeeUtilities;
public class AssignmentMain {
	public static void main(String[] args) {
		Manager manager = new Manager("John", 101, 90000, "Sales");
		Developer developer = new Developer("Alice", 102, 80000, "Java");
		EmployeeUtilities.printEmployeeDetails(manager);
		EmployeeUtilities.printEmployeeDetails(developer);
		}
}
