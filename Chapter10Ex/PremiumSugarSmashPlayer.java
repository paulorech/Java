package Chapter10Ex;

public class PremiumSugarSmashPlayer extends SugarSmashPlayer {

	private int[] scores = new int[50];
	private double pay;
	private boolean accessLevel;
	
	
	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public boolean isAccessLevel() {
		return accessLevel;
	}

	public void setAccessLevel(boolean accessLevel) {
		this.accessLevel = accessLevel;
	}

	public PremiumSugarSmashPlayer(double pay) {
		super();
		this.pay = pay;
		if(pay>2.99) {
			accessLevel = true;
		} 
		else {
			accessLevel = false;
		}
		
	}
	
	public int getScores(int gameLevel) {
		
		if (gameLevel > 0 && gameLevel < scores.length) {
			return scores[gameLevel];
		} else {
			System.out.println("Invalid Game level");
			return -1;
		}
	}

	public void setScores(int score, int gameLevel) {

		if (accessLevel) {
			if (gameLevel < 0 || gameLevel > scores.length) {
				System.out.println("Invalid game level");
			}
			else {
				scores[gameLevel] = score;
			}
		} else {
			System.out.println("Pay 2.99 to access all levels");
		}
	}
}
