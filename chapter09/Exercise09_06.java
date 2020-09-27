package chapter09;

public class Exercise09_06 {

	public static void main(String[] args) {

		double[] list = new double[100000];

		for (int i = 0; i < list.length; i++) {
			list[i] = Math.random() * list.length;
		}

		StopWatch stopWatch = new StopWatch();
		selectionSort(list);
		stopWatch.stop();

		System.out.println("The sort time: " + stopWatch.getElapsedTime());
	}

	public static void selectionSort(double[] list) {
		for (int i = 0; i < list.length - 1; i++) {

			double currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}

	}

}
