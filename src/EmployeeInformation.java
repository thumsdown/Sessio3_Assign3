import java.util.Scanner;
public class EmployeeInformation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Name = new String();
		String EmpID = new String();
		Employee emp = new Employee();
		System.out.println("Enter Employee Details");
		System.out.println("Enter Employee Name");
		Name = sc.next();
		System.out.println("Enter Employee ID");
		EmpID = sc.next();
		emp.setEmployeeName(Name);
		emp.setEmployeeId(EmpID);
		System.out.println("Details entered");
		System.out.println("Employee Name = "+emp.getEmployeeName());
		System.out.println("Empoyee ID ="+emp.getEmployeeId());
		sc.close();
	}
	
}
