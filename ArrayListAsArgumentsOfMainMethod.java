package homeworkExercises2;

import java.util.ArrayList;

public class ArrayListAsArgumentsOfMainMethod {
	
	public static void main (String[] args) {
		
        // Create an ArrayList to store the input elements.
		ArrayList<Integer> arrayList = new ArrayList<>();
		
        // Add the input elements to the ArrayList.
		for (String arg : args) {
			arrayList.add(Integer.parseInt(arg));
		}
        // Sort the ArrayList in ascending order.
		arrayList.sort(null);
		
        // Print the ArrayList elements in a new line.
		for (int element : arrayList) {
			System.out.println(element);
		}
		
		
	}
	
	

}
