package chapter07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise07_17 {

	public static void main(String[] args) {

		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter number of students: ");
		int studentNumber = inputScanner.nextInt();

		System.out.println();

		ArrayList<Student> students = new ArrayList<>();

		for (int i = 0; i < studentNumber; i++) {
			System.out.print("Enter student name: ");
			String name = inputScanner.next();

			System.out.print("Enter student score: ");
			int score = inputScanner.nextInt();

			students.add(new Student(name, score));
		}

		Collections.sort(students);

		System.out.println();
		for (Student s : students) {
			System.out.println(s.getName() + "   " + s.getScore());
		}

	}

}

class Student implements Comparable<Student> {
	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(Student s) {

		return s.getScore() - this.getScore();

	}

}
