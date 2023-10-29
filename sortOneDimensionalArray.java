package homeworkExercises2;

import java.util.Arrays;

public class sortOneDimensionalArray {
	
	public static void main(String[] args) {
		
		int[] array = {12, 10, 6, 2, 1, 6, 11};
		
        // Sort the array in ascending order.
		Arrays.sort(array);
		
        // Print the array elements with "*" in between.
		for (int i = 0; i < array.length;i++) {
			if (i>0) {
				System.out.println('*');
			}
			System.out.println(array[i]);
		}
		
	}

}
