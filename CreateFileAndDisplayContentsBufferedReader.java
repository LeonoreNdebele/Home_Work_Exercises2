package homeworkExercises2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileAndDisplayContentsBufferedReader {
	
	 public static void main(String[] args) throws IOException {
		

	        // Create a file.
	        File file = new File("C:\\Users\\leomd\\OneDrive\\Documents\\epita\\S3_fall\\Java_app_development\\1Ex2file.txt");
	        
	     // If the file does not exist, create it.
	        if (!file.exists()) {
	            file.createNewFile();
	            System.out.println("File created!");
	        }
	     // Write the given contents to the file.
	        FileWriter writer = new FileWriter(file);
	        writer.write("Java is a high-level, class-based, Object-oriented programming language..!!");
	        writer.close();
	        
	        // Display the contents of the file using BufferedReader.
	        BufferedReader reader = new BufferedReader(new FileReader(file));
	        String line;
	        
	        while ((line = reader.readLine()) != null) {
	            System.out.println(line);
	        }
	        reader.close();
	 }


}
