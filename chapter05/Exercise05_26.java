package chapter05;

import com.sun.net.httpserver.Authenticator.Result;

public class Exercise05_26 {

	public static void main(String[] args) {

		/*double fac;
		double result;

		for (int input = 10000; input <= 100000; input += 10000) {
			result = 1;

			for (int num = 1; num <= input; num++) {
				fac = 1;

				for (int i = 1; i <= num; i++) {
					fac *= i;

				}
				result += 1 / fac;
			}
			System.out.println("The e is " + result + " for i = " + input);
		}
*/
		double e = 1;
		double item = 1;
		for (int i = 1; i <= 100000; i++) {
			item = item / i;
			e = item + e;
			if (i == 10000 || i == 20000 || i == 30000 || i == 40000 || i == 50000 || i == 60000 || i == 70000
					|| i == 80000 || i == 90000 || i == 100000)
				System.out.println("e is " + e + " for i = " + i);
		}

	}
}
