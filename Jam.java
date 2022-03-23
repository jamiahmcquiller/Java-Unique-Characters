import java.util.*;


public class Jam {
	boolean uniqueCharacters(String str)
{
		for(int i = 0; i < str.length(); i++)
			for(int j = i + 1; j < str.length(); j++)
				if (str.charAt(i) == str.charAt(j))
					return false;
		
		return true;
}
	public static void main(String args []) {	
{
	Jam obj = new Jam();
	String input = "Jamiah Angel McQuiller";
	if (obj.uniqueCharacters(input))
		System.out.println("The string " + input + " has all unique characters");
	
	else
		System.out.println("The string " + input + " has all duplicate characters");
	}

}
	
}
	
