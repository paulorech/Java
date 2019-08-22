package Lab13ClassWork;
import java.util.Scanner;
public class PigLatin {

	public static void main(String[] args) {
		
		String pigLatin="";
		String word = "";
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a word: ");
		word = input.nextLine();
	
		
		if(word.charAt(0)=='y') {
			pigLatin = word.substring(1,word.length());
			pigLatin += "yay";
		}
		else if ((word.charAt(0)=='a')|| (word.charAt(0)=='e') ||
		(word.charAt(0)=='i')||(word.charAt(0)=='o')||
		(word.charAt(0)=='u'))
		{
			pigLatin = word.substring(1,word.length())+"ay";
		}
		for (int i = 0 ; i < word.length(); i++) 
		{
			if((word.charAt(i)=='a')|| (word.charAt(i)=='e') ||
					(word.charAt(i)=='i')||(word.charAt(i)=='o')||
					(word.charAt(i)=='u')) 
				
			{
				pigLatin = word.substring(i, word.length()) + word.substring(0,i) + "ay";
				break;
			}
		}
		System.out.println();
		System.out.println("PigLatin: ");
		System.out.println(pigLatin);
			
	
	}

}
