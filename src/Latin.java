import java.util.Scanner;
 

public class Latin {

	public static void main(String[] args) {
		//Translate the Words
		//Take in String Sentence
		//Break up the String
		
		
		
		//Importing classes 
		Scanner input = new Scanner (System.in);
		
		int indexOfVowel = -1;
		
		
		
		//Saying Welcome to the user
		System.out.println("Welcome to the Pig Latin Translator!");
		
		//Asking the user to put in a line to be translated
		System.out.println("Enter a line to be translated:  ");
		//Taking the input and assigning and it a new variable
		String text = input.nextLine();
		text = text.toLowerCase();
		
		if(text.charAt(0) == 'a' || text.charAt(0) == 'e' || text.charAt(0) == 'i' || text.charAt(0) == 'o' || text.charAt(0) == 'u'){
			System.out.println(text + "ay");
		}else{
		
		
		for(int x = 0; x <= text.length(); x++){
			if(text.charAt(x) == 'a' || text.charAt(x) == 'e' || text.charAt(x) == 'i' || text.charAt(x) == 'o' || text.charAt(x) == 'u'){
				 indexOfVowel = x;
				break;
			}
			
		}
		String backSentence = text.substring(indexOfVowel);
		String frontSentence = text.substring(0, indexOfVowel);
		
		System.out.println(backSentence + frontSentence + "way");
		}
	
		
		
		
		
		
		
		
		
		
		
		
		//identifies letter in first place
//		int vowelFirst = vow.indexOf(firstLetter);//determines if first letter is a vowel
//		//any letters before the first vowel
//		String firstChunk =
//		
//		boolean firstLetterVowel = (vowelFirst >= 0);//moves characters
//		String ext = text.substring(1); //captures word without first letter - get it?
//		
//		if (firstLetterVowel) {
//			System.out.println(text + firstLetter + "way");
//		}// end if
//		else {
//			System.out.println(ext + firstLetter +  "ay");
//		}//end else
////		System.out.println("Continue? y/n");
////		input.nextLine();
////		choice = input.nextLine();
//		
//		//Spliting the string into seperate words
//		
		
		
		
	
		
		
		
		
		
	
	
		 
		
		
	
	}



}
