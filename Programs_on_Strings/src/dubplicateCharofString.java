
import java.util.*;
public class dubplicateCharofString {
	public static void main(String argu[]) {

		  String str1 ="Testme";
		  String str=str1.toLowerCase();
		  
	     int count = 0;
		  char[] inp = str.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (inp[i] == inp[j]) {
		     System.out.println(inp[j]);
		     count++;
		     break;
		    }
		   }
		  }
		 }
}
		  
/*	
	// Java program to find dublicate characters of string using HashMap 
	
	

		// Function to print all duplicate
		// characters in string using HashMap
		public static void
		countDuplicateCharacters(String str)
		{

			// Creating a HashMap containing char
			// as a key and occurrences as a value
			HashMap<Character, Integer> map
				= new HashMap<Character, Integer>();

			// Converting given string into
			// a char array
			char[] charArray = str.toCharArray();

			// Checking each character
			// of charArray
			for (char c : charArray) {

				if (map.containsKey(c)) {

					// If character is present
					// in map incrementing it's
					// count by 1
					map.put(c, map.get(c) + 1);
				}
				else {

					// If character is not present
					// in map putting this
					// character into map with
					// 1 as it's value.
					map.put(c, 1);
				}
			}

			// Traverse the HashMap, check
			// if the count of the character
			// is greater than 1 then print
			// the character and its frequency
			for (Map.Entry<Character, Integer> entry :
				map.entrySet()) {

				if (entry.getValue() > 1) {
					System.out.println(entry.getKey()
									+ " : "
									+ entry.getValue());
				}
			}
		}

		// Driver Code
		public static void
		main(String args[])
		{
			// Given String str
			String str = "testme";

			// Function Call
			countDuplicateCharacters(str);
		} */
	


