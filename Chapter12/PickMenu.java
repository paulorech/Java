package Chapter12;

import javax.swing.*;

public class PickMenu {
	
		private Menu briefMenu;
		private String guestChoice = new String();
		
	public PickMenu(Menu theMenu) {
			briefMenu = theMenu;
			setGuestChoice();
		}

	private void setGuestChoice() {
		JOptionPane.showMessageDialog(null,"Choose from the following menu: ");
		guestChoice = briefMenu.displayMenu();
	}
	
	String getGuestChoice() {
		return (guestChoice);
	}

}
