package interviewQuestions;

import java.util.HashSet;

public class HW_01_IsUnique {

	/*
	 * Is Unique: Implement an algorithm to determine if a string has all unique
	 * characters. Inar -> true Los Angeles -> false (ee)
	 */
	public static void main(String[] args) {

		System.out.println(isUnique("Inar"));
		System.out.println(isUnique("Los Angeles"));
	}

	public static boolean isUnique(String word) {

		HashSet<Character> set = new HashSet<>();

		for (int i = 0; i < word.length(); i++) {
			set.add(word.charAt(i));
		}

		return set.size() == word.length();
	}

}
