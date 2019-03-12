package Q2.Anagrams;

import java.util.Arrays;

public class Anagrams1 {

	public static void main(String[] args) {

		String[][] namePairStrings = { { "surya", "aYrus" }, { "Sushmitha", "Ahtimhsus" } };
		for (String[] namePair : namePairStrings) {
			String first = namePair[0];
			String second = namePair[1];
			System.out.println(sortCheckAnag(first, second));

		}
	}

	private static boolean
	sortCheckAnag(String first, String second) {
		char[] firstC = first.toLowerCase().toCharArray(); 
		char[] secondC = second.toLowerCase().toCharArray();
		if(sort(firstC).equals(sort(secondC)))
		return true;
		else return false;
	}

	private static String sort(char[] charArray) {
		Arrays.sort(charArray);
		return new String(charArray);
	}
	
}