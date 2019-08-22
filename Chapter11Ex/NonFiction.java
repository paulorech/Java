package Chapter11Ex;

public class NonFiction extends Book{
	
	public NonFiction(String title) {
		super(title);
		setPrice();
	}

	@Override
	public void setPrice() {
		price = 37.99;
	}
	
	public String toString() {
		return "Title: " + getTitle() + " , Price = $" + getPrice();
	}


}
