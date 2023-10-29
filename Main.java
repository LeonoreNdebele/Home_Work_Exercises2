package homeworkExercises2;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		
		Employee employee = new Employee();
		
		
        Scanner scanner = new Scanner(System.in);

        employee.setEmployeeDetails();

        System.out.print("Total duration: ");
        double duration = scanner.nextDouble();

        employee.setTotalDuration(duration);

        double wagesPerHour = 20.0; 
        int numberOfWeeks = 8; 

        double wages = employee.wagesCalculation(wagesPerHour, numberOfWeeks);

        employee.displayEmployeeDetails();
        employee.displayWages(wages);
	}

}
