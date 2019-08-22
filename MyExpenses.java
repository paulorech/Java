import java.io.*;
import java.util.Scanner;

public class MyExpenses {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String inputBudget = "";
		FileWriter fileW = new FileWriter("MyExpenses.txt", true);
		PrintWriter writer = new PrintWriter(fileW);
		
		Scanner input = new Scanner(System.in);
		
		while(!inputBudget.equals("exit")) {
			System.out.println("Enter expense name (type exit to end): ");
			inputBudget = input.nextLine();
			if(!inputBudget.equals("exit"))
				writer.println(inputBudget);
		}
		
		writer.close();
		System.out.println();
		System.out.println("Reading the file");
		System.out.println();
		
		read();
		input.close();

	}
	
	public static void read() throws IOException {
		Scanner fileNameInput = new Scanner(System.in);
		String userInput;
		int i=1;
		
		System.out.println("Enter the name of the file to read: ");
		userInput = fileNameInput.nextLine();
		
		File myFile = new File(userInput);
		Scanner input = new Scanner(myFile);
		
		while(input.hasNext()){
			System.out.println( i + " - " + input.nextLine());
			i++;
		}
		System.out.println("Reading done!");
		input.close();
		
		fileNameInput.close();
	}

}
