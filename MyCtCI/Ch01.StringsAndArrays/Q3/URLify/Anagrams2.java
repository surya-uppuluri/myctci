package Q3.URLify;

public class Anagrams2 {

	public static void main(String[] args) {

		String[][] namePairStrings = { { "surya", "ayrus" }, { "Sushmitha", "ahthmhsus" } };
		for (String[] namePair : namePairStrings) {
			String first = namePair[0];
			String second = namePair[1];
			System.out.println(checkAnag(first, second));

		}
	}

	private static boolean checkAnag(String first, String second) {

		int letters[] = new int[128];
		if (first.length() != second.length())
			return false;
		for (int i = 0; i < first.length(); i++) {
			letters[first.charAt(i)]++;
		}

		for (int i = 0; i < second.length(); i++) {
			letters[second.charAt(i)]--;
			if (letters[second.charAt(i)] < 0) {
				{
					System.out.println("Broken at " + second.charAt(i)+ " " + i);
					return false;
				}
			}
		}
		return true;
	}
}
