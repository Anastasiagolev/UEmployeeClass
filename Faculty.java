//Anastasia Golev  Lab 3

/*The Faculty class includes members for storing and returning the department name*/

public class Faculty extends UEmployee {

	//member variable department to represent the department of employee
	private String department;
	
	//3 parameter constructor
	public Faculty( String nEmployeeName, double nSalary, String nDepartment) {
		super(nEmployeeName, nSalary); //super keyword to access data from parent class
		department = nDepartment;
		
	}
	
	//member methods to set and return department variable
	public void setDepartment(String ndepartment) {
		department=ndepartment;
	}
	
	public String getDepartment() {
		return department;
	}
	
	//toString method
	public String toString() {
		String s = super.toString();
		s += "Department: " + department + "\n";
		return s;
	}//end toString() method
	
}
