import java.util.Scanner;


public class Latin {

	public static void main(String[] args) {
		// The application prompts the user for a word
		//The application translates the text to Pig Latin and displays it on the console
		//The application asks the user if he or she wants to translate another word
		
		
		//Importing classes 
		Scanner input = new Scanner (System.in);
		StringBuffer strBuff = new StringBuffer();
		
		//Variables Needed to make additions to String
		String add = "way";
		String secondAdd = "ay";
		String data;
		
		

		//Saying Welcome to the user
		System.out.println("Welcome to the Pig Latin Translator!");
		
		//Asking the user to put in a line to be translated
		System.out.println("Enter a line to be translated:  ");
		strBuff.append(input.nextLine());
		
		 StringBuffer finalSentence = methods.lowerCase(strBuff);
		
		
		
		System.out.println(finalSentence);
	}



}
