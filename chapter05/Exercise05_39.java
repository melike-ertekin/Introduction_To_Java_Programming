package chapter05;

public class Exercise05_39 {

	public static void main(String[] args) {

		double goalSalary = 30000;
		double baseSalary = 5000;
		double commission = goalSalary - baseSalary;

		System.out.println("Goal Salary: " + goalSalary);
		System.out.println("Base Salary: " + baseSalary);
		System.out.println("Commission: " + commission);
		System.out.printf("Sales Amount: %.1f", computeSalesAmount(commission));

	}

	public static double computeSalesAmount(double commission) {
		double salesAmount = 0;

		if (commission > 900.12) {

			salesAmount = ((commission - 900) / 0.12) + 10000;
		} else if (commission > 400.1) {

			salesAmount = ((commission - 400) / 0.10) + 5000;
		} else if (commission > 0) {

			salesAmount = commission / 0.08;
		} else {
			salesAmount = 0;
		}

		return salesAmount;
	}

}
