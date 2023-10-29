package homeworkExercises2;

import java.util.Scanner;

/**
 * The `Company` class is the base class for the `Employee` class.
 * This means that the `Employee` class inherits all of the members (fields and methods) of the `Company` class.
 */
public class Company {

	/**
	 * Protected members of a class can be accessed by its
	 * subclasses and other classes in the same package.
	 */
	protected int companyId;
	protected String companyName;
	protected float wagesPerHour;
	protected int noOfWeeks;

	// Constructor
	Company(int companyId, String companyName, float wagesPerHour, int noOfWeeks) {

		this.companyId = companyId;
		this.companyName = companyName;
		this.wagesPerHour = wagesPerHour;
		this.noOfWeeks = noOfWeeks;
	}
	
	 void WagesCalculator(double totalDuration) {
		double wages = totalDuration * wagesPerHour * noOfWeeks;
		System.out.printf("Wages: %.2f €%n", wages);
		
	}


}

class Employee extends Company {

	private int employeeId;
	protected String employeeName;
	public double totalDuration;

	// Constructor

	Employee(int companyId, String companyName, float wagesPerHour, int noOfWeeks) {
		// invoking base-class(Company) constructor
		super(companyId, companyName, wagesPerHour, noOfWeeks);		
	}


	public void WagesCalculator() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter employeeId: ");
		employeeId = sc.nextInt();
		sc.nextLine(); // Consume the newline character

		System.out.println("Enter employeeName: ");
		employeeName = sc.nextLine();

		System.out.println("Enter totalDuration: ");
		double totalDuration = sc.nextDouble();
		sc.nextLine(); // Consume the newline character
		
		System.out.println("EmployeeId: " + employeeId);
		System.out.println("EmployeeName: " + employeeName);
		
		/**
         * The `super` keyword is used to access the members of the superclass.
         * In this case, the `super.WagesCalculator()` method is called to calculate the wages using the total duration entered by the user.
         */
		super.WagesCalculator(totalDuration);
	}

	// the Employee subclass adds one more method, `printInfo()`.
	void printInfo() {

		WagesCalculator();

	}

}
