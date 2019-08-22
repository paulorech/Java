package Chapter10Ex;

public class SugarSmashPlayer {
	protected int id;
	protected String screenName;
	private int[] scores = new int[10];
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
		
	}
	public int getScores(int score, int gameLevel) {
		
		if(gameLevel >= 0 && gameLevel < scores.length) {
			return scores[gameLevel];
		} else {
			System.out.println("Invalid game level");
			return -1;
		}
	}
	
	
	public void setScores(int score, int gameLevel) {
		boolean validScores = false;
		if (gameLevel==0) {
			scores[0]=score;
		} else {
			for (int i = 0; i < gameLevel && !validScores; i++) {
				if (scores[i]>100) {
					validScores = true;
				}
			}
			if (validScores) {
				scores[gameLevel] = score;
			} else { 
				scores[0] = score;
				System.out.println("Invalid Score");
			}
		}
	}
	
	
}
