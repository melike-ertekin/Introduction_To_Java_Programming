package chapter04;

public class Exercise04_06 {

	public static void main(String[] args) {
		
		int r = 40;

		double angle1 = Math.random() * 360;
		double x1 = r * Math.cos( Math.toRadians(angle1));
		double y1 = r * Math.sin(Math.toRadians(angle1));
		System.out.println("(" + x1 + ", " + y1 + ")");
		
		double angle2 = Math.random() * 360;
		double x2 = r * Math.cos( Math.toRadians(angle2));
		double y2 = r * Math.sin(Math.toRadians(angle2));
		System.out.println("(" + x2 + ", " + y2 + ")");
		
		double angle3 = Math.random() * 360;
		double x3 = r * Math.cos( Math.toRadians(angle3));
		double y3 = r * Math.sin(Math.toRadians(angle3));
		System.out.println("(" + x3 + ", " + y3 + ")");
	}

}
