package Chapter11Ex;

public class Fiction extends Book{
	
	public Fiction(String title) {
		super(title);
		setPrice();
	}
	
	@Override
	public void setPrice() {
		price = 24.99;
	}
	
	public String toString() {
		return "Title: " + getTitle() + " , Price: $" + getPrice();
	}

}
