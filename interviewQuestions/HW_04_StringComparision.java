package interviewQuestions;

public class HW_04_StringComparision {
	/**
	 * String Compression: Implement a method to perform basic string compression
	 * using the counts of repeated characters. For example, the string aabcccccaaa
	 * would become a2blc5a3, If the "compressed" string would not become smaller
	 * than the original string, your method should return the original string. You
	 * can assume the string has only uppercase and lowercase letters (a - z).
	 */
	public static void main(String[] args) {
		System.out.println(CompressAString("aabcccccaaa"));// a2blc5a3
		System.out.println(CompressAString("aabccccca"));// a2blc5a1
		System.out.println(CompressAString("aabbcccccaaa"));// a2b2c5a3
	}

	// TODO Later simplify your solution
	public static String CompressAString(String s) {
		StringBuilder newStringBuilder = new StringBuilder("");
		int counter = 1;
		for (int i = 1; i < s.length(); i++) {
			char char1 = s.charAt(i - 1);
			char char2 = s.charAt(i);
			if (char1 == char2) {
				counter++;
				if (i == s.length() - 1) {
					newStringBuilder.append(char1);
					newStringBuilder.append(counter);
				}
			} else {
				newStringBuilder.append(char1);
				newStringBuilder.append(counter);
				counter = 1;

				if (i == s.length() - 1) {
					newStringBuilder.append(char2);
					newStringBuilder.append(counter);
				}
			}
		}
		return newStringBuilder.toString();
	}

}
