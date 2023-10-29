package homeworkExercises2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadingUsingCanReadfxn {
	
	public static void main(String[] args) throws IOException {
		
		//create file
		File file = new File("C:\\Users\\leomd\\OneDrive\\Documents\\epita\\S3_fall\\Java_app_development\\1Ex2file.txt");
		
		// Check if the file can be read.
		if (file.canRead()) {
            System.out.println("This File can Read!");

            // Create a BufferedReader to read the file.
            BufferedReader reader = new BufferedReader(new FileReader(file));
            
         // Seek to the offset of the string "Object-oriented programming language".
         

         // Read the string.
            String line = reader.readLine();
            
         // Print the string.
            System.out.println(line);
            
         // Create a new file to write the given contents to.
            File newFile = new File("C:\\Users\\leomd\\OneDrive\\Documents\\epita\\S3_fall\\Java_app_development\\Ex2file3.txt");

            // Write the given contents to the new file.
            FileWriter writer = new FileWriter(newFile);
            writer.write(line);
            writer.close();

            // Close the BufferedReader.
            reader.close();
        } else {
            System.out.println("File cannot be read.");
        }
    }

}

