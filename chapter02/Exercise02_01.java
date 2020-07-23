package chapter02;

import java.util.Scanner;

public class Exercise02_01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Celcius: ");
		double celsius = input.nextDouble();
		
		double fahrenheit = celsius * 9 / 5.0  + 32;
		
		System.out.println(celsius + " Celcius is " + fahrenheit + " Fahrenheit.");

	}

}
