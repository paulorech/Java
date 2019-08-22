
public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car firstCar = new Car(2014, Car.Model.MINIVAN , Car.Color.BLUE );
		Car secondCar = new Car(2017, Car.Model.CONVERTIBLE, Car.Color.RED );
		
		firstCar.display();
		secondCar.display();

	}

}
