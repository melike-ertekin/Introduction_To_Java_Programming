package interviewQuestions;

import java.util.Arrays;

public class ToLowerCase {

	public static void main(String[] args) {
		/*
		 * Implement function ToLowerCase() that has a string parameter str, and returns
		 * the same string in lowercase (https://leetcode.com/problems/to-lower-case/)
		 * 
		 * HelLo => hello
		 */

		System.out.println(toLowerCase("HelLo"));
		System.out.println(toLowerCase2("HelLo"));
		System.out.println(toLowerCase3("HelLo"));

	}

	public static String toLowerCase(String s) {

		char fark = 'a' - 'A';

		StringBuilder stringBuilder = new StringBuilder("");

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {

				stringBuilder.append(String.valueOf(((char) (s.charAt(i) + fark))));

			} else {

				stringBuilder.append(String.valueOf((char) s.charAt(i)));
			}
		}

		return stringBuilder.toString();
	}

	public static String toLowerCase2(String s) {

		char fark = 'a' - 'A';
		char[] arr = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				arr[i] = (char) (s.charAt(i) + fark);

			} else {
				arr[i] = s.charAt(i);
			}
		}

		return String.copyValueOf(arr);
	}

	public static String toLowerCase3(String s) {

		char fark = 'a' - 'A';
		char[] arr = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				arr[i] = (char) (s.charAt(i) + fark);

			}
		}

		return String.copyValueOf(arr);
	}

}
