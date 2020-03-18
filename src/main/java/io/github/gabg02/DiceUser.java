package io.github.gabg02;

public class DiceUser {

		private static TripletOfDice t = new TripletOfDice(16);
	public static void main() {
		System.out.println("The die number 1 is a "+t.getFirstDie());
		System.out.println("The die number 2 is a "+t.getSecondDie());
		System.out.println("The die number 3 is a "+t.getThirdDie());
	}
	
	private static void rollOnce() {
		t.rollAllDices();
	}
}
