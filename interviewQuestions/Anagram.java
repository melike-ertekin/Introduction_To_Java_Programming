package interviewQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class Anagram {

	public static void main(String[] args) {

		System.out.println(Anagram1("mell", "leml"));
		System.out.println(Anagram1("mel", "lem"));
		System.out.println(Anagram2("mell", "lmel"));
		System.out.println(Anagram2("mel", "lme"));
		System.out.println(Anagram1("mel", "lme "));
		System.out.println(Anagram2("mel", "lme "));
		System.out.println(Anagram3("mel", "lme"));
		System.out.println(Anagram3("melc", "lmed"));

	}

	public static boolean Anagram1(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		} else {

			ArrayList<Character> array = new ArrayList<>();

			for (int i = 0; i < s1.length(); i++) {
				array.add(s1.charAt(i));
			}

			for (int i = 0; i < s2.length(); i++) {
				for (int j = 0; j < array.size(); j++) {
					if (s2.charAt(i) == array.get(j)) {
						array.remove(j);
						j--;
					}
				}
			}

			if (array.size() == 0) {
				return true;
			}
		}

		return true;
	}

	public static boolean Anagram2(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		} else {

			ArrayList<Character> array1 = new ArrayList<>();
			ArrayList<Character> array2 = new ArrayList<>();

			for (int i = 0; i < s1.length(); i++) {
				array1.add(s1.charAt(i));
			}
			for (int i = 0; i < s2.length(); i++) {
				array2.add(s2.charAt(i));
			}

			Collections.sort(array1);
			Collections.sort(array2);

			for (int j = 0; j < array1.size(); j++) {
				if (array1.get(j) != array2.get(j)) {
					return false;
				}
			}

		}

		return true;
	}

	public static boolean Anagram3(String s1, String s2) {

		int[] letters = new int[26];
		char a = 'a';

		for (int i = 0; i < s1.length(); i++) {
			letters[s1.charAt(i) - a]++;
		}

		for (int i = 0; i < s2.length(); i++) {
			letters[s2.charAt(i) - a]--;
		}

		for (int i = 0; i < letters.length; i++) {
			if (letters[i] != 0) {
				return false;
			}
		}

		return true;

	}

}
