package chapter07;

import java.util.HashSet;
import java.util.Scanner;

public class Exercise07_05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");

		int[] numbers = new int[10];

		HashSet<Integer> numberSet = new HashSet<>();

		for (int i = 0; i < 10; i++) {
			numberSet.add(input.nextInt());

		}
		
		System.out.println("The number of distinct number is "+ numberSet.size());
		System.out.print("The distinct numbers are "+numberSet.toString());

	}

}
