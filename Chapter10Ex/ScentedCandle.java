package Chapter10Ex;

public class ScentedCandle extends Candle{

	String scent;
	
	public ScentedCandle(String color, double height, String scent) {
		setColor(color);
		setHeight(height);
		setScent(scent);
	}

	public String getScent() {
		return scent;
	}

	public void setScent(String scent) {
		this.scent = scent;
	}
	
	@Override
	public void setHeight(double height) {
		super.height = height;
		super.price = 3 * height;
	}
	
	public String toString() {
		return "Scented Candle: \nScent: " + getScent() + "\nColor: " + 
				getColor() + "\nHeight: " + getHeight()+ "\nCost: " + getPrice();	
	}
	
	
}
