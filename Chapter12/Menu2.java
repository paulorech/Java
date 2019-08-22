package Chapter12;

import javax.swing.*;

public class Menu2 {
	
	protected String[] entreeChoices = {"Rosemary Chicken", "Beef Wellington", "Maine Lobster"};
	private String menu = "";
	private int choice;
	protected char initials[] = new char[entreeChoices.length];
	
	public String displayMenu() throws MenuException {
		for (int x=0; x< entreeChoices.length; x++) {
			menu = menu + "\n" + (x+1) + " for " + entreeChoices[x];
			initials[x] = entreeChoices[x].charAt(0);
		}
		String input = JOptionPane.showInputDialog(null,"Enter your selection, then press Enter." + menu);
		choice = Integer.parseInt(input);
		for (int y = 0; y< entreeChoices.length;y++)
			if(input.charAt(0) == initials[y])
				throw (new MenuException(entreeChoices[y]));
		return(entreeChoices[choice - 1]);
	}

}
