package encapsulation_problems;

public class EmployeeObject {

	public static void main(String[] args) {
		
		// creating object
		Employee em = new Employee();
		
		// set values using setter method
		em.setEmployeeId(01);
		em.setEmployeeName("venky");
		em.setEmployee_salary(25000);
		
		// get values using getter method
		
		int employee_id = em.getEmployeeId();
		String employee_name = em.getemployee_name();
		String formattedSalary = em.getFormattedSalary();
		
		//printing values
		
		System.out.println("Employee id = "+ employee_id);
		System.out.println("Employee name = "+ employee_name);
		System.out.println("Employee Salary = "+ formattedSalary);
	}

}
