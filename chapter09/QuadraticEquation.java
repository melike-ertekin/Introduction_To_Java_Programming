package chapter09;

public class QuadraticEquation {
	private double a;
	private double b;
	private double c;

	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	double getDiscriminant() {
		return b * b - 4 * a * c;
	}

	double getRoot1() {
		if (getDiscriminant() < 0)
			return 0;
		else {
			return (-b + getDiscriminant()) / (2 * a);
		}
	}

	double getRoot2() {
		if (getDiscriminant() < 0)
			return 0;
		else {
			return (-b - getDiscriminant()) / (2 * a);
		}
	}
}
