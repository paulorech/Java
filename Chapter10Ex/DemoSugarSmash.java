package Chapter10Ex;

public class DemoSugarSmash {

	public static void main(String[] args) {

		
		//Instantiating Sugar Player
		
		SugarSmashPlayer sugarPlayer = new SugarSmashPlayer();
		
		sugarPlayer.setId(123);
		sugarPlayer.setScores(50, 2);
		sugarPlayer.setScores(70, 1);
		sugarPlayer.setScores(135, 11);
		
		System.out.println("Sugar Smash Player Score");
		System.out.println("Sugar Player ID: " + sugarPlayer.getId());
		System.out.println("Score: " + sugarPlayer.getScores(0, 0));
		System.out.println("Score: " + sugarPlayer.getScores(0,0));
		System.out.println("Score: " + sugarPlayer.getScores(0,0));
		
		//instantiating Premium Player
		System.out.println();
		
		PremiumSugarSmashPlayer premiumPlayer = new PremiumSugarSmashPlayer(3.00);
		
		premiumPlayer.setId(321);
		premiumPlayer.setScores(15,0);
		premiumPlayer.setScores(50,1);
		premiumPlayer.setScores(20,2);
		
		System.out.println("Premium user score who pay $3.00");
		System.out.println("Premium Sugar Smash Player Score");
		System.out.println("Premium Player ID: " + sugarPlayer.getId());
		System.out.println("Score: " + premiumPlayer.getScores(0));
		System.out.println("Score: " + premiumPlayer.getScores(1));
		System.out.println("Score: " + premiumPlayer.getScores(2));
		

	}

}
