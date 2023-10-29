package homeworkExercises2;

import java.util.Scanner;

public class Company {

	private int companyId;

	private int employeeId;
	private String employeeName;
	private int totalDuration;
	private int wagesPerHour;
	private int noOfWeeks;

	public void setEmployeeDetails() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter employeeId : ");
		employeeId = sc.nextInt();

		System.out.println("Enter employeeName : ");
		employeeName = sc.next();

	}

	public void displayEmployeeDetails() {
		
		System.out.println("Employee Details : " );

		System.out.println("EmployeeId : " + employeeId);

		System.out.println("EmployeeName : " + employeeName);

	}

	public double calculateWages() {
		double wagesCalculated = totalDuration * wagesPerHour * noOfWeeks;
		return wagesCalculated;

	}

	public void displayWages() {
		System.out.println("Wages : " + calculateWages());

	}

}

class Employee extends Company {

	private double totalDuration;

	public void setTotalDuration(double duration) {

		totalDuration = duration;

	}

	public double wagesCalculation(double wagesPerHour, int numberOfWeeks) {
		return totalDuration * wagesPerHour * numberOfWeeks;
	}

	public void displayWages(double wages) {
		System.out.printf("Wages: %.2f €%n", wages);

	}
}
