public class Car {

	public enum Color {BLACK, BLUE, GREEN, RED, WHITE, YELLOW};
	public enum Model {SEDAN, CONVERTIBLE, MINIVAN};
	
	private int year;
	private Model model;
	private Color color;
	
	
	
	
	public Car (int yr, Model convertible, Color red) {
		year = yr;
		model = convertible;
		color = red;
	}
	
	public void display() {
		System.out.println("Car is a " + year + " " + color + " " + model );
	}
}
