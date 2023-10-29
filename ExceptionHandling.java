package homeworkExercises2;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			int d = 42;
			int a = 0;
			int c = d / a;
		} catch (ArithmeticException e) {
			System.out.println("Division be zero error !! ");

		}

	}

}
