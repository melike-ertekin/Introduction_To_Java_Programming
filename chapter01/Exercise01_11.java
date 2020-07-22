package chapter01;

public class Exercise01_11 {
		public static void main(String[] args) {
			
			int currentPop = 312032486;
			int changeOfPop = (365*24*60*60/7) - (365*24*60*60/13) + (365*24*60*60/45);
			
			System.out.println("Year-1: "+ (currentPop + changeOfPop));
			System.out.println("Year-2: "+ (currentPop + changeOfPop * 2));
			System.out.println("Year-3: "+ (currentPop + changeOfPop * 3));
			System.out.println("Year-4: "+ (currentPop + changeOfPop * 4));
			System.out.println("Year-5: "+ (currentPop + changeOfPop * 5));
			
		}

}
