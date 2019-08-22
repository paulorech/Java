package Chapter11Ex;

public class BookArray {
	
	public static void main(String[] args) {
		
		Book bookArray[] = {new Fiction("La Casa de los Padres"),
		new Fiction("Game of Thrones"),
		new Fiction("Outlander"),
		new Fiction("House of Tomorrow"),
		new Fiction("La Traviata"),
		new NonFiction("Unfuck Yourself"),
		new NonFiction("You can sell more"),
		new NonFiction("Jamaica"),
		new NonFiction("Homo Deus"),
		new NonFiction("Sapiens")};
		
		
		for(int x=0; x< bookArray.length; x++) {
			System.out.println(bookArray[x].toString());
		}
		
		
	}

}
