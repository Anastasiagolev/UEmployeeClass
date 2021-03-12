//Anastasia Golev  Lab 3 

/* UEmployee class contains member variables for the university employee name and salary.
 * The class contains member methods for returning the employee name and salary.
 */

public class UEmployee {
	
	//member variables to hold the employee's name and salary
	private String employeeName;
	private double salary;
	
	//2 parameter constructor to set the employee name and salary
	public UEmployee( String nEmployeeName, double nSalary) {
		employeeName = nEmployeeName;
		salary = nSalary;
	}
	//member methods to return the employee name and salary
	public String getEmployeeName() {
		return employeeName;
	}
	
	public double getSalary() {
		return salary;
	}
	
	//toString method
	public String toString() {
		String s = "";
		s += "Employee Name: " + employeeName + "\n";
		s += "Salary: " + salary + "\n";
		return s;		
	}//end toString() method
	
}
