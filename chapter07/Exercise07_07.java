package chapter07;

public class Exercise07_07 {

	public static void main(String[] args) {
		int[] counterArray = new int[10];

		for (int i = 0; i < 100; i++) {

			int ran_num = (int) (Math.random() * 10);

			counterArray[ran_num] = counterArray[ran_num] + 1;
		}

		for (int i = 0; i < counterArray.length; i++) {
			System.out.println(i + ": " + counterArray[i]);
		}

	}

}
