package interviewQuestions;

public class ReoccuringChar {

	public static void main(String[] args) {

		System.out.println(findReoccuringChar("bisiklet"));
		System.out.println(findReoccuringChar("abcda"));
		System.out.println(findReoccuringChar2("abcda"));
	}

	public static char findReoccuringChar(String s) {

		for (int i = 0; i < s.length() - 1; i++) {
			for (int m = i + 1; m < s.length(); m++) {
				if (s.charAt(i) == s.charAt(m)) {
					return s.charAt(i);

				}

			}
		}
		return ' ';

	}

	public static char findReoccuringChar2(String s) {

		String tempString = "";
		for (int i = 0; i < s.length(); i++) {
			if (!tempString.contains("" + s.charAt(i))) {
				tempString = tempString + s.charAt(i);
			} else {
				return s.charAt(i);
			}
		}
		return ' ';

	}
}
