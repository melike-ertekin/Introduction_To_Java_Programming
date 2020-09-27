package chapter09;

public class Location {

	public int row; 
	public int column; 
	public double maxValue; 


	public Location(double[][] arr) {
		maxValue = arr[0][0];
		
		row = 0;
		column = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > maxValue) {
					maxValue = arr[i][j];
					row = i;
					column = j;
				}
			}
		}
	}
}
