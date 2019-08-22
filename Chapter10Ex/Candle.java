package Chapter10Ex;

public class Candle {
	
	String color;
	
	double height;
	
	double price;

	public Candle(String color, double height) {
		setColor(color);
		setHeight(height);
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
		price = 2 * height;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return "Candle: \nColor: " + 
				getColor() + "\nHeight: " + getHeight()+ "\nCost: " + getPrice();	
	}
	
	

}
