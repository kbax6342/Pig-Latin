import java.util.Scanner;


public class Latin {

	public static void main(String[] args) {
		// The application prompts the user for a word
		//The application translates the text to Pig Latin and displays it on the console
		//The application asks the user if he or she wants to translate another word
		
		Scanner input = new Scanner (System.in);
		
		String sentence;
		String add = "way";
		String secondAdd = "ay";
		
		StringBuffer strBuff = new StringBuffer();
		
		System.out.println("Welcome to the Pig Latin Translator!");
		
		
		System.out.println("Enter a line to be translated:  ");
		strBuff.append(input.nextLine());
		//String[] splitArray = input.split("\\s+");
		
		
		for (int i = 0; i < strBuff.length(); i++) {
			   char c = strBuff.charAt(i);
			   strBuff.setCharAt(i, Character.toLowerCase(c));
			}
		
		System.out.println(strBuff);
		

	}

}
