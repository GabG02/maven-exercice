package io.github.gabg02;

// TODO: Auto-generated Javadoc
/**
 * The Class TripletOfDice.
 */
public class TripletOfDice {
	
	
	/** The nb side dice. */
	private int nbSidesDice;
	
	/** The dies. */
	private Integer[] dies = new Integer[3];
	
	/**
	 * Instantiates a new triplet of dice.
	 *
	 * @param nbSides the nb sides
	 */
	public TripletOfDice(int  nbSides) {
		if(nbSides<1) {
			throw new IllegalArgumentException("Your Die must have at least one side");
		}
		this.nbSidesDice = nbSides;
	}

	/**
	 * Gets the random value between 1 and nbSidesDice
	 *
	 * @return int the random value
	 */
	private int getRandomValue() {
		return (int)(Math.random()*this.nbSidesDice) + 1;
	}
	
	/**
	 * Roll one die. (0 -> First Die)
	 * 				 (1 -> Second Die)
	 *				 (2 -> Third Die)
	 * @param numDie the num die between 0 and 2 
	 */
	public void rollOneDie(int numDie) {
		if(numDie>=0 && numDie<3) {
			dies[numDie]=getRandomValue();
		}else {
			System.out.println("Le nombre de dé est entre 1 et 3");
		}
	}
	
	/**
	 * Roll all dices.
	 */
	public void rollAllDices() {
		for (int i = 0; i<dies.length;i++) {
			rollOneDie(i);
		}
	}
	
	/**
	 * Gets the first die value.
	 *
	 * @return the first die
	 */
	public int getFirstDie(){
		return dies[0];
	}
	
	/**
	 * Gets the second die value.
	 *
	 * @return the second die
	 */
	public int getSecondDie(){
		return dies[1];
	}
	
	/**
	 * Gets the third die value.
	 *
	 * @return the third die
	 */
	public int getThirdDie(){
		return dies[2];
	}
}
