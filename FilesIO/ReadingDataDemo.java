package FilesIO;
import java.io.*;
import java.util.*;

public class ReadingDataDemo {

	public static void main(String[] args) throws IOException {
	
		// Get the file name.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the filename: ");
		String filename = input.nextLine();
		
		
		//Open the file
		File myFile = new File (filename);
		Scanner inputFile = new Scanner(myFile);
		
		String sum = "";
		//Display the line
		while (inputFile.hasNext()) {
			String line = inputFile.nextLine();
		
			sum+= line;
		
			System.out.println(sum);
		}
		
		
		
		//Close the file
		inputFile.close();
		

	}

}
