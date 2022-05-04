package mealTime;

public class mealTime {

	public static void main(String[] args) {
		
		boolean breakfastTime = false;
		
		boolean lunchTime = false;
		
		boolean dinnerTime = true;
		
		if (breakfastTime) {
			System.out.println("Pancakes!");
		}
		
		else if (lunchTime) {
			System.out.println("Sandwiches!");
		}
		
		else if (dinnerTime) {
			System.out.println("Pizza!");
		}
		
		else {
			System.out.println("It's not time to eat.");
		}
		
	}
}
