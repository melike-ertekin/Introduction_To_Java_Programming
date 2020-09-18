package interviewQuestions;

public class RemoveChar {

	public static void main(String[] args) {

		System.out.println(remoceSecondString("abcddddaa", "adc"));
	}

	public static String remoceSecondString(String s1, String s2) {

		for (int i = 0; i < s2.length(); i++) {
			for (int m = 0; m < s1.length(); m++) {
				if (s1.charAt(m) == s2.charAt(i)) {
					s1 = s1.substring(0, m) + s1.substring(m + 1);
					m--;
				}

			}
		}
		return s1;

	}

}
