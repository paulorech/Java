package Chapter12;

import javax.swing.*;

public class PickMenu2 {
	
		private Menu2 briefMenu;
		private String guestChoice = new String();
		
	public PickMenu2 (Menu2 theMenu) throws MenuException {
			briefMenu = theMenu;
			setGuestChoice();
		}

	private void setGuestChoice() throws MenuException {
		JOptionPane.showMessageDialog(null,"Choose from the following menu: ");
		guestChoice = briefMenu.displayMenu();
	}
	
	String getGuestChoice() {
		return (guestChoice);
	}

}
