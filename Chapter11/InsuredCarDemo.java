package Chapter11;

import javax.swing.JOptionPane;

public class InsuredCarDemo {

	public static void main(String[] args) {

		InsuredCar myCar = new InsuredCar();
		
		JOptionPane.showMessageDialog(null, myCar.toString());

	}

}
