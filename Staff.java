//Anastasia Golev  Lab 3

/* The Staff class includes members for storing and returning the job title*/

public class Staff extends UEmployee {

	//member variable jobTitle to represent job title 
	private String jobTitle;
	
	//3 parameter constructor 
	public Staff(String nEmployeeName, double nSalary, String nJobTitle) {
		super(nEmployeeName, nSalary); //keyword super to get data from parent class
		jobTitle = nJobTitle;
	}
	
	//member methods to set and return jobTitle
	public void setJobTitle(String nJobTitle) {
		jobTitle = nJobTitle;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	
	//toString method
	public String toString() {
		String s = super.toString();
		s += "Job Title: " + jobTitle + "\n";
		return s;
	}//end toString() method
}
