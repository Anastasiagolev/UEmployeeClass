//Anastasia Golev  Lab 3

/*  UEmployeeRunner is a program that creates one instance of each class (UEmployee, Faculty, 
 * and Staff) and prints all of the data for each object.
 */

public class UEmployeeRunner {

	public static void main(String[] args) {
		
		//creating an instance of UEmployee called employee1 using constructor
		UEmployee employee1 = new UEmployee("Anastasia", 0.0); 
		
		System.out.println(employee1.toString());
		
		//creating an instance of Faculty called department1 using constructor
		Faculty department1 = new Faculty("Bob Smith", 10000.0, "Mathematics");
		
		System.out.println(department1.toString());
		
		//creating an instance of Staff called staff1 using constructor
		Staff staff1 = new Staff("Cherryl Doe", 0.0, "Student");
		
		System.out.println(staff1.toString());

	}
}

/* Output 

Employee Name: Anastasia
Salary: 0.0

Employee Name: Bob Smith
Salary: 10000.0
Department: Mathematics

Employee Name: Cherryl Doe
Salary: 0.0
Job Title: Student

*/