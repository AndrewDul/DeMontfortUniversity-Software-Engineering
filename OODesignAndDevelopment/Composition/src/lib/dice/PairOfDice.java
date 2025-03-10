package lib.dice;

/**
 * 
 * A pair of dice is a composition of two Die instances.
 * 
 * @author la
 */

public class PairOfDice implements Rollable {
	
	//Fields
	private Die red;
	private Die blue;
	
	
	//Constructors
	public PairOfDice() {
		red = new Die();
		blue = new Die();
	}
	
	public PairOfDice(Die red, Die blue) {
		this.red = red;
		this.blue = blue;
	}
	
	
	//Methods
	@Override
	public void roll() {
		red.roll();
		blue.roll();
	}
	
	@Override
	public int getScore() {
		return red.getScore() + blue.getScore();
	}
	
	public Die getRed() {
		return red;
	}

	public Die getBlue() {
		return blue;
	}
	
	@Override
	public String toString() {
		return "PairOfDice:[red=" + red + ", blue=" + blue + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		return (obj instanceof PairOfDice other)
				&& this.blue.equals(other.blue) 
				&& this.red.equals(other.red);
	}

}
