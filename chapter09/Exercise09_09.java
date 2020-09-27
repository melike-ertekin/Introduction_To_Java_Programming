package chapter09;

public class Exercise09_09 {

	public static void main(String[] args) {

		RegularPolygon poly0 = new RegularPolygon();
		RegularPolygon poly1 = new RegularPolygon(6, 4);
		RegularPolygon poly2 = new RegularPolygon(10, 4, 5.6, 7.8);

		System.out.println("#Polygon-1\n" + poly0 + "\n");
		System.out.println("#Polygon-2\n" + poly1 + "\n");
		System.out.println("#Polygon-3\n" + poly2 + "\n");

	}

}
