package Q1.IsUnique;

import java.lang.reflect.Array;

public class Using256Array {

	public static void main(String[] args) {
		String[] inp = { "Mango", "Apple", "Pine" };
		for (String input : inp)
			System.out.println("Is unique?:" + checkUnique(input));
	}

	private static boolean checkUnique(String input) {
		boolean[] charSet = new boolean[256];
		for (int i = 0; i < input.length(); i++) {
			if (charSet[(int) input.charAt(i)]) {
				return false;
			} else
				charSet[(int) input.charAt(i)] = true;

		}
		return true;
	}

}
