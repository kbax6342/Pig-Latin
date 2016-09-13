
public class methods {

	public static  StringBuffer lowerCase(StringBuffer strBuff){
		
		for (int i = 0; i < strBuff.length(); i++) {
			
			   char c = strBuff.charAt(i);
			   
			  strBuff.setCharAt(i, Character.toLowerCase(c));
			   
	}
	
		return strBuff;
	
} //Goes to main method
} //End of class