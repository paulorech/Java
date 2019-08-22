package FilesIO;
import java.io.*;
import java.util.*;
public class FilesDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException{

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the filename: ");
		String filename = input.nextLine();
	
		
		PrintWriter outputFile = new PrintWriter(filename);
		
		outputFile.println("Hi, my name is Paulo");
		outputFile.println("What is your name? ");
		System.out.println("What is your name? ");
		String name = input.nextLine();
		outputFile.println(name);
		
		outputFile.println("What is your age? ");
		System.out.println("What is your age?");
		int age = input.nextInt();
		outputFile.println(age);
		
		outputFile.println("This is just a demo to see the creation of a file.");
		outputFile.println("\nThank you");
		
		
		outputFile.close();

	}

}
